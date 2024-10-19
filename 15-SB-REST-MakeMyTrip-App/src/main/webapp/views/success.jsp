<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> Please Find Ur Ticket Info </h3>

	<table>
		<tr>
			<td> Ticket Id</td>
			<td>${ticket.ticketId}</td>
		</tr>
		<tr>
			<td> Ticket Status</td>
			<td>${ticket.ticketStatus}</td>
		</tr>
		<tr>
			<td> Ticket cost</td>
			<td>${ticket.ticketCost}</td>
		</tr>
		<tr>
			<td>From</td>
			<td>${ticket.from}</td>
		</tr>
		<tr>
			<td> To </td>
			<td>${ticket.to}</td>
		</tr>
		<tr>
			<td> Train Num</td>
			<td>${ticket.trainNum}</td>
		</tr>
	</table>
	
	<a href="/">Go Back</a>
</body>
</html>