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
package org.openmrs.module.personalization.api;

import java.util.List;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.personalization.personalization;
import org.springframework.transaction.annotation.Transactional;

/**
 * This service exposes module's core functionality. It is a Spring managed bean which is configured in moduleApplicationContext.xml.
 * <p>
 * It can be accessed only via Context:<br>
 * <code>
 * Context.getService(personalizationService.class).someMethod();
 * </code>
 * 
 * @see org.openmrs.api.context.Context
 */
@Transactional
public interface personalizationService extends OpenmrsService {
     
	/*
	 * Add service methods here
	 * 
	 */
	/**
     * Gets a list of departments.
     *
     * @return the department list.
     */
    @Transactional(readOnly = true)
    List<personalization> getAllPersonalizations();
    /**
     * Gets a department for a given id.
     *
     * @param id the department id
     * @return the department with the given id
     */
    @Transactional(readOnly = true)
    personalization getPersonalization(Integer personalizationId);
    /**
     * Gets a department for a given id.
     *
     * @param id the department id
     * @return the department with the given id
     */
    @Transactional(readOnly = true)
    personalization getPersonalizationByUuid(String uuid);
    
    /**
     * Saves a new or existing department.
     *
     * @param department the department to save.
     * @return the saved department.
     */
    personalization savePersonalization(personalization personalization);
    /**
     * Deletes a department from the database.
     *
     * @param department the department to delete.
     */
    void purgePersonalization(personalization personalization);
	
	
}