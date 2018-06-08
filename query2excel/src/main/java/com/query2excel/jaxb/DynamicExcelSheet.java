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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DynamicExcelSheet complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DynamicExcelSheet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pre-exec-sql" type="{}PreExecSql"/>
 *         &lt;element name="excel-sheet-templet" type="{}ExcelSheetTemplet" maxOccurs="unbounded"/>
 *         &lt;element name="case-condition" type="{}CaseCondition" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="use-yn" type="{}YnType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicExcelSheet", propOrder = {
    "preExecSql",
    "excelSheetTemplet",
    "caseCondition"
})
public class DynamicExcelSheet {

    @XmlElement(name = "pre-exec-sql", required = true)
    protected PreExecSql preExecSql;
    @XmlElement(name = "excel-sheet-templet", required = true)
    protected List<ExcelSheetTemplet> excelSheetTemplet;
    @XmlElement(name = "case-condition", required = true)
    protected List<CaseCondition> caseCondition;
    @XmlAttribute(name = "comment")
    protected String comment;
    @XmlAttribute(name = "use-yn")
    protected String useYn;

    /**
     * preExecSql 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PreExecSql }
     *     
     */
    public PreExecSql getPreExecSql() {
        return preExecSql;
    }

    /**
     * preExecSql 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PreExecSql }
     *     
     */
    public void setPreExecSql(PreExecSql value) {
        this.preExecSql = value;
    }

    /**
     * Gets the value of the excelSheetTemplet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excelSheetTemplet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcelSheetTemplet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExcelSheetTemplet }
     * 
     * 
     */
    public List<ExcelSheetTemplet> getExcelSheetTemplet() {
        if (excelSheetTemplet == null) {
            excelSheetTemplet = new ArrayList<ExcelSheetTemplet>();
        }
        return this.excelSheetTemplet;
    }

    /**
     * Gets the value of the caseCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseCondition }
     * 
     * 
     */
    public List<CaseCondition> getCaseCondition() {
        if (caseCondition == null) {
            caseCondition = new ArrayList<CaseCondition>();
        }
        return this.caseCondition;
    }

    /**
     * comment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * comment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * useYn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseYn() {
        return useYn;
    }

    /**
     * useYn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseYn(String value) {
        this.useYn = value;
    }

}
