<%@page import="tech.awakelab.jpapreventionsprint.models.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Listar Usuarios</title>
<link rel="stylesheet" href="<c:url value="/res/css/styles.css" />">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
	integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<!-- /Font Awesome -->
</head>
<body>
	<!-- Navbar -->
	<jsp:include page="navbar.jsp" />
	<!-- End Navbar -->

	<div class="container mt-5">
		<div class="row ">
			<h1 class="text-center">Listado Usuarios</h1>

<!-- 			<div> -->
<%-- 				<form action="${pageContext.request.contextPath}/lista-tipos-usuarios" method="GET" --%>
<!-- 					class="offset-1 col-10 form mb-5 mt-3"> -->
<!-- 					<select id="tipoUsuario" name="tipoUsuario" -->
<!-- 						class="form-select mb-3" aria-label="Default select example" -->
<!-- 						onchange="enviar-formulario" required> -->
<!-- 						<option value="" selected disabled>Elegir un Tipo de -->
<!-- 							Usuario</option> -->
<!-- 						<option value="Cliente">Cliente</option> -->
<!-- 						<option value="Profesional">Profesional</option> -->
<!-- 						<option value="Administrativo">Administrativo</option> -->
<!-- 					</select> -->
<!-- 					<div> -->
<!-- 						<button type="submit" -->
<!-- 							class="btn btn-primary btn-block  fs-4 col-12">Filtrar</button> -->
<!-- 					</div> -->
<!-- 				</form> -->
<!-- 			</div> -->
			<!-- Tabla -->
			<table class="table table-striped table-hover">
				<thead class="table-dark">
					<tr>

						<th scope="col">Nombre Usuario</th>
						<th scope="col">Nombre(s)</th>
						<th scope="col">Apellidos</th>
						<th scope="col">Run</th>
						<th scope="col">Fecha de Nacimiento</th>
						<th scope="col">Tipo Usuario</th>
						<th scope="col">Acciones</th>
					</tr>
				</thead>

				<tbody class="table-group-divider">
					<!-- row = fila -->
					<c:forEach var="user" items="${usuarios}">
						<tr>
							<td><c:out value="${user.getUsuario()}"></c:out></td>
							<td><c:out value="${user.getNombre()}"></c:out></td>
							<td><c:out value="${user.getApellido()}"></c:out></td>
							<td><c:out value="${user.getRun()}"></c:out></td>
							<td><c:out value="${user.getFechaNacimiento()}"></c:out></td>
							<td><c:out value="${user.getTipoUsuario()}"></c:out></td>
							<td>
							<a class="text-success" href="<c:url value='/edit/${s.id}' />"><i class="fa-solid fa-pen-to-square mx-3"></i></a>
							</td>
						</tr>
					</c:forEach>
				</tbody>

			</table>
		</div>

		<div class="row">
			<div class="col d-flex justify-content-around">
				<a class="btn btn-success" href="${pageContext.request.contextPath}/createForm"><i
					class="mx-1 fa-solid fa-plus"></i>Crear Nuevo Usuario</a>
			</div>
		</div>

	</div>

	<!-- Footer -->
	<jsp:include page="footer.jsp" />
	<!-- End Footer -->

	<!-- JavaScript de bootstrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
		integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
		crossorigin="anonymous"></script>
	<!-- Fin JavaScript de bootstrap -->

	<script src="js/listar-por-usuario.js"></script>
</body>
</html>