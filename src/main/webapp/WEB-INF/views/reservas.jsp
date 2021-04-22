<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de reservas</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
	crossorigin="anonymous"></script>
</head>
<body>
	
	<div class="container">
		<div class="form-group">

			<h1>Listado de reservas</h1>
			<form action="Reservas" method="post">
				<p>
					Especialidad: <select name="idEspecialidad"
						id="idEspecialidad">
						<option value="">Seleccione una opción</option>
						<c:forEach items="${lesp}" var="esp">
							<option value='<c:out value="${esp.getIdespecialidad()}"/>'><c:out
									value="${esp.getDescripcion()}" /></option>
						</c:forEach>
					</select>
					<input type="submit" value="buscar" />
				</p>
			</form>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th scope="col">Paciente</th>
						<th scope="col">Doctor(a)</th>
						<th scope="col">Especialidad</th>
						<th scope="col">Fecha</th>
						<th scope="col">Hora</th>
					</tr>
				</thead>
				<c:forEach items="${lag}" var="la">
				
				<tbody>
					<tr>
						<td>${la.getPacientenombre()}</td>
						<td>${la.getDoctornombre()}</td>
						<td>${la.getDescripcion()}</td>
						<td>${la.getFecha()}</td>
						<td>${la.getHoradesde()}</td>
					</tr>
				</tbody>
				</c:forEach>
			</table>
		</div>

	</div>
</body>
</html>