<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localHeader.jsp"%>

<form method="post">
<fieldset>
<table>
    <tr>
    	<td> <p4><b>Meal Times:</b></p4> </td>
    </tr>
    <tr>
        <td><openmrs:message code="Fasting meal time"/></td>
        <td>
            <spring:bind path="personalization.fasting">
                <input type="time" name="fasting" value="${status.value}" size="35" /><br>
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
        <td><openmrs:message code="Reminder"/></td>
        <td>
            <spring:bind path="personalization.fastingAlarm">
                <input type="number" name="fastingAlarm" value="${status.value}" min="-10" max="10" size="35" /><br>
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
        <td>min.</td>
    </tr>
    <tr>
        <td><openmrs:message code="Breakfast meal time"/></td>
        <td>
            <spring:bind path="personalization.breakfast">
                <input type="time" name="breakfast" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
         <td><openmrs:message code="Reminder"/></td>
        <td>
            <spring:bind path="personalization.breakfastAlarm">
                <input type="number" name="breakfastAlarm" value="${status.value}" min="-10" max="10" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
        <td>min.</td>
    </tr>
    <tr>
        <td><openmrs:message code="Lunch meal time"/></td>
        <td>
            <spring:bind path="personalization.lunch">
                <input type="time" name="lunch" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
        <td><openmrs:message code="Reminder"/></td>
        <td>
            <spring:bind path="personalization.lunchAlarm">
                <input type="number" name="lunchAlarm" value="${status.value}" min="-10" max="10" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
        <td>min.</td>
    </tr>
    <tr>
        <td><openmrs:message code="Dinner meal time"/></td>
        <td>
            <spring:bind path="personalization.evening">
                <input type="time" name="evening" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
        <td><openmrs:message code="Reminder"/></td>
        <td>
            <spring:bind path="personalization.eveningAlarm">
                <input type="number" name="eveningAlarm" value="${status.value}" min="-10" max="10" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
        <td>min.</td>
    </tr>
    <tr>
    	<td> <p4><b>Days and Times:</b></p4> </td>
    </tr>
    <tr>
        <td><openmrs:message code="Once a week day"/></td>
        <td>
            <spring:bind path="personalization.day">
                <input type="number" name="day" value="${status.value}" min="1" max="7" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
    </tr>
    <tr>
        <td><openmrs:message code="Once a week measure time"/></td>
        <td>
            <spring:bind path="personalization.time">
                <input type="time" name="time" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
        <td><openmrs:message code="Reminder"/></td>
        <td>
            <spring:bind path="personalization.dayAlarm">
                <input type="number" name="dayAlarm" value="${status.value}" min="-10" max="10" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
        <td>min.</td>
    </tr>
    <tr>
        <td><openmrs:message code="Twice a week days"/></td>
        <td>
            <spring:bind path="personalization.day1">
                <input type="number" name="day1" value="${status.value}" min="1" max="7" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
    </tr>
    <tr>
    	<td><openmrs:message code=""/></td>
        <td>
            <spring:bind path="personalization.day2">
                <input type="number" name="day2" value="${status.value}" min="1" max="7" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
    </tr>
</table>
<br />
<input type="submit" value="<openmrs:message code="save"/>" name="save">
</fieldset>
</form>



<%@ include file="/WEB-INF/template/footer.jsp"%>