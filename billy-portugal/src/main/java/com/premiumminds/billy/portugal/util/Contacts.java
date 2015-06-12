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
package com.premiumminds.billy.portugal.util;

import com.google.inject.Injector;
import com.premiumminds.billy.core.services.builders.impl.BuilderManager;
import com.premiumminds.billy.portugal.services.entities.PTContact;

public class Contacts {

	private final Injector	injector;

	public Contacts(Injector injector) {
		this.injector = injector;
	}

	public PTContact.Builder builder() {
		return getInstance(PTContact.Builder.class);
	}
	
	public PTContact.Builder builder(PTContact customer) {
		PTContact.Builder builder = getInstance(PTContact.Builder.class);
		BuilderManager.setTypeInstance(builder, customer);
		return builder;
	}
	
	private <T> T getInstance(Class<T> clazz) {
		return this.injector.getInstance(clazz);
	}
	
}