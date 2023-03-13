<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Remove Scrap Piece</title>
</head>
<body>

<h2>What is the ID of the Piece you would like to remove?</h2>

<form action = "remove.do">
<input type="text" id = "Id" name = "Id"> <br>
<input type="submit" value="Remove Scrap Piece">
</form>

<form action = "index.do">
<input type = "submit" value = "Home">
</form>

</body>
</html>