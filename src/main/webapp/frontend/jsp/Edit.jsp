<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Task</title>
</head>

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
</style>
<body>
	<div>
		
		<form action="edit" method="post">
			<fieldset>
				<legend>Edit here</legend>
			
				<input type="hidden" name="id" value="${student.id}">
				<table>
					<tr>
						<th>Name:</th>
						
						<th><input type="text" name="name" value="${student.name}"></th>
					</tr>
					<tr>
						<th>Mobile:</th>
						<th><input type="text" name="mobile" value="${student.mobile}"></th>
					</tr>
					<tr>
						<th>English:</th>
						<th><input type="text" name="english" value="${student.english}"></th>
					</tr>
					<tr>
						<th>Maths:</th>
						<th><input type="text" name="maths" value="${student.maths}"></th>
					</tr>
					<tr>
						<th>Science:</th>
						<th><input type="text" name="science" value="${student.science}"></th>
					</tr>
					<tr>
						<th>dob:</th>
						<th><input type="date" name="dob" value="${student.dob}"></th>
					</tr>

					<tr>
						<th><button type="submit" id="btn1">Update</button></th>
						<th><button type="reset" id="btn2">Cancel</button></th>
					</tr>
				</table>
			</fieldset>
		</form>
		<br> <br> <a href="home"><button>back</button></a>
	</div>
</body>
</html>