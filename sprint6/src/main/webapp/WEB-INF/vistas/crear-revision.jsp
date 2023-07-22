<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
		<title>Crear Revision</title>
		<link rel="stylesheet" href="<core:url value="/res/css/styles.css" />">
		
	</head>
	<body>
		<!-- Navbar -->
	    <jsp:include page="navbar.jsp"/>
	    <!-- End Navbar -->
	    
		<div class="container mt-5">
			<!-- Codigo formulario Revision -->
			<main class="row mt-3 mb-5 " >

				<div class="mt-5 contacto">

				  <h2 class="offset-1 col-10 fs-1 text-center"><strong>Ingresar Revision</strong></h2>
				  
				  <form id="form-pago" action="${pageContext.request.contextPath}/crear-revision"  method="POST" class="mx-auto col-10 offset-1 col-sm-12 col-md-11 mb-2 mt-3">
					 
					<div class="form-group fs-3 mt-4">
						<label for="id">Rut Cliente:</label>
						<select id="id" name="id" class="form-select" aria-label="Default select example" required>
							<option value="" selected disabled>Elegir un rut de Cliente</option>
							<core:forEach var="vis" items="${visitas}">
								<option value="${vis.getId()}">${vis.getRutCliente()}</option>
					 		</core:forEach>
						</select>
						<small id="rutClienteHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
					</div>
		  
					<div class="form-group fs-3 mt-4">
					  <label for="nombreVisita">Nombre de Visita(alusivo): </label>
					  <input 
						  name="nombreVisita"
						  class="form-control fs-4" 
						  type="text" 
						  id="nombreVisita"
						   />		  
					  <small id="nombreVisitaHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
					</div> 
					<div class="form-group fs-3 mt-4">
					  <label for="detalle">Detalle: </label>
					  <input 
						  name="detalle"
						  class="form-control fs-4" 
						  type="text" 
						  id="detalle"
						   />		  
					  <small id="detalleHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
					</div> 
					<div class="form-group fs-3 mt-4">
					  <label for="estado">Estado: </label>
						<select id="estado" name="estado" class="form-select" aria-label="Default select example" required>
							<option value="" selected disabled>Elegir un estado</option>
							<option value="Sin Problemas">Sin Problemas</option>
							<option value="Con Observaciones">Con Observaciones</option>
							<option value="No aprueba">No aprueba</option>
						</select>
					  <small id="estadoHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
					</div> 					
		  
		  			<div>
					  <button class="btn btn-primary btn-block mt-4 fs-3 m-3" type="submit" >Ingresar</button>
					  <small id="finalHelp" class="form-text text-danger"> </small>
		  			</div>
				  </form>

				</div>
			  </main>
			  <!-- Fin Codigo formulario Revision -->
				 		  
		</div>
		
		<!-- Footer -->
	    <jsp:include page="footer.jsp"/>
	    <!-- End Footer -->
		
		<!-- JavaScript de bootstrap -->
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
		<!-- Fin JavaScript de bootstrap -->
		<script src="<core:url value="/res/js/validacion-capacitacion.js" />"></script>
	</body>
</html>

