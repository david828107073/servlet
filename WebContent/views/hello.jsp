<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>JSP</title>
<style>
	clock{
	 position: relative;
	}
	h1{
	font-size: 14px;
	width: 200px;
	border: 1px solid red;
	text-align: center;
	position:absolute;
	right: 0;
	}
</style>
</head>
<body>
	<div class="clock">
		<h1>
			<%
				out.print(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
			%>
		</h1>
	</div>
	<button class="btn">click</button>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script>
		let btn = $('.btn');
		btn.on('click',goAjax)
		
		function goAjax(){
// 			$.ajax('http://127.0.0.1:8081/servletSpring/app').done(
// 					function(data) {
// 						var res = JSON.parse(data);
// 						console.log(data);
// 					}).fail(function() {
// 				alert('failed!')
// 			})
			$.ajax({
				url: 'http://127.0.0.1:8081/servletSpring/app',
				success: function(data){
					const values = JSON.parse(data);
					console.log(values);
				}
			})
		}
	</script>
</body>
</html>