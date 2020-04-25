<html>
<head>
<meta charset="ISO-8859-1">
<title>NewProduct</title>
</head>
<body>
<form action="addProduct" modelAttribute="product" method="post" >
<h1 > Add New Product</h1>
<input type="text" name="id" placeholder="Product id"/>
<br><br>
<input type="text" name="name" placeholder="Product Name"/>
<br><br>
<input type="text" name="price" placeholder="Product Price"/>
<br><br>
<br>
<input type="submit" name="s" value="AddProduct"/>
</form>
<p>${ msg}</p>
</body>
</html>