<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wood Inventory</title>
</head>
<body>

<h1>Current Wood Inventory</h1>

<c:choose>
<c:when test="${empty wood }">No Wood Available</c:when>
<c:otherwise>
<c:forEach var="wood" items="${wood }">
<!-- display in a nice table -->
<li>${wood}</li>
</c:forEach>

</c:otherwise>
</c:choose>

<form action = "create.do" method = "GET">
<input type="submit" value="Create New Wood Entry">
</form>

<form action = "RemovePassThrough.do" method = "GET">
<input type="submit" value="Remove Wood Item">
</form>

<form action = "UpdatePassThrough.do" method = "GET">
<label for = "UpdateId">ID of the piece you'd like to update </label>
<input type="text" id = "UpdateId" name = "UpdateId"> 
<input type="submit" value="Submit">
</form>






</body>
</html>