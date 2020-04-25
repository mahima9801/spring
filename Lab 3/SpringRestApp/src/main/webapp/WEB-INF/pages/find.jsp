<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Product</title>
</head>
<body>
<form action="viewProduct" method="post" modelAttribute="id">
<h1>Get Product</h1>
<input type="text" name="id" placeholder="Product id"/>
<br>
<br>
<input type="submit" name="s" value="ShowProduct"/>
</form>
<p>${msg}</p>
</body>
</html>