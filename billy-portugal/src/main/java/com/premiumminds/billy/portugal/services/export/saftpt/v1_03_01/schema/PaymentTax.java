//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.25 at 05:06:02 PM WEST 
//


package com.premiumminds.billy.portugal.services.export.saftpt.v1_03_01.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for PaymentTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:OECD:StandardAuditFile-Tax:PT_1.03_01}TaxType"/>
 *         &lt;element ref="{urn:OECD:StandardAuditFile-Tax:PT_1.03_01}TaxCountryRegion"/>
 *         &lt;element name="TaxCode" type="{urn:OECD:StandardAuditFile-Tax:PT_1.03_01}PaymentTaxCode"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:OECD:StandardAuditFile-Tax:PT_1.03_01}TaxPercentage"/>
 *           &lt;element ref="{urn:OECD:StandardAuditFile-Tax:PT_1.03_01}TaxAmount"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTax", propOrder = {
    "taxType",
    "taxCountryRegion",
    "taxCode",
    "taxPercentage",
    "taxAmount"
})
public class PaymentTax
    implements ToString
{

    @XmlElement(name = "TaxType", required = true)
    protected String taxType;
    @XmlElement(name = "TaxCountryRegion", required = true)
    protected String taxCountryRegion;
    @XmlElement(name = "TaxCode", required = true)
    protected String taxCode;
    @XmlElement(name = "TaxPercentage")
    protected BigDecimal taxPercentage;
    @XmlElement(name = "TaxAmount")
    protected BigDecimal taxAmount;

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the taxCountryRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCountryRegion() {
        return taxCountryRegion;
    }

    /**
     * Sets the value of the taxCountryRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCountryRegion(String value) {
        this.taxCountryRegion = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxPercentage() {
        return taxPercentage;
    }

    /**
     * Sets the value of the taxPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxPercentage(BigDecimal value) {
        this.taxPercentage = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theTaxType;
            theTaxType = this.getTaxType();
            strategy.appendField(locator, this, "taxType", buffer, theTaxType);
        }
        {
            String theTaxCountryRegion;
            theTaxCountryRegion = this.getTaxCountryRegion();
            strategy.appendField(locator, this, "taxCountryRegion", buffer, theTaxCountryRegion);
        }
        {
            String theTaxCode;
            theTaxCode = this.getTaxCode();
            strategy.appendField(locator, this, "taxCode", buffer, theTaxCode);
        }
        {
            BigDecimal theTaxPercentage;
            theTaxPercentage = this.getTaxPercentage();
            strategy.appendField(locator, this, "taxPercentage", buffer, theTaxPercentage);
        }
        {
            BigDecimal theTaxAmount;
            theTaxAmount = this.getTaxAmount();
            strategy.appendField(locator, this, "taxAmount", buffer, theTaxAmount);
        }
        return buffer;
    }

}
