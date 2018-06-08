//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.6 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.11.19 시간 09:32:17 AM KST 
//


package com.query2excel.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CreateExcelDefine complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CreateExcelDefine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="db-connect" type="{}DBConnectInfo"/>
 *         &lt;element name="excel-file" type="{}ExcelFile"/>
 *         &lt;element name="cell-attr" type="{}CellAttrDefine" minOccurs="0"/>
 *         &lt;element name="sql" type="{}SqlDefine" maxOccurs="unbounded"/>
 *         &lt;element name="excel-sheet" type="{}ExcelSheet" maxOccurs="unbounded"/>
 *         &lt;element name="dynamic-excel-sheet" type="{}DynamicExcelSheet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateExcelDefine", propOrder = {
    "dbConnect",
    "excelFile",
    "cellAttr",
    "sql",
    "excelSheet",
    "dynamicExcelSheet"
})
public class CreateExcelDefine {

    @XmlElement(name = "db-connect", required = true)
    protected DBConnectInfo dbConnect;
    @XmlElement(name = "excel-file", required = true)
    protected ExcelFile excelFile;
    @XmlElement(name = "cell-attr")
    protected CellAttrDefine cellAttr;
    @XmlElement(required = true)
    protected List<SqlDefine> sql;
    @XmlElement(name = "excel-sheet", required = true)
    protected List<ExcelSheet> excelSheet;
    @XmlElement(name = "dynamic-excel-sheet")
    protected DynamicExcelSheet dynamicExcelSheet;

    /**
     * dbConnect 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DBConnectInfo }
     *     
     */
    public DBConnectInfo getDbConnect() {
        return dbConnect;
    }

    /**
     * dbConnect 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DBConnectInfo }
     *     
     */
    public void setDbConnect(DBConnectInfo value) {
        this.dbConnect = value;
    }

    /**
     * excelFile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExcelFile }
     *     
     */
    public ExcelFile getExcelFile() {
        return excelFile;
    }

    /**
     * excelFile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcelFile }
     *     
     */
    public void setExcelFile(ExcelFile value) {
        this.excelFile = value;
    }

    /**
     * cellAttr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CellAttrDefine }
     *     
     */
    public CellAttrDefine getCellAttr() {
        return cellAttr;
    }

    /**
     * cellAttr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CellAttrDefine }
     *     
     */
    public void setCellAttr(CellAttrDefine value) {
        this.cellAttr = value;
    }

    /**
     * Gets the value of the sql property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sql property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSql().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SqlDefine }
     * 
     * 
     */
    public List<SqlDefine> getSql() {
        if (sql == null) {
            sql = new ArrayList<SqlDefine>();
        }
        return this.sql;
    }

    /**
     * Gets the value of the excelSheet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excelSheet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcelSheet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExcelSheet }
     * 
     * 
     */
    public List<ExcelSheet> getExcelSheet() {
        if (excelSheet == null) {
            excelSheet = new ArrayList<ExcelSheet>();
        }
        return this.excelSheet;
    }

    /**
     * dynamicExcelSheet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DynamicExcelSheet }
     *     
     */
    public DynamicExcelSheet getDynamicExcelSheet() {
        return dynamicExcelSheet;
    }

    /**
     * dynamicExcelSheet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicExcelSheet }
     *     
     */
    public void setDynamicExcelSheet(DynamicExcelSheet value) {
        this.dynamicExcelSheet = value;
    }

}
