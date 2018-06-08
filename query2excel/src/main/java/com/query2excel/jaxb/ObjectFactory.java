//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.6 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.11.19 시간 09:32:17 AM KST 
//


package com.query2excel.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the q2e.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryToExcel_QNAME = new QName("", "QueryToExcel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: q2e.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateExcelDefine }
     * 
     */
    public CreateExcelDefine createCreateExcelDefine() {
        return new CreateExcelDefine();
    }

    /**
     * Create an instance of {@link PreExecSql }
     * 
     */
    public PreExecSql createPreExecSql() {
        return new PreExecSql();
    }

    /**
     * Create an instance of {@link CaseCondition }
     * 
     */
    public CaseCondition createCaseCondition() {
        return new CaseCondition();
    }

    /**
     * Create an instance of {@link ExcelSheet }
     * 
     */
    public ExcelSheet createExcelSheet() {
        return new ExcelSheet();
    }

    /**
     * Create an instance of {@link CellAttrType }
     * 
     */
    public CellAttrType createCellAttrType() {
        return new CellAttrType();
    }

    /**
     * Create an instance of {@link ExcelSheetTemplet }
     * 
     */
    public ExcelSheetTemplet createExcelSheetTemplet() {
        return new ExcelSheetTemplet();
    }

    /**
     * Create an instance of {@link CellAttrDefine }
     * 
     */
    public CellAttrDefine createCellAttrDefine() {
        return new CellAttrDefine();
    }

    /**
     * Create an instance of {@link DBConnectInfo }
     * 
     */
    public DBConnectInfo createDBConnectInfo() {
        return new DBConnectInfo();
    }

    /**
     * Create an instance of {@link SqlDefine }
     * 
     */
    public SqlDefine createSqlDefine() {
        return new SqlDefine();
    }

    /**
     * Create an instance of {@link ExcelFile }
     * 
     */
    public ExcelFile createExcelFile() {
        return new ExcelFile();
    }

    /**
     * Create an instance of {@link DynamicExcelSheet }
     * 
     */
    public DynamicExcelSheet createDynamicExcelSheet() {
        return new DynamicExcelSheet();
    }

    /**
     * Create an instance of {@link SubtitutionVariables }
     * 
     */
    public SubtitutionVariables createSubtitutionVariables() {
        return new SubtitutionVariables();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateExcelDefine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "QueryToExcel")
    public JAXBElement<CreateExcelDefine> createQueryToExcel(CreateExcelDefine value) {
        return new JAXBElement<CreateExcelDefine>(_QueryToExcel_QNAME, CreateExcelDefine.class, null, value);
    }

}
