<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Customer Conformation</title>
</head>
<body>
The customer is confirmed: ${customer.firstName} ${customer.lastName}
<br><br>
Free Passes: ${customer.freePasses}
<br><br>
Postal Code: ${customer.portalCode}
<br><br>
Course Code: ${customer.courseCode}

</body>
</html>