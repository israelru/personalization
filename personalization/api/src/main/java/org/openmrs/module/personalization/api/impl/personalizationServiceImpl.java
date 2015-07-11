/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.personalization.api.impl;

import java.util.List;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.personalization.personalization;
import org.openmrs.module.personalization.api.personalizationService;
import org.openmrs.module.personalization.api.db.personalizationDAO;

/**
 * It is a default implementation of {@link personalizationService}.
 */
public class personalizationServiceImpl extends BaseOpenmrsService implements personalizationService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private personalizationDAO dao;
	
	/**
     * @param dao the dao to set
     */
    public void setDao(personalizationDAO dao) {
	    this.dao = dao;
    }
    
    /**
     * @return the dao
     */
    public personalizationDAO getDao() {
	    return dao;
    }

	@Override
	public List<personalization> getAllPersonalizations() {
		return dao.getAllPersonalizations();
	}

	@Override
	public personalization getPersonalization(Integer personalizationId) {
		return dao.getPersonalization(personalizationId);
	}

	@Override
	public personalization savePersonalization(personalization personalization) {
		return dao.savePersonalization(personalization);
	}

	@Override
	public void purgePersonalization(personalization personalization) {
		dao.purgePersonalization(personalization);
		
	}

	@Override
	public personalization getPersonalizationByUuid(String uuid) {
		return dao.getPersonalizationByUuid(uuid);
	}
}