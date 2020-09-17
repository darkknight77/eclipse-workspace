<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Doctors List</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<style type="text/css">
.myrow-container {
	margin: 20px;
}
</style>

</head>
<body class=".container-fluid">
	<div class="container myrow-container">
		<div class="panel panel-success">
			<div class="panel-heading">
				<h3 class="panel-title">
					<div align="left">
						<b>Doctors List</b>
					</div>
					<div align="right">
						<a href="createDoctor">Add New Doctor</a>
					</div>
				</h3>
			</div>
			<div class="panel-body">
				<c:if test="${empty doctorsList}">
                There are no doctors
            </c:if>
				<c:if test="${not empty doctorsList}">
					<form action="searchDoctor">
						<div class="row">
							<div class="col-md-6">
								<div class="col-md-6">Search Doctors:</div>
								<div class="col-md-6">
									<input type="text" name="doctorName" id="doctorName">
								</div>
							</div>
							<div class="col-md-4" style="margin-bottom: 5px">
								<input class="btn btn-success" type='submit' value='Search' />
							</div>
						</div>
					</form>
					<table class="table table-hover table-bordered">
						<thead style="background-color: #bce8f1;">
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Salary</th>
								<th>Specialization</th>
								<th>Edit</th>
								<th>Delete</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${doctorsList}" var="doc">
								<tr>
									<th><c:out value="${doc.id}" /></th>
									<th><c:out value="${doc.dName}" /></th>
									<th><c:out value="${doc.salary}" /></th>
									<th><c:out value="${doc.specialization}" /></th>
									<th><a href="editDoctor?id=<c:out value='${doc.id}'/>">Edit</a></th>
									<th><a href="deleteDoctor?id=<c:out value='${doc.id}'/>">Delete</a></th>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:if>
			</div>
		</div>



		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>