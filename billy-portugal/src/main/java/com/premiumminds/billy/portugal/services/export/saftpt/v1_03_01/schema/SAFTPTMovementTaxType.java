//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.25 at 05:06:02 PM WEST 
//


package com.premiumminds.billy.portugal.services.export.saftpt.v1_03_01.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SAFTPTMovementTaxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SAFTPTMovementTaxType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IVA"/>
 *     &lt;enumeration value="NS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SAFTPTMovementTaxType")
@XmlEnum
public enum SAFTPTMovementTaxType {

    IVA,
    NS;

    public String value() {
        return name();
    }

    public static SAFTPTMovementTaxType fromValue(String v) {
        return valueOf(v);
    }

}
