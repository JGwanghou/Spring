<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>member :: modify</title>
	</head>
<body>
	<h1>member 수정</h1>
	<a href="/Ch05">Ch05 메인</a>
	<a href="/Ch05/member/list">member 목록</a>
	
	<form action="/Ch05/member/modify" method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" value="${member.uid}"/></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${member.name}"/></td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="text" name="hp" value="${member.hp}"/></td>
			</tr>
			<tr>
				<td>직급</td>
				<td>
				
					<select name="pos">
						<option <c:if test="${member.pos eq '사원'}">selected</c:if>>사원</option>
						<option <c:if test="${member.pos eq '대리'}">selected</c:if>>대리</option>
						<option <c:if test="${member.pos eq '과장'}">selected</c:if>>과장</option>
						<option <c:if test="${member.pos eq '차장'}">selected</c:if>>차장</option>
						<option <c:if test="${member.pos eq '부장'}">selected</c:if>>부장</option>
					</select>
					
				</td>
			</tr>
			<tr>
				<td>부서</td>
				<td>
					<select name="dep">
						<option value="101" <c:if test="${member.dep eq '101'}">selected</c:if>>영업1부</option>
						<option value="102" <c:if test="${member.dep eq '102'}">selected</c:if>>영업2부</option>
						<option value="103" <c:if test="${member.dep eq '103'}">selected</c:if>>영업3부</option>
						<option value="104" <c:if test="${member.dep eq '104'}">selected</c:if>>인사부</option>
						<option value="105" <c:if test="${member.dep eq '105'}">selected</c:if>>영업지원부</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="등록"/>
				</td>
			</tr>			
		</table>	
	</form>
</body>
</html>