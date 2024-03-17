<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Links</title>

<%@ include file="primary.jsp"%>

<link rel="stylesheet" href="resources/css/secondary.css">
<link rel="stylesheet" href="resources/css/customselect.css">
<link rel="stylesheet" href="resources/css/button.css">

<script src="resources/jquery/jquery.min.js"></script>
<link href="resources/css/jquery.dataTables.min.css" rel="stylesheet"
	type="text/css">
<script type="text/javascript"
	src="resources/jquery/jquery.dataTables.min.js"></script>
<link rel="stylesheet" href="resources/css/sweetalert.min.css">
<script src="resources/jquery/sweetalert.min.js"></script>

</head>
<style>
body {
	margin: 0;
}

.navbar {
	overflow: hidden;
	background-color: #333;
	position: fixed;
	top: 0;
	width: 100%;
}

.navbar a {
	float: left;
	display: block;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.navbar a:hover {
	background: #ddd;
	color: black;
}

.main {
	padding: 16px;
	margin-top: 30px;
	height: 1500px;
}
</style>
<script type="text/javascript" src="resources/js/bookLinks.js"></script>


<body>


	<section id="main-menu">
		<%@ include file="navigate.jsp"%>

	</section>

	<section id="main-body">

		<div align="left">

			<ul class="breadcrumb">
				<li><a href="#">Home</a></li>
				<li>Book</li>
			</ul>

		</div>



	

		<br>



		<div>
			<table id="bookLinks">
				<thead>
					<tr>
						<th>ID</th>
						<th>BOOKNAME</th>
						<th>GET THE FREE BOOK</th>
						<th>CREATED DATE</th>
					</tr>
				</thead>
			</table>
		</div>

</section>
	




</body>
</html>