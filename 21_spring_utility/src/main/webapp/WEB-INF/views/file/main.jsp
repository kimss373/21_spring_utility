<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="${contextPath }/file/upload" method="post" enctype="multipart/form-data">
		<h1>파일 업로드</h1>
		<table border="1" >			
			<tr>
				<td>업로더</td> 
				<td><input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>업로드 파일1</td>
				<td><input type="file" name="upFile1" /></td>
			</tr>
			<tr>
				<td>업로드 파일2</td>
				<td><input type="file" name="upFile2" /></td>
			</tr>
			<tr>
				<td>업로드 파일3</td>
				<td><input type="file" name="upFile3" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="등록하기" ></td>
			</tr>
		</table>
	</form>	
	
	<hr>
	
	<h1>썸네일 및 파일 다운로드</h1>
	<table border="1">			
		<tr>
			<th>이미지</th>
			<th>파일명</th>
			<th>다운로드</th>
		</tr>
		<tr>
			<td><img src="${contextPath }/file/thumbnails?fileName=404.PNG" width="200" height="120"></td>
			<td>404 이미지</td>
			<td><a href="${contextPath }/file/download?fileName=404.PNG">다운로드</a></td>
		</tr>
		<tr>
			<td><img src="${contextPath }/file/thumbnails?fileName=500.PNG" width="200" height="120"></td>
			<td>500 이미지</td>
			<td><a href="${contextPath }/file/download?fileName=500.PNG">다운로드</a></td>
		</tr>
	</table>
	
	<hr>
	
	<form action="${contextPath }/file/delete" method="post" >
		<h1>파일 삭제</h1>
		<table>			
			<tr>
				<td>삭제할 파일명 : </td>
				<td><input type="text" name="fileName">&emsp; <input type="submit" value="삭제" ></td>
			</tr>
		</table>	
	</form>	
	
	
	

</body>
</html>