<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    
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