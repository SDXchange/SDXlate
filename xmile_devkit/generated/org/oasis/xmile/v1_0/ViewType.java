//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 12:14:36 AM CST 
//


package org.oasis.xmile.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for view_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="view_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="stock_flow"/>
 *     &lt;enumeration value="interface"/>
 *     &lt;enumeration value="popup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "view_type")
@XmlEnum
public enum ViewType {

    @XmlEnumValue("stock_flow")
    STOCK_FLOW("stock_flow"),
    @XmlEnumValue("interface")
    INTERFACE("interface"),
    @XmlEnumValue("popup")
    POPUP("popup");
    private final String value;

    ViewType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ViewType fromValue(String v) {
        for (ViewType c: ViewType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}