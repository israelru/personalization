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
package org.openmrs.module.personalization.api.db;

import java.util.List;

import org.openmrs.module.personalization.personalization;
import org.openmrs.module.personalization.api.personalizationService;

/**
 *  Database methods for {@link personalizationService}.
 */
public interface personalizationDAO {
	
	/*
	 * Add DAO methods here
	 */
	/**
     * @see org.openmrs.module.department.api.DepartmentService#getAllDepartments()
     */
    List<personalization> getAllPersonalizations();
    /**
     * @see org.openmrs.module.department.api.DepartmentService#getDepartment(java.lang.Integer)
     */
    personalization getPersonalization(Integer personalizationId);
    /**
     * @see org.openmrs.module.department.api.DepartmentService#getDepartment(java.lang.Integer)
     */
    personalization getPersonalizationByUuid(String uuid);
    /**
     * @see org.openmrs.module.department.api.DepartmentService#saveDepartment(org.openmrs.module.department.Department)
     */
    personalization savePersonalization(personalization personalization);
    /**
     * @see org.openmrs.module.department.api.DepartmentService#purgeDepartment(org.openmrs.module.department.Department)
     */
    void purgePersonalization(personalization personalization);
	
	
}