<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>User Registration Form</h1>
<body>
<form  action="register" method="GET">
      <table>
           <tr>
				<td>Username :</td>
				<td><input type="text" name="uname" /></td>
			</tr>
           
            <tr>
				<td>password :</td>
				<td><input type="password" name="pwd" /></td>
			</tr>
			
			 <tr>
				<td>Email :</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Phone number:</td>
				<td><input type="text" name="phno" /></td>
			</tr>
			
				<tr>
				<td></td>
				<td><input type="Submit" value="Register" /></td>
			</tr>
       </table>
 </form>  
 </body> 
</html>