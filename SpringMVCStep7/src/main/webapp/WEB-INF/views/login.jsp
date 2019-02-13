<html>
<head>
<title>Yahoo!!</title>
</head>
<body>

<%-- <% x=3; %><% int x=5; %><%! int x=7; %>x = <%=x%>, <%=this.x%>, --%>
	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<form action="validateUser" method="POST">
		Name : <input name="userName" type="text" /> 
		Password : <input name="userPassword" type="password" /> <input type="submit" />
	</form>
</body>
</html>