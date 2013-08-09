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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 * <p>
 * Java class for OrderReferences complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="OrderReferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:OECD:StandardAuditFile-Tax:PT_1.02_01}OriginatingON" minOccurs="0"/>
 *         &lt;element ref="{urn:OECD:StandardAuditFile-Tax:PT_1.02_01}OrderDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderReferences", propOrder = { "originatingON", "orderDate" })
public class OrderReferences implements ToString {

	@XmlElement(name = "OriginatingON")
	protected String originatingON;
	@XmlElement(name = "OrderDate")
	protected XMLGregorianCalendar orderDate;

	/**
	 * Gets the value of the originatingON property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOriginatingON() {
		return this.originatingON;
	}

	/**
	 * Sets the value of the originatingON property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOriginatingON(String value) {
		this.originatingON = value;
	}

	/**
	 * Gets the value of the orderDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getOrderDate() {
		return this.orderDate;
	}

	/**
	 * Sets the value of the orderDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setOrderDate(XMLGregorianCalendar value) {
		this.orderDate = value;
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
			String theOriginatingON;
			theOriginatingON = this.getOriginatingON();
			strategy.appendField(locator, this, "originatingON", buffer,
					theOriginatingON);
		}
		{
			XMLGregorianCalendar theOrderDate;
			theOrderDate = this.getOrderDate();
			strategy.appendField(locator, this, "orderDate", buffer,
					theOrderDate);
		}
		return buffer;
	}

}
