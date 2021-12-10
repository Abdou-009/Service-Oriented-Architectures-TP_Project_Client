
package org.soa.ws.tp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMoyValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMoyValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="val_1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="val_2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="val_3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="val_4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMoyValue", propOrder = {
    "val1",
    "val2",
    "val3",
    "val4"
})
public class GetMoyValue {

    @XmlElement(name = "val_1")
    protected double val1;
    @XmlElement(name = "val_2")
    protected double val2;
    @XmlElement(name = "val_3")
    protected double val3;
    @XmlElement(name = "val_4")
    protected double val4;

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

    /**
     * Gets the value of the val3 property.
     * 
     */
    public double getVal3() {
        return val3;
    }

    /**
     * Sets the value of the val3 property.
     * 
     */
    public void setVal3(double value) {
        this.val3 = value;
    }

    /**
     * Gets the value of the val4 property.
     * 
     */
    public double getVal4() {
        return val4;
    }

    /**
     * Sets the value of the val4 property.
     * 
     */
    public void setVal4(double value) {
        this.val4 = value;
    }

}
