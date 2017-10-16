<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>

	<form action="authenticator" method="post">
		<input type="text" name="username" placeholder="username" /><br /> <input
			type="password" name="password" placeholder="password" /><br /> <select
			name="domain">
			<option value="analyst">Analyst</option>
			<option value="general">General</option>

		</select> <input type="submit" value="Submit" />
	</form>


</body>
</html>