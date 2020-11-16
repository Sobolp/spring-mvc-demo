<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="fistName"/>
    <br> <br>
    Last name: <form:input path="lastName"/>
    <br> <br>
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
        <%--            <form:option value="Brazil" label="Brazil" />--%>
        <%--            <form:option value="France" label="France" />--%>
        <%--            <form:option value="Germany" label="Germany" />--%>
        <%--            <form:option value="India" label="India" />--%>
    </form:select>
    <br> <br>
    Favorite Language:
    <form:radiobuttons path="favoriteLanguage" items="${student.lengOptions}"/>

    <%--        Java <form:radiobutton path="favoriteLanguage" value="Java" />--%>
    <%--        C# <form:radiobutton path="favoriteLanguage" value="C#" />--%>
    <%--        PHP <form:radiobutton path="favoriteLanguage" value="PHP" />--%>
    <%--        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />--%>
    <br> <br>

    Operating Systems:
    <form:checkboxes path="operatingSystems" items="${student.osOptions}"/>

<%--    Linux <form:checkbox path="operatingSystems" value="Linux"/>--%>
<%--    Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>--%>
<%--    MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>--%>
    <br> <br>

    <input type="submit" value="Submit">
</form:form>

</body>
</html>