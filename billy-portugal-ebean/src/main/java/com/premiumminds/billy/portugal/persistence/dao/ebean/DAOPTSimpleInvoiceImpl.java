/**
 * Copyright (C) 2017 Premium Minds.
 *
 * This file is part of billy portugal Ebean (PT Pack).
 *
 * billy portugal Ebean (PT Pack) is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * billy portugal Ebean (PT Pack) is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with billy portugal Ebean (PT Pack). If not, see <http://www.gnu.org/licenses/>.
 */
package com.premiumminds.billy.portugal.persistence.dao.ebean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.premiumminds.billy.core.persistence.entities.ebean.JPAGenericInvoiceEntity;
import com.premiumminds.billy.core.persistence.entities.ebean.query.QJPAGenericInvoiceEntity;
import com.premiumminds.billy.core.services.UID;
import com.premiumminds.billy.portugal.persistence.dao.DAOPTSimpleInvoice;
import com.premiumminds.billy.portugal.persistence.entities.PTSimpleInvoiceEntity;
import com.premiumminds.billy.portugal.persistence.entities.ebean.JPAPTSimpleInvoiceEntity;

public class DAOPTSimpleInvoiceImpl extends
        AbstractDAOPTGenericInvoiceImpl<PTSimpleInvoiceEntity, JPAPTSimpleInvoiceEntity> implements DAOPTSimpleInvoice {

    @Override
    public PTSimpleInvoiceEntity getEntityInstance() {
        return new JPAPTSimpleInvoiceEntity();
    }

    @Override
    protected Class<JPAPTSimpleInvoiceEntity> getEntityClass() {
        return JPAPTSimpleInvoiceEntity.class;
    }

    @Override
    public List<PTSimpleInvoiceEntity> getBusinessSimpleInvoicesForSAFTPT(UID businessUid, Date from, Date to) {
        List<JPAGenericInvoiceEntity> genericInvoices = this.queryInvoice(businessUid, from, to).findList();
        List<PTSimpleInvoiceEntity> invoices = new ArrayList<>();
        for (JPAGenericInvoiceEntity genericInvoice : genericInvoices) {
            if (genericInvoice instanceof JPAPTSimpleInvoiceEntity) {
                invoices.add((JPAPTSimpleInvoiceEntity) genericInvoice);
            }
        }
        return invoices;
    }

    private QJPAGenericInvoiceEntity queryInvoice(UID businessUid, Date from, Date to) {
        return new QJPAGenericInvoiceEntity().business.uid.eq(businessUid.toString()).date.between(from, to);
    }
}
