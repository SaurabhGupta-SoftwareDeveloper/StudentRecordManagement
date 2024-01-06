<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="loadvalue" method="post">
    <fieldset>
        <legend>Student Record</legend>
        Name:<input type="text" name="name"><br>
        Mobile:<input type="text"name="mobile"><br>
       <label>Marks</label><br>
       English<input type="text"name="English"><br>
       Maths<input type="text"name="Maths"><br>
       Science<input type="text" name="Science"><br>
        
        Dob:<input type="date" name="Dob"><br>
        
        <a ><button>Add</button></a><br>
        <a><button>cancel</button></a><br>
    
    </fieldset>
    </form>
</body>
</html>