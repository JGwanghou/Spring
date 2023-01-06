<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>user6 :: modify</title>
	</head>
	<script>
		
	</script>
<body>
	<h1>user5 수정</h1>
	<a href="/Ch05">Ch05 메인</a>
	<a href="/Ch05/user6/list">user6 목록</a>
	
	<form action="/Ch05/user6/modify" method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" value="${user.uid}"/></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${user.name}"/></td>
			</tr>
			<tr>
				<td>생년월일</td>
				<td><input type="date" name="birth" value="${user.birth}"/></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><input type="radio" name="gender" value="1" <c:if test="${user.gender eq '1'}">checked</c:if>/>남</td>
				<td><input type="radio" name="gender" value="2" <c:if test="${user.gender eq '2'}">checked</c:if>/>여</td>
			</tr>
			
			<tr>
				<td>나이</td>
				<td><input type="text" name="age" value="${user.age}"/></td>
			</tr>
			
			<tr>
				<td>주소</td>
				<td><input type="text" name="addr" value="${user.addr}"/></td>
			</tr>
			
			<tr>
				<td>휴대폰</td>
				<td><input type="text" name="hp" value="${user.hp}"/></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" name="등록"/></td>
			</tr>
		</table>
	</form>
</body>
</html>