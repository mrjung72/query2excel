package com.query2excel.utils;

import static javax.xml.XMLConstants.XML_NS_URI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.ValidationEventLocator;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.apache.log4j.Logger;

/**
 * JAXB 라이브러리를 사용하여 XML문서를 읽어서 자바객체로 변환한다.
 * @author sahara
 *
 */
public class XmlBinder {
	
	Logger log = Logger.getLogger(getClass().getName());
	
	static int schema_error_cnt;
	static String schema_error_msg;
	
	private File xsdFile;
	private File xmlFile;
	
	public XmlBinder(File xsdFile, File xmlFile) {
		this.xsdFile = xsdFile;
		this.xmlFile = xmlFile;
	}
	
	/**
	 * xml문서 데이터를 자바객체로 바인딩한다.
	 * @return
	 * @throws JAXBException 
	 * @throws FileNotFoundException 
	 * @throws UnsupportedEncodingException 
	 */
	public Object bindingXmltoObject() throws JAXBException, FileNotFoundException, UnsupportedEncodingException {
		
		this.log.debug("");
		this.log.debug("====================================================");
		this.log.debug(xmlFile.getAbsolutePath());
		this.log.debug("====================================================");
		
		try {
			// create a JAXBContext capable of handling classes generated into the com.query2excel.jaxb package 
			JAXBContext jc = JAXBContext.newInstance("com.query2excel.jaxb");
			
			Unmarshaller u = jc.createUnmarshaller();
			
			if(!xsdFile.exists())
				throw new FileNotFoundException(xsdFile.getAbsolutePath() + " is not found!");
			
			setValidationProcess(u);
			
			// unmarshal a po instance document into a tree of Java content
			// objects composed of classes from the com.query2excel.parse package.
			FileInputStream fis = new FileInputStream(xmlFile);
			
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			JAXBElement<?> q2dElement = (JAXBElement<?>)u.unmarshal(isr);
			
			if(XmlBinder.schema_error_cnt > 0) {
				this.log.error(XmlBinder.schema_error_msg);
				throw new JAXBException("schema error");
			}
		
			return q2dElement.getValue();
		} catch (JAXBException je) {
			this.log.error(je.getMessage(), je);
			throw je;
		} catch (FileNotFoundException fe) {
			this.log.error(fe.getMessage(), fe);
			throw fe;
		} catch (UnsupportedEncodingException ue) {
			this.log.error(ue.getMessage(), ue);
			throw ue;
		}

	}
	
	
	
	/**
	 * 지정된 XML스키마 파일의 데이터 검증을 위한 메소드
	 * @param u
	 * @throws JAXBException
	 */
	public void setValidationProcess(Unmarshaller u) throws JAXBException {
		
		SchemaFactory sf = SchemaFactory.newInstance(XML_NS_URI);
		
		try {
			Schema schema = sf.newSchema(this.xsdFile);
			u.setSchema(schema);
			u.setEventHandler(new ValidationEventHandler() {
				
				@Override
				public boolean handleEvent(ValidationEvent ve) {
					
					//ignore warnings
					if(ve.getSeverity() != ValidationEvent.WARNING) {
						ValidationEventLocator vel = ve.getLocator();
						
						XmlBinder.schema_error_msg += "\n\tLine:Col["
								+ vel.getLineNumber() + ":"
								+ vel.getColumnNumber() + "]"
								+ ve.getMessage();
						
						XmlBinder.schema_error_cnt++;
						
					}
					return true;
				}
			});
		} catch (org.xml.sax.SAXException se) {
			throw new JAXBException(se);
		}
		
	}

}
