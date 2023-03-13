<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New Entry</title>
</head>
<body>

<h2>Create new Wood Item</h2>
<h4>Please enter details of item</h4>

<form action = "createReturn.do" method = "POST">
<label for = "Species">Species: </label>
<input type="text" id = "Species" name = "Species"> <br>
<label for = "Length">Length in Inches: </label>
<input type="text" id = "Length" name = "Length"> <br>
<label for = "Thickness">Thickness in Inches:</label>
<input type="text" id = "Thickness" name = "Thickness"> <br>
<label for = "Width">Width in Inches: </label>
<input type="text" id = "Width" name = "Width"> <br>
<label for = "Type">Type: </label>
<input type="text" id = "Type" name = "Type"><br>
<br>
<br> 
<input type="submit" value="Add Scrap Piece">



</form>

</body>
</html>