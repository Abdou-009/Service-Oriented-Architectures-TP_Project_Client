
package org.soa.ws.tp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMaxValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMaxValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="val_1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="val_2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMaxValue", propOrder = {
    "val1",
    "val2"
})
public class GetMaxValue {

    @XmlElement(name = "val_1")
    protected double val1;
    @XmlElement(name = "val_2")
    protected double val2;

    /**
     * Gets the value of the val1 property.
     * 
     */
    public double getVal1() {
        return val1;
    }

    /**
     * Sets the value of the val1 property.
     * 
     */
    public void setVal1(double value) {
        this.val1 = value;
    }

    /**
     * Gets the value of the val2 property.
     * 
     */
    public double getVal2() {
        return val2;
    }

    /**
     * Sets the value of the val2 property.
     * 
     */
    public void setVal2(double value) {
        this.val2 = value;
    }

}
