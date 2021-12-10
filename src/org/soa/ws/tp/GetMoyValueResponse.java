
package org.soa.ws.tp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMoyValueResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMoyValueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Moy" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMoyValueResponse", propOrder = {
    "moy"
})
public class GetMoyValueResponse {

    @XmlElement(name = "Moy")
    protected double moy;

    /**
     * Gets the value of the moy property.
     * 
     */
    public double getMoy() {
        return moy;
    }

    /**
     * Sets the value of the moy property.
     * 
     */
    public void setMoy(double value) {
        this.moy = value;
    }

}
