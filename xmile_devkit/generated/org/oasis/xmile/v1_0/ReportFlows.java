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
 * <p>Java class for report_flows.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="report_flows">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="instantaneous"/>
 *     &lt;enumeration value="summed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "report_flows")
@XmlEnum
public enum ReportFlows {

    @XmlEnumValue("instantaneous")
    INSTANTANEOUS("instantaneous"),
    @XmlEnumValue("summed")
    SUMMED("summed");
    private final String value;

    ReportFlows(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportFlows fromValue(String v) {
        for (ReportFlows c: ReportFlows.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}