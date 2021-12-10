
package org.soa.ws.tp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for toUpperStringResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="toUpperStringResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="toUpper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toUpperStringResponse", propOrder = {
    "toUpper"
})
public class ToUpperStringResponse {

    protected String toUpper;

    /**
     * Gets the value of the toUpper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToUpper() {
        return toUpper;
    }

    /**
     * Sets the value of the toUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToUpper(String value) {
        this.toUpper = value;
    }

}
