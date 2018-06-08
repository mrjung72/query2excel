//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.6 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.11.19 시간 09:32:17 AM KST 
//


package com.query2excel.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExcelSheetTemplet complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ExcelSheetTemplet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sheet-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="top-comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bottom-comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference-sql" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="substitution-variables" type="{}SubtitutionVariables" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcelSheetTemplet", propOrder = {
    "sheetName",
    "topComment",
    "bottomComment",
    "referenceSql",
    "substitutionVariables"
})
public class ExcelSheetTemplet {

    @XmlElement(name = "sheet-name", required = true)
    protected String sheetName;
    @XmlElement(name = "top-comment")
    protected String topComment;
    @XmlElement(name = "bottom-comment")
    protected String bottomComment;
    @XmlElement(name = "reference-sql", required = true)
    protected String referenceSql;
    @XmlElement(name = "substitution-variables")
    protected SubtitutionVariables substitutionVariables;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * sheetName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetName() {
        return sheetName;
    }

    /**
     * sheetName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetName(String value) {
        this.sheetName = value;
    }

    /**
     * topComment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopComment() {
        return topComment;
    }

    /**
     * topComment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopComment(String value) {
        this.topComment = value;
    }

    /**
     * bottomComment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottomComment() {
        return bottomComment;
    }

    /**
     * bottomComment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottomComment(String value) {
        this.bottomComment = value;
    }

    /**
     * referenceSql 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceSql() {
        return referenceSql;
    }

    /**
     * referenceSql 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceSql(String value) {
        this.referenceSql = value;
    }

    /**
     * substitutionVariables 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SubtitutionVariables }
     *     
     */
    public SubtitutionVariables getSubstitutionVariables() {
        return substitutionVariables;
    }

    /**
     * substitutionVariables 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SubtitutionVariables }
     *     
     */
    public void setSubstitutionVariables(SubtitutionVariables value) {
        this.substitutionVariables = value;
    }

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
