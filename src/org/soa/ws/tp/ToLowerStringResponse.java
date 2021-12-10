
package org.soa.ws.tp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for toLowerStringResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="toLowerStringResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="toLower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toLowerStringResponse", propOrder = {
    "toLower"
})
public class ToLowerStringResponse {

    protected String toLower;

    /**
     * Gets the value of the toLower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToLower() {
        return toLower;
    }

    /**
     * Sets the value of the toLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToLower(String value) {
        this.toLower = value;
    }

}
