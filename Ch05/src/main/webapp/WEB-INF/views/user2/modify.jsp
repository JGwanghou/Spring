<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user2 :: register</title>
	</head>
<body>
	<h1>user2 수정</h1>
	<a href="/Ch05">Ch05 메인</a>
	<a href="/Ch05/user2/list">user2 목록</a>
	
	<form action="/Ch05/user2/modify" method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" value="" readonly/></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value=""/></td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="text" name="hp" value="" /></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="number" name="age" value="" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" name="수정"/></td>
			</tr>
		</table>
	</form>
</body>
</html>