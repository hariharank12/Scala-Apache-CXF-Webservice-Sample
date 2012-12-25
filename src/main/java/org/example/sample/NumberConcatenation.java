
package org.example.sample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="i1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="i2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "i1",
    "i2"
})
@XmlRootElement(name = "numberConcatenation")
public class NumberConcatenation {

    protected int i1;
    protected int i2;

    /**
     * Gets the value of the i1 property.
     * 
     */
    public int getI1() {
        return i1;
    }

    /**
     * Sets the value of the i1 property.
     * 
     */
    public void setI1(int value) {
        this.i1 = value;
    }

    /**
     * Gets the value of the i2 property.
     * 
     */
    public int getI2() {
        return i2;
    }

    /**
     * Sets the value of the i2 property.
     * 
     */
    public void setI2(int value) {
        this.i2 = value;
    }

}
