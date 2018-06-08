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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SubtitutionVariables complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SubtitutionVariables">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delimeter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="values" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logging-scope" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="title-apply-yn" type="{}YnType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="create-method" type="{}SubVarsCreateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubtitutionVariables", propOrder = {
    "delimeter",
    "values",
    "loggingScope",
    "titleApplyYn"
})
public class SubtitutionVariables {

    @XmlElement(required = true)
    protected String delimeter;
    @XmlElement(required = true)
    protected String values;
    @XmlElement(name = "logging-scope")
    protected BigDecimal loggingScope;
    @XmlElement(name = "title-apply-yn")
    protected String titleApplyYn;
    @XmlAttribute(name = "create-method")
    protected String createMethod;

    /**
     * delimeter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimeter() {
        return delimeter;
    }

    /**
     * delimeter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimeter(String value) {
        this.delimeter = value;
    }

    /**
     * values 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValues() {
        return values;
    }

    /**
     * values 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValues(String value) {
        this.values = value;
    }

    /**
     * loggingScope 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoggingScope() {
        return loggingScope;
    }

    /**
     * loggingScope 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoggingScope(BigDecimal value) {
        this.loggingScope = value;
    }

    /**
     * titleApplyYn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleApplyYn() {
        return titleApplyYn;
    }

    /**
     * titleApplyYn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleApplyYn(String value) {
        this.titleApplyYn = value;
    }

    /**
     * createMethod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateMethod() {
        return createMethod;
    }

    /**
     * createMethod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateMethod(String value) {
        this.createMethod = value;
    }

}
