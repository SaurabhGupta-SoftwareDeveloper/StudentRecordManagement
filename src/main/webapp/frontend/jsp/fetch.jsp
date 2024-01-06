<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@ taglib prefix = "spring" uri = "http://java.sun.com/jsp/jstl/core" %>		
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Record update</title>
<style>
div {
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
}

form {
	background-color: cyan;
}

body {
	background-color: salmon;
}

#btn1 {
	background-color: lightgreen;
}

#btn2 {
	background-color: red;
}
</style>
</head>
<body>

	
	<div>
	
		<fieldset>
			<legend>Home Page here</legend>
			<h1>home page</h1>
	        
	        	<table border="2px solid black">
				<tr>
					<th>Name</th>
					<th>Phone</th>
					<th>English</th>
					<th>Maths</th>
					<th>Science</th>
					<th>Dob</th>
					<th>Percentage</th>
					<th>Result</th>
				</tr>
				
				<tr>
				<spring:forEach var="task" items="${list}">
				
					<th>${task.name}</th>
					<th>${task.mobile}</th>
					<th>${task.english}</th>
					<th>${task.maths}</th>
					<th>${task.science}</th>
					<th>${task.dob}</th>
					<th>${task.percentage}</th>
					<th>${task.result}</th>
					
					<th>
						
					</th>
					<th><a href="delete?id=${task.id}"><button>Delete</button></th></a>
					<th><a href="Edit?id=${task.id}"><button>Edit</button></th></a>
					
				</tr>
				
			</spring:forEach>
			</table>
		</fieldset>
		<br> <br> <a href="insert"><button>Add
				Task</button></a> <br> <br> <a href="logout"><button>Logout</button></a>
	</div>
</body>
</html>