<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<body>

The student is confirmed: ${student.fistName} ${student.lastName}

<br><br>
Country: ${student.country}

<br><br>
Favorite Language: ${student.favoriteLanguage}

<br><br>
Operation Systems:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>

</body>
</html>