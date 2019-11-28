<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>



<%String id = "";
Cookie[] cookies = request.getCookies();
for(Cookie cookie:cookies) {
	if(cookie.getName().equals("alwaysRemember")) {
		id= cookie.getValue();
	}
} %>
<body>
	<fieldset>
	<form action='./login' method='post'>
		<tr>
			<td>Id:</td>
			<td><input type='text' name='id' value='<%=id%>'></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type='password' name='password'></td>
		<tr>
			<td>Remeber Me</td>
			<td><input type='checkbox' name='rememberme' value='checked'></td>
		</tr>
		</tr>
		<td><input type='reset' name='reset'></td>
		<td><input type='submit' name='login'></td>
		<tr>
			<a href='./register.html'>Register</a>
		</tr>
		</table>
	</form>
	</fieldset>
</body>
</html>