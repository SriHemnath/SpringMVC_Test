<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User profile!!</title>
</head>
<body>
Welcome ${name}

<form:form id="userform" method = "POST" action = "addUser" modelAttribute="testModel">
         <table >    
         <tr>    
          <td>Name : </td>   
          <td><form:input path="userName" type="text" /></td>  
         </tr>    
         <tr>    
          <td>Login ID :</td>    
          <td><form:input path="loginid" type="text" /></td>  
         </tr>   
         <tr>    
          <td>Password :</td>    
          <td><form:input path="pwd" type="text" /></td>  
         </tr>   
         <tr>    
          <td colspan="2"><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
      </form:form>
</body>
</html>


<%-- <html>
<head>
<title>user profile!!</title>
</head>
<body>
	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<form action="addUser" method="POST">
	<table>
	<tr>
	<td>
	Name : <input name="userName" type="text" /> 
	</td>
	</tr>
	</table>
		
		LoginID : <input name="loginid" type="text" />
		Password : <input name="pwd" type="text" />
		<input type="submit" />
	</form>
</body>
</html> --%>