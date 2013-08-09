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
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 * <p>
 * Java class for WithholdingTax complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WithholdingTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:OECD:StandardAuditFile-Tax:PT_1.02_01}WithholdingTaxType" minOccurs="0"/>
 *         &lt;element name="WithholdingTaxDescription" type="{urn:OECD:StandardAuditFile-Tax:PT_1.02_01}SAFPTtextTypeMandatoryMax60Car" minOccurs="0"/>
 *         &lt;element name="WithholdingTaxAmount" type="{urn:OECD:StandardAuditFile-Tax:PT_1.02_01}SAFmonetaryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithholdingTax", propOrder = { "withholdingTaxType",
		"withholdingTaxDescription", "withholdingTaxAmount" })
public class WithholdingTax implements ToString {

	@XmlElement(name = "WithholdingTaxType")
	protected String withholdingTaxType;
	@XmlElement(name = "WithholdingTaxDescription")
	protected String withholdingTaxDescription;
	@XmlElement(name = "WithholdingTaxAmount", required = true)
	protected BigDecimal withholdingTaxAmount;

	/**
	 * Gets the value of the withholdingTaxType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWithholdingTaxType() {
		return this.withholdingTaxType;
	}

	/**
	 * Sets the value of the withholdingTaxType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWithholdingTaxType(String value) {
		this.withholdingTaxType = value;
	}

	/**
	 * Gets the value of the withholdingTaxDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWithholdingTaxDescription() {
		return this.withholdingTaxDescription;
	}

	/**
	 * Sets the value of the withholdingTaxDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWithholdingTaxDescription(String value) {
		this.withholdingTaxDescription = value;
	}

	/**
	 * Gets the value of the withholdingTaxAmount property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getWithholdingTaxAmount() {
		return this.withholdingTaxAmount;
	}

	/**
	 * Sets the value of the withholdingTaxAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setWithholdingTaxAmount(BigDecimal value) {
		this.withholdingTaxAmount = value;
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
			String theWithholdingTaxType;
			theWithholdingTaxType = this.getWithholdingTaxType();
			strategy.appendField(locator, this, "withholdingTaxType", buffer,
					theWithholdingTaxType);
		}
		{
			String theWithholdingTaxDescription;
			theWithholdingTaxDescription = this.getWithholdingTaxDescription();
			strategy.appendField(locator, this, "withholdingTaxDescription",
					buffer, theWithholdingTaxDescription);
		}
		{
			BigDecimal theWithholdingTaxAmount;
			theWithholdingTaxAmount = this.getWithholdingTaxAmount();
			strategy.appendField(locator, this, "withholdingTaxAmount", buffer,
					theWithholdingTaxAmount);
		}
		return buffer;
	}

}
