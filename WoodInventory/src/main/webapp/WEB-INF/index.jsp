<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wood Inventory</title>
</head>
<body>

<form action = "create.do" method = "GET">
<input type="submit" value="Create New Wood Item">
</form>

<form action = "RemovePassThrough.do" method = "GET">
<input type="submit" value="Remove Wood Item">
</form>

<form action = "UpdatePassThrough.do" method = "GET">
<input type="submit" value =  "Update Wood Item"> 
</form>


<h1>Current Wood Inventory</h1>

<c:choose>
<c:when test="${empty wood }">No Wood Available</c:when>
<c:otherwise>
<c:forEach var="wood" items="${wood}">
<!-- display in a nice table -->
<li>${wood}</li>
</c:forEach>

</c:otherwise>
</c:choose>

</body>
</html>