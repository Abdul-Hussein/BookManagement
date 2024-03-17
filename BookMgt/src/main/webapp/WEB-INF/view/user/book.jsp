	


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Details</title>

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

select {
    width: 270px;
    height: 36px;
    float: left;
    margin: 1px;
}
    select:focus {
        min-width: 270px;
        width: auto;
    }


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
<script type="text/javascript" src="resources/js/book.js"></script>
<body>


	<section id="main-menu">
		<%@ include file="navigate.jsp"%>

	</section>

	<section id="main-body">
	
	
	

	<div align="left">

		<ul class="breadcrumb">
			<li><a href="#">Home</a></li>
			<li>Book</li>
			<li> <!-- Start of list item -->
    
		</ul>

	</div>
	
	
		<div style="float: right;">
			<input type="button" class="button" value="Add Book Details" id="addBookDetails">
		</div>

	
	
	
	<br>
	
	
	
	
	
	<div>
		<table id="bookdataTable">
			<thead>
				<tr>
					<th>ID</th>
					<th>BOOK NAME</th>
					<th>PRICE</th>
					<th>REMARKS</th>
					<th>Edit</th>
				</tr>
			</thead>
		</table>
	</div>
	
	

		<div class="form-popup" id="myForm" align="center">
		<form>
			<div class="container">
				<h1 align="left">Book Details</h1>

				<hr>

				<div class="row">

					<div class="column">
						<label class="required-field" for="startdate" style="float: left;"><b>Book Name</b></label> <input
							type="text" placeholder="Enter Book Name" name="bookname"
							id="bookname" required>
					</div>

					<div class="column">
						<label class="required-field" for="description" style="float: left;"><b>Book Price</b></label> <input
							type="text" placeholder="Enter book price"
							name="bookprice" id="bookprice" required>
					</div>
				</div>

				<div class="row">
				
					<div class="column">
							<label class="required-field" for="parent" style="float: left;"><b>Book Category </b></label><br> <br> <select name="category"
								id="category">
								<option value="">Thriller</option>
								<option value="1">Adventure</option>
								<option value="2">Memoir</option>
								<option value="3">History</option>
								<option value="4">ScienceFiction</option>
								<option value="5">Western Fiction</option>
							</select>
						</div>
				
					<div class="column">
						<label class="required-field" for="startdate" style="float: left;"><b>Remarks</b></label> <input
							type="text" placeholder="Enter remarks" name="remarks"
							id="remarks" required>
					</div>

					
					</div>

				<div align="left">
					<label class="required-field1" for="phone"><b>Indicates mandatory fields</b></label>
				</div>
				<hr>
				<div class="row">
					<div class="column">
						<input type="button" class="registerbtn" value="Save"
							id="saveBookDetails" />
					</div>
					<div class="column">
                    <button type="button" class="registerbtn" id="refreshPage">Close</button>
                </div>


				</div>
			</div>
		</form>
	</div>
	
	
		<input type="hidden" id="bookid">
		</section>
	
	
		

	
	<div id="loading">
		<style="margin: 0px; padding: 0px; position: fixed; right: 0px; top: 0px; width: 100%; height: 100%; background-color: rgb(102, 102, 102); z-index: 30001; opacity: 0.8;">
		<p style="position: absolute; color: White; top: 50%; left: 45%;">
	<img src="resources/images/loader.gif" />
	</div>
		

</body>
</html>