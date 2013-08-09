/**
 * Copyright (C) 2013 Premium Minds.
 *
 * This file is part of billy portugal (PT Pack).
 *
 * billy portugal (PT Pack) is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * billy portugal (PT Pack) is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with billy portugal (PT Pack). If not, see <http://www.gnu.org/licenses/>.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2013.08.09 at 02:35:19 PM WEST
//

package com.premiumminds.billy.portugal.services.export.saftpt.schema;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:OECD:StandardAuditFile-Tax:PT_1.02_01}TaxType"/>
 *         &lt;element ref="{urn:OECD:StandardAuditFile-Tax:PT_1.02_01}TaxCountryRegion"/>
 *         &lt;element ref="{urn:OECD:StandardAuditFile-Tax:PT_1.02_01}TaxCode"/>
 *         &lt;element name="Description" type="{urn:OECD:StandardAuditFile-Tax:PT_1.02_01}SAFPTtextTypeMandatoryMax255Car"/>
 *         &lt;element ref="{urn:OECD:StandardAuditFile-Tax:PT_1.02_01}TaxExpirationDate" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:OECD:StandardAuditFile-Tax:PT_1.02_01}TaxPercentage"/>
 *           &lt;element ref="{urn:OECD:StandardAuditFile-Tax:PT_1.02_01}TaxAmount"/>
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
@XmlType(name = "", propOrder = { "taxType", "taxCountryRegion", "taxCode",
		"description", "taxExpirationDate", "taxPercentage", "taxAmount" })
@XmlRootElement(name = "TaxTableEntry")
public class TaxTableEntry implements ToString {

	@XmlElement(name = "TaxType", required = true)
	protected String taxType;
	@XmlElement(name = "TaxCountryRegion", required = true)
	protected String taxCountryRegion;
	@XmlElement(name = "TaxCode", required = true)
	protected String taxCode;
	@XmlElement(name = "Description", required = true)
	protected String description;
	@XmlElement(name = "TaxExpirationDate")
	protected XMLGregorianCalendar taxExpirationDate;
	@XmlElement(name = "TaxPercentage")
	protected BigDecimal taxPercentage;
	@XmlElement(name = "TaxAmount")
	protected BigDecimal taxAmount;

	/**
	 * Gets the value of the taxType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaxType() {
		return this.taxType;
	}

	/**
	 * Sets the value of the taxType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaxType(String value) {
		this.taxType = value;
	}

	/**
	 * Gets the value of the taxCountryRegion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaxCountryRegion() {
		return this.taxCountryRegion;
	}

	/**
	 * Sets the value of the taxCountryRegion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaxCountryRegion(String value) {
		this.taxCountryRegion = value;
	}

	/**
	 * Gets the value of the taxCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaxCode() {
		return this.taxCode;
	}

	/**
	 * Sets the value of the taxCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaxCode(String value) {
		this.taxCode = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the taxExpirationDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getTaxExpirationDate() {
		return this.taxExpirationDate;
	}

	/**
	 * Sets the value of the taxExpirationDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTaxExpirationDate(XMLGregorianCalendar value) {
		this.taxExpirationDate = value;
	}

	/**
	 * Gets the value of the taxPercentage property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getTaxPercentage() {
		return this.taxPercentage;
	}

	/**
	 * Sets the value of the taxPercentage property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTaxPercentage(BigDecimal value) {
		this.taxPercentage = value;
	}

	/**
	 * Gets the value of the taxAmount property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getTaxAmount() {
		return this.taxAmount;
	}

	/**
	 * Sets the value of the taxAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTaxAmount(BigDecimal value) {
		this.taxAmount = value;
	}

	public String toString() {
		final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
		final StringBuilder buffer = new StringBuilder();
		this.append(null, buffer, strategy);
		return buffer.toString();
	}

	public StringBuilder append(ObjectLocator locator, StringBuilder buffer,
			ToStringStrategy strategy) {
		strategy.appendStart(locator, this, buffer);
		this.appendFields(locator, buffer, strategy);
		strategy.appendEnd(locator, this, buffer);
		return buffer;
	}

	public StringBuilder appendFields(ObjectLocator locator,
			StringBuilder buffer, ToStringStrategy strategy) {
		{
			String theTaxType;
			theTaxType = this.getTaxType();
			strategy.appendField(locator, this, "taxType", buffer, theTaxType);
		}
		{
			String theTaxCountryRegion;
			theTaxCountryRegion = this.getTaxCountryRegion();
			strategy.appendField(locator, this, "taxCountryRegion", buffer,
					theTaxCountryRegion);
		}
		{
			String theTaxCode;
			theTaxCode = this.getTaxCode();
			strategy.appendField(locator, this, "taxCode", buffer, theTaxCode);
		}
		{
			String theDescription;
			theDescription = this.getDescription();
			strategy.appendField(locator, this, "description", buffer,
					theDescription);
		}
		{
			XMLGregorianCalendar theTaxExpirationDate;
			theTaxExpirationDate = this.getTaxExpirationDate();
			strategy.appendField(locator, this, "taxExpirationDate", buffer,
					theTaxExpirationDate);
		}
		{
			BigDecimal theTaxPercentage;
			theTaxPercentage = this.getTaxPercentage();
			strategy.appendField(locator, this, "taxPercentage", buffer,
					theTaxPercentage);
		}
		{
			BigDecimal theTaxAmount;
			theTaxAmount = this.getTaxAmount();
			strategy.appendField(locator, this, "taxAmount", buffer,
					theTaxAmount);
		}
		return buffer;
	}

}
