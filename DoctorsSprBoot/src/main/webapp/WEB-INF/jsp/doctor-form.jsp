<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="Ranga Reddy">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Doctor Information</title>
    <!-- Bootstrap CSS -->
    <%-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <style type="text/css">
        .myrow-container{
            margin: 20px;
        }
    </style>
</head>
<body class=".container-fluid">
    <div class="container myrow-container">
        <div class="panel panel-success">
            <div class="panel-heading">
                <h3 class="panel-title">
                    Doctor Details
                </h3>
            </div>
            <div class="panel-body">
                <form:form id="doctorRegisterForm" cssClass="form-horizontal" modelAttribute="doctorObject" method="post" action="updateDoctor">
    
                    <div class="form-group">
                        <div class="control-label col-xs-3">
                         <form:label path="dName" >Name</form:label> </div>
                        <div class="col-xs-6">
                            <form:hidden path="id" value="${doctorObject.id}"/>
                            <form:input cssClass="form-control" path="dName" value="${doctorObject.dName}"/>
                        </div>
                    </div>
    
                    <div class="form-group">
                        <form:label path="salary" cssClass="control-label col-xs-3">Salary</form:label>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="salary" value="${doctorObject.salary}"/>
                        </div>
                    </div>
    
                    <div class="form-group">
                        <div class="control-label col-xs-3"><form:label path="specialization">Specialization</form:label></div>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="specialization" value="${doctorObject.specialization}"/>
                        </div>
                    </div>
    
                    <div class="form-group">
                        <div class="row">
                            <div class="col-xs-4">
                            </div>
                            <div class="col-xs-4">
                                <input type="submit" id="updateDoctor" class="btn btn-primary" value="Save" onclick="return submitDoctorForm();"/>
                            </div>
                            <div class="col-xs-4">
                            </div>
                        </div>
                    </div>
    
                </form:form>
            </div>
        </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
    <script type="text/javascript">
    
        function submitDoctorForm() {                         
            // getting the doctor form values
            var name = $('#dName').val().trim();
            var salary = $('#salary').val();
            var specialization = $('#specialization').val();
            if(name.length ==0) {
                alert('Please enter name');
                $('#dName').focus();
                return false;
            }
    
            if(salary.length <= 0) {
                alert('Please enter your salary');
                $('#salary').focus();
                return false;
            }
    
            if(specialization.length <= 0) {
                alert('Please specify your specialization');
                $('#specialization').focus();
                return false;
            }
            return true;
        };  
    </script>
</body>
</html>