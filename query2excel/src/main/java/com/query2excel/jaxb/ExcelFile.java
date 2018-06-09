//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.6 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.11.19 시간 09:32:17 AM KST 
//


package com.query2excel.jaxb;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExcelFile complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ExcelFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exist-file-delete-yn" type="{}YnType"/>
 *         &lt;element name="file-path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="file-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date-format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date-offset" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="explain-plan-logging-yn" type="{}YnType"/>
 *         &lt;element name="nodata-comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcelFile", propOrder = {
    "existFileDeleteYn",
    "filePath",
    "fileName",
    "dateFormat",
    "dateOffset",
    "explainPlanLoggingYn",
    "nodataComment"
})
public class ExcelFile {

    @XmlElement(name = "exist-file-delete-yn", required = true)
    protected String existFileDeleteYn;
    @XmlElement(name = "file-path", required = true)
    protected String filePath;
    @XmlElement(name = "file-name", required = true)
    protected String fileName;
    @XmlElement(name = "date-format")
    protected String dateFormat;
    @XmlElement(name = "date-offset")
    protected BigDecimal dateOffset;
    @XmlElement(name = "explain-plan-logging-yn", required = true)
    protected String explainPlanLoggingYn;
    @XmlElement(name = "nodata-comment")
    protected String nodataComment;

    /**
     * existFileDeleteYn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistFileDeleteYn() {
        return existFileDeleteYn;
    }

    /**
     * existFileDeleteYn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistFileDeleteYn(String value) {
        this.existFileDeleteYn = value;
    }

    /**
     * filePath 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * filePath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * fileName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * fileName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * dateFormat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * dateFormat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * dateOffset 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDateOffset() {
        return dateOffset;
    }

    /**
     * dateOffset 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDateOffset(BigDecimal value) {
        this.dateOffset = value;
    }

    /**
     * explainPlanLoggingYn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplainPlanLoggingYn() {
        return explainPlanLoggingYn;
    }

    /**
     * explainPlanLoggingYn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplainPlanLoggingYn(String value) {
        this.explainPlanLoggingYn = value;
    }

    /**
     * nodataComment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodataComment() {
        return nodataComment;
    }

    /**
     * nodataComment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodataComment(String value) {
        this.nodataComment = value;
    }

	public String getResultExcelPath() {
		// TODO Auto-generated method stub
		return fileName;
	}

	public void setResultExcelPath(Object convertDirectoryDelimeter) {
		// TODO Auto-generated method stub
		
	}

	public String getTempletExcelPath() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTempletExcelPath(Object convertDirectoryDelimeter) {
		// TODO Auto-generated method stub
		
	}

	public String getEncodingType() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEncodingType(String dEFAULT_ENCODING_TYPE) {
		// TODO Auto-generated method stub
		
	}

}
