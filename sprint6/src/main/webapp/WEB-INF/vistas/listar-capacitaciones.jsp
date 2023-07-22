
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!-- Bootstrap -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
		<!-- /Bootstrap -->
		<title>Listado de Capacitaciones</title>
	 	<link rel="stylesheet" href="<core:url value="/res/css/styles.css" />">
		<!-- Font Awesome -->
	  	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" />
	 	<!-- /Font Awesome -->
	</head>
	<body>
		<!-- Navbar -->
	    <jsp:include page="navbar.jsp"/>
	    <!-- End Navbar -->
	    
		<div class="container mt-5">
			<div class="row ">
			<h1 class="text-center">
				Listado de capacitaciones
			</h1>
			
			<!-- Tabla -->
		      <table class="table table-striped table-hover">
		        <thead class="table-dark">
		        <tr>
		          
		          <th scope="col">Rut de Cliente</th>
		          <th scope="col">Día</th>
		          <th scope="col">Hora</th>
		          <th scope="col">Lugar</th>
		          <th scope="col">Duración</th>
		          <th scope="col">Cantidad de Asistentes</th>
		        </tr>
		        </thead>
		        
		        <tbody class="table-group-divider">
		        <!-- row = fila -->
		        
		 		<core:forEach var="cap" items="${capacitaciones}">
		        <tr>
		          <td><core:out value="${cap.getCliente().getRut}"></core:out></td>
		          <td><core:out value="${cap.getDia()}"></core:out></td>
		          <td><core:out value="${cap.getHora()}"></core:out></td>
		          <td><core:out value="${cap.getLugar()}"></core:out></td>
		          <td><core:out value="${cap.getDuracion()}"></core:out></td>
		          <td><core:out value="${cap.getCantidadAsistentes()}"></core:out></td>
		        </tr>
		        
		        </core:forEach>
		   		
		        </tbody>
		        
		      </table>
					
			</div>
			<div class="row ">
				<div class="col d-flex justify-content-around">
        			<a class="btn btn-success" href="${pageContext.request.contextPath}/capacitacion/new" ><i class="mx-1 fa-solid fa-plus"></i>Ingresar Nueva Capacitación</a>
        		</div>
			</div>
			

		</div>
		
		<!-- Footer -->
	    <jsp:include page="footer.jsp"/>
	    <!-- End Footer -->
	    
		<!-- JavaScript de bootstrap -->
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
		<!-- Fin JavaScript de bootstrap -->
	</body>
</html>