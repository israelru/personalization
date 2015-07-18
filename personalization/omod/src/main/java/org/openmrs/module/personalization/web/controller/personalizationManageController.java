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
package org.openmrs.module.personalization.web.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Patient;
import org.openmrs.Person;
import org.openmrs.api.PatientService;
import org.openmrs.api.PersonService;
import org.openmrs.api.context.Context;
import org.openmrs.messagesource.MessageSourceService;
import org.openmrs.module.personalization.personalization;
import org.openmrs.module.personalization.api.personalizationService;
import org.openmrs.web.WebConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

/**
 * The main controller.
 */
@Controller
public class  personalizationManageController {
	
	protected final Log log = LogFactory.getLog(getClass());
	
	@RequestMapping(value = "/module/personalization/manage", method = RequestMethod.GET)
	public personalization manage(ModelMap model,@RequestParam(required = false, value = "patientId") String patientId) {
		model.addAttribute("user", Context.getAuthenticatedUser());
		personalizationService personalizationService = Context.getService(personalizationService.class);
	    personalization per = personalizationService.getPersonalizationByUuid(patientId);
	    if (per == null)
	    	per = new personalization();
	    return per;
	}
	
//	@RequestMapping(value = "/module/personalization/addDepartment", method = RequestMethod.GET)
//	public Person observation(ModelMap model,@RequestParam(required = false, value = "patientId") String patientId) {
//		model.addAttribute("user", Context.getAuthenticatedUser());
//		PatientService patser = Context.getService(PatientService.class);
//		Patient pat = patser.getPatientByUuid(patientId);
//		PersonService perser = Context.getService(PersonService.class);
//	    Person per = perser.getPerson(pat);
//		return per;
//	}
//	
	
	@ResponseBody
	@RequestMapping(value = "/module/personalization/manage2", method = RequestMethod.GET)
	public personalization manage22(ModelMap model,@RequestParam(required = false, value = "id") int id
												,@RequestParam(required = false, value = "uuid") String uuid) {
		model.addAttribute("user", Context.getAuthenticatedUser());
		personalizationService personalizationService = Context.getService(personalizationService.class);
//		Context.getPatientService().getPatientByUuid("2332-32432");
		if (personalizationService.getPersonalizationByUuid(uuid) != null)
			return personalizationService.getPersonalizationByUuid(uuid);
		return personalizationService.getPersonalization(id);
	}
	
	
	@RequestMapping(value = "/module/personalization/manage.form", method = RequestMethod.POST)
    public personalization submitPersonalization(WebRequest request, HttpSession httpSession, ModelMap model,
                                   @RequestParam(required = false, value = "action") String action,
                                   @RequestParam(required = false, value = "breakfast") String breakfast,
                                   @RequestParam(required = false, value = "evening") String evening,
                                   @RequestParam(required = false, value = "fasting") String fasting,
                                   @RequestParam(required = false, value = "lunch") String lunch,
                                   @RequestParam(required = false, value = "breakfastAlarm") String breakfastAlarm,
                                   @RequestParam(required = false, value = "eveningAlarm") String eveningAlarm,
                                   @RequestParam(required = false, value = "lunchAlarm") String lunchAlarm,
                                   @RequestParam(required = false, value = "fastingAlarm") String fastingAlarm,
                                   @RequestParam(required = false, value = "day") String day,
                                   @RequestParam(required = false, value = "time") String time,
                                   @RequestParam(required = false, value = "dayAlarm") String dayAlarm,
                                   @RequestParam(required = false, value = "day1") String day1,
                                   @RequestParam(required = false, value = "day2") String day2,
                                   @RequestParam(required = true, value = "patientId") String patientId,
                                   @ModelAttribute("personalization") personalization personalization,
                                   BindingResult errors) {
			
        MessageSourceService mss = Context.getMessageSourceService();
        personalizationService personalizationService = Context.getService(personalizationService.class);
        personalization per = personalizationService.getPersonalizationByUuid(patientId);
		if (per == null)
			per = new personalization();
		per.setEvening(evening);
		per.setBreakfast(breakfast);
		per.setLunch(lunch);
		per.setFasting(fasting);
		per.setBreakfastAlarm(breakfastAlarm);
		per.setLunchAlarm(lunchAlarm);
		per.setEveningAlarm(eveningAlarm);
		per.setFastingAlarm(fastingAlarm);
		per.setUuid(patientId);
		per.setDay(day);
		per.setTime(time);
		per.setDayAlarm(dayAlarm);
		per.setDay1(day1);
		per.setDay2(day2);
		
		
        log.warn("Action: " + action);
        if (!Context.isAuthenticated()) {
        	log.warn("athu required" + action);
            errors.reject("personalization.auth.required");
        } else if (mss.getMessage("personalization.purgePersonalization").equals(action)) {
            try {
            	personalizationService.purgePersonalization(per);
                httpSession.setAttribute(WebConstants.OPENMRS_MSG_ATTR, "personalization.delete.success");
                log.warn("Action1: " + action);
                return per;
//                return "redirect:personalizationList.list";
            }
            catch (Exception ex) {
                httpSession.setAttribute(WebConstants.OPENMRS_ERROR_ATTR, "personalization.delete.failure");
                log.error("Failed to delete personalization", ex);
                log.warn("Action2: " + action);
                return per;
//                return "redirect:personalizationForm.form?personalizationId=" + request.getParameter("personalizationId");
            }
        } else {
        	log.warn(per.getPersonalizationId()+"---"+per.getBreakfast());
        	personalizationService.savePersonalization(per);
            httpSession.setAttribute(WebConstants.OPENMRS_MSG_ATTR, "personalization.saved");
            log.warn("Action3: " + action);
        }
        return per;
//        return "redirect:personalizationList.list";
    }
	
}
