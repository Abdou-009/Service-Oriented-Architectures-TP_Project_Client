
package org.soa.ws.tp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for toLowerString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="toLowerString">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Upper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toLowerString", propOrder = {
    "upper"
})
public class ToLowerString {

    @XmlElement(name = "Upper")
    protected String upper;

    /**
     * Gets the value of the upper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpper() {
        return upper;
    }

    /**
     * Sets the value of the upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpper(String value) {
        this.upper = value;
    }

}
