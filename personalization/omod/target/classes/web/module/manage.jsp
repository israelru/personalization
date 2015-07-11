<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localHeader.jsp"%>

<form method="post">
<fieldset>
<table>
    <tr>
        <td><openmrs:message code="Breakfast"/></td>
        <td>
            <spring:bind path="personalization.breakfast">
                <input type="text" name="breakfast" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
    </tr>
    <tr>
        <td><openmrs:message code="Lunch"/></td>
        <td>
            <spring:bind path="personalization.lunch">
                <input type="text" name="lunch" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
    </tr>
    <tr>
        <td><openmrs:message code="Evening"/></td>
        <td>
            <spring:bind path="personalization.evening">
                <input type="text" name="evening" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
    </tr>
    <tr>
        <td><openmrs:message code="Breakfast Reminder"/></td>
        <td>
            <spring:bind path="personalization.breakfastAlarm">
                <input type="text" name="breakfastAlarm" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
    </tr>
    <tr>
        <td><openmrs:message code="Lunch Reminder"/></td>
        <td>
            <spring:bind path="personalization.lunchAlarm">
                <input type="text" name="lunchAlarm" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
    </tr>
    <tr>
        <td><openmrs:message code="Evening Reminder"/></td>
        <td>
            <spring:bind path="personalization.eveningAlarm">
                <input type="text" name="eveningAlarm" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
    </tr>
    <tr>
        <td><openmrs:message code="Daily reminder"/></td>
        <td>
            <spring:bind path="personalization.day">
                <input type="text" name="day" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
    </tr>
    <tr>
        <td><openmrs:message code="Daily time"/></td>
        <td>
            <spring:bind path="personalization.time">
                <input type="text" name="time" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
    </tr>
    <tr>
        <td><openmrs:message code="Twice a week days"/></td>
        <td>
            <spring:bind path="personalization.day1">
                <input type="text" name="day1" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
    </tr>
    <tr>
        <td><openmrs:message code=""/></td>
        <td>
            <spring:bind path="personalization.day2">
                <input type="text" name="day2" value="${status.value}" size="35" />
                <c:if test="${status.errorMessage != ''}"><span class="error">${status.errorMessage}</span></c:if>
            </spring:bind>
        </td>
    </tr>
    <tr>
        <td><openmrs:message code="Twice a week reminder"/></td>
        <td>
            <spring:bind path="personalization.time2">
                <input type="text" name="time2" value="${status.value}" size="35" />
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