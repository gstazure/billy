/**
 * Copyright (C) 2013 Premium Minds.
 *
 * This file is part of billy platypus (PT Pack).
 *
 * billy platypus (PT Pack) is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * billy platypus (PT Pack) is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with billy platypus (PT Pack). If not, see <http://www.gnu.org/licenses/>.
 */
package com.premiumminds.billy.portugal.test.util;

import java.util.Date;

import com.google.inject.Injector;
import com.premiumminds.billy.core.services.UID;
import com.premiumminds.billy.portugal.persistence.entities.PTCreditNoteEntity;
import com.premiumminds.billy.portugal.persistence.entities.PTCreditNoteEntryEntity;
import com.premiumminds.billy.portugal.services.entities.PTCreditNote;
import com.premiumminds.billy.portugal.services.entities.PTCreditNoteEntry;

public class PTCreditNoteTestUtil {

	private final Boolean billed = false;
	private final Boolean cancelled = false;
	private final Boolean selfBill = false;
	private final String hash = "HASH";
	private final String sourceID = "SOURCE";
	private final String uid = "CREDIT_NOTE";
	private final String serie = "B";
	private final String number = "FS B/1";
	private final Integer seriesNumber = 1;
	private final String creditNoteEntryUID = "CREDIT_NOTE_ENTRY";
	private static final String PRODUCT = "PRODUCT_UID";
	private static final String INVOICEREFERENCE = "INVOICE";

	private Injector injector;
	private PTCreditNoteEntryTestUtil creditNoteEntry;

	public PTCreditNoteTestUtil(Injector injector) {
		this.injector = injector;
		creditNoteEntry = new PTCreditNoteEntryTestUtil(injector);
	}

	public PTCreditNoteEntity getCreditNoteEntity(String productUID,
			String invoiceReference) {
		PTCreditNote.Builder creditNoteBuilder = injector
				.getInstance(PTCreditNote.Builder.class);

		PTCreditNoteEntry.Builder creditNoteEntryBuilder = creditNoteEntry
				.getCreditNoteEntryBuilder(productUID, invoiceReference);

		creditNoteBuilder.clear();

		creditNoteBuilder.setBilled(billed).setCancelled(cancelled)
				.setSelfBilled(selfBill).setHash(hash).setDate(new Date())
				.setSourceId(sourceID).addEntry(creditNoteEntryBuilder);

		PTCreditNoteEntity creditNote = (PTCreditNoteEntity) creditNoteBuilder
				.build();
		creditNote.setUID(new UID(uid));
		creditNote.setSeries(serie);
		creditNote.setSeriesNumber(seriesNumber);
		creditNote.setNumber(number);

		PTCreditNoteEntryEntity creditNoteEntry = (PTCreditNoteEntryEntity) creditNote
				.getEntries().get(0);
		creditNoteEntry.setUID(new UID(creditNoteEntryUID));
		creditNoteEntry.getDocumentReferences().add(creditNote);

		return creditNote;
	}

	public PTCreditNoteEntity getCreditNoteEntity() {
		return getCreditNoteEntity(PRODUCT, INVOICEREFERENCE);
	}
}
