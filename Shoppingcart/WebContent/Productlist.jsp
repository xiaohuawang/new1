<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/jquery.validate.js"></script>
<script
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/jquery.validate.min.js"></script>
<script
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/additional-methods.js"></script>
<script
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/additional-methods.min.js"></script>
<title>Login</title>
<style>
h1 {
	font-family: "Edwardian Script ITC";
	text-color: Blue;
	font-size: 50px;
}
body {
	font-family: "Bookman Old Style";
	color: black;
	background-color: #a6d2d2;
	font-size: 15px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" style=color:red>Product</a>
	    </div>
	    </div>
	    </nav>
	<div class="container">
		<div class="jumbotron">
			<h1 align=center>
				<b>Product List</b>
			</h1>
			

		
		</div>
			<div class="panel panel-primary col-sm-6 col-sm-offset-3">

					<form role="form" action="Productlist" method="POST">
						<div class="form-group">
						
						</div>
						
						<div class="form-group">
							<button type="submit" value="submit" class="btn btn-default"> go to product list
								</button>

							<a href="/GulpAssignment/RegisterReviewer.jsp"
								class="btn btn-default"> lol</a>
						</div>

					</form>
				</div>
			</div>
</body>
</html>