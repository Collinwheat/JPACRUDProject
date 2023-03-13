<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New Entry</title>
</head>
<body>

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
<input type="submit" value="Add Scrap Piece">



</form>

</body>
</html>