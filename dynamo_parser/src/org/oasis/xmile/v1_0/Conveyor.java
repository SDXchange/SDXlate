//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 12:14:36 AM CST 
//


package org.oasis.xmile.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;all>
 *         &lt;element name="len" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sample" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="discrete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="batch_integrity" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="one_at_a_time" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="exponential_leak" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "conveyor")
public class Conveyor {

    protected String len;
    protected String capacity;
    @XmlElement(name = "in_limit")
    protected String inLimit;
    protected String sample;
    protected String arrest;
    @XmlAttribute(name = "discrete")
    protected Boolean discrete;
    @XmlAttribute(name = "batch_integrity")
    protected Boolean batchIntegrity;
    @XmlAttribute(name = "one_at_a_time")
    protected Boolean oneAtATime;
    @XmlAttribute(name = "exponential_leak")
    protected Boolean exponentialLeak;

    /**
     * Gets the value of the len property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLen() {
        return len;
    }

    /**
     * Sets the value of the len property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLen(String value) {
        this.len = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapacity(String value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the inLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLimit() {
        return inLimit;
    }

    /**
     * Sets the value of the inLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLimit(String value) {
        this.inLimit = value;
    }

    /**
     * Gets the value of the sample property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSample() {
        return sample;
    }

    /**
     * Sets the value of the sample property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSample(String value) {
        this.sample = value;
    }

    /**
     * Gets the value of the arrest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrest() {
        return arrest;
    }

    /**
     * Sets the value of the arrest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrest(String value) {
        this.arrest = value;
    }

    /**
     * Gets the value of the discrete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDiscrete() {
        if (discrete == null) {
            return false;
        } else {
            return discrete;
        }
    }

    /**
     * Sets the value of the discrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscrete(Boolean value) {
        this.discrete = value;
    }

    /**
     * Gets the value of the batchIntegrity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBatchIntegrity() {
        if (batchIntegrity == null) {
            return false;
        } else {
            return batchIntegrity;
        }
    }

    /**
     * Sets the value of the batchIntegrity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBatchIntegrity(Boolean value) {
        this.batchIntegrity = value;
    }

    /**
     * Gets the value of the oneAtATime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOneAtATime() {
        if (oneAtATime == null) {
            return true;
        } else {
            return oneAtATime;
        }
    }

    /**
     * Sets the value of the oneAtATime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneAtATime(Boolean value) {
        this.oneAtATime = value;
    }

    /**
     * Gets the value of the exponentialLeak property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExponentialLeak() {
        if (exponentialLeak == null) {
            return false;
        } else {
            return exponentialLeak;
        }
    }

    /**
     * Sets the value of the exponentialLeak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExponentialLeak(Boolean value) {
        this.exponentialLeak = value;
    }

}
