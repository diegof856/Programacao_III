<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Aloca��o</title>
</head>
<body>

	<h1>Bem Vindo Ao Sistema Aloca��o Do Curso De Sistemas De
		Informa��o Usando Servlets Da Unifacol!</h1>
		
	<form action="controlador" method="get">
		<input type="hidden" name="acao" value="registerCustomer">
		<button type="submit">Cadastrar Cliente</button>
	</form>

	<form action="controlador" method="get">
		<input type="hidden" name="acao" value="bookCar">
		<button type="submit">Reservar Veiculo</button>
	</form>

</body>
</html>