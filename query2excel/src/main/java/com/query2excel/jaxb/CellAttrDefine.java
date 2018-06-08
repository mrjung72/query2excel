//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.6 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.11.19 시간 09:32:17 AM KST 
//


package com.query2excel.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CellAttrDefine complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CellAttrDefine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{}CellAttrType"/>
 *         &lt;element name="content" type="{}CellAttrType"/>
 *         &lt;element name="comment" type="{}CellAttrType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellAttrDefine", propOrder = {
    "title",
    "content",
    "comment"
})
public class CellAttrDefine {

    @XmlElement(required = true)
    protected CellAttrType title;
    @XmlElement(required = true)
    protected CellAttrType content;
    @XmlElement(required = true)
    protected CellAttrType comment;

    /**
     * title 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CellAttrType }
     *     
     */
    public CellAttrType getTitle() {
        return title;
    }

    /**
     * title 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CellAttrType }
     *     
     */
    public void setTitle(CellAttrType value) {
        this.title = value;
    }

    /**
     * content 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CellAttrType }
     *     
     */
    public CellAttrType getContent() {
        return content;
    }

    /**
     * content 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CellAttrType }
     *     
     */
    public void setContent(CellAttrType value) {
        this.content = value;
    }

    /**
     * comment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CellAttrType }
     *     
     */
    public CellAttrType getComment() {
        return comment;
    }

    /**
     * comment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CellAttrType }
     *     
     */
    public void setComment(CellAttrType value) {
        this.comment = value;
    }

}
