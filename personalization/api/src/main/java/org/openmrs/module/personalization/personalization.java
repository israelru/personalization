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
package org.openmrs.module.personalization;

import java.io.Serializable;

import org.openmrs.BaseOpenmrsObject;
import org.openmrs.BaseOpenmrsMetadata;

/**
 * It is a model class. It should extend either {@link BaseOpenmrsObject} or {@link BaseOpenmrsMetadata}.
 */
public class personalization extends BaseOpenmrsObject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer personalizationId;
	private String breakfast;
	private String lunch;
	private String evening;
	private String breakfastAlarm;
	private String lunchAlarm;
	private String eveningAlarm;
	private String day;
	private String day1;
	private String day2;
	private String time;
	private String time2;
	
	
	
   	public String getBreakfast() {
        return breakfast;
    }
    
   	public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
   	}
    	
    public String getLunch() {
    	return lunch;
   	}
        
    public void setLunch(String lunch) {
       this.lunch = lunch;
    }
    
    public String getEvening() {
    	return evening;
   	}
    
    public void setEvening(String evening) {
        this.evening = evening;
     }
    
    public String getBreakfastAlarm() {
        return breakfastAlarm;
    }
    
   	public void setBreakfastAlarm(String breakfastAlarm) {
        this.breakfastAlarm = breakfastAlarm;
   	}
    	
    public String getLunchAlarm() {
    	return lunchAlarm;
   	}
        
    public void setLunchAlarm(String lunchAlarm) {
       this.lunchAlarm = lunchAlarm;
    }
    
    public String getEveningAlarm() {
    	return eveningAlarm;
   	}
    
    public void setEveningAlarm(String eveningAlarm) {
        this.eveningAlarm = eveningAlarm;
     }
	   
	public Integer getPersonalizationId() {
           return personalizationId;
	}
	
	public void setPersonalizationId(Integer personalizationId) {
           this.personalizationId = personalizationId;
   	}
   
   	public String getDay() {
       return day;
   	}
   
   	public void setDay(String day) {
       this.day = day;
   	}
   
   	public String getDay1() {
       return day1;
   	}
   
   	public void setDay1(String day1) {
       this.day1 = day1;
   	}
   	
   	public String getDay2() {
       return day2;
    }
    
    public void setDay2(String day2) {
       this.day2 = day2;
    }
    
    public String getTime() {
        return time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    	
    public String getTime2() {
        return time2;
     }
     
     public void setTime2(String time2) {
        this.time2 = time2;
     }
    
	////////////////////////////////////////////////////////////////
	
	
	
	@Override
	public Integer getId() {
		return getPersonalizationId();
	}
	
	@Override
	public void setId(Integer id) {
		setPersonalizationId(id);
	}
	
}