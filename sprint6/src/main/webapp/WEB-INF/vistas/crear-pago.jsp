<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
		<title>Crear Pago</title>
		<link rel="stylesheet" href="<core:url value="/res/css/styles.css" />">
		
	</head>
	<body>
		<!-- Navbar -->
	    <jsp:include page="navbar.jsp"/>
	    <!-- End Navbar -->
	    
		<div class="container mt-5">
			<!-- Codigo formulario Capacitacion -->
			<main class="row mt-3 mb-5 " >

				<div class="mt-5 contacto">

				  <h2 class="offset-1 col-10 fs-1 text-center"><strong> Crear Pago </strong></h2>
				  
				  <form id="form-pago" action="${pageContext.request.contextPath}/pagos/createPago"  method="POST" class="mx-auto col-10 offset-1 col-sm-12 col-md-11 mb-2 mt-3">
					 
					<div class="form-group fs-3 mt-4">
						<label for="metodoPago">Método de Pago:</label>
						<select id="metodoPago" name="metodoPago" class="form-select" aria-label="Default select example" >
							<option value="" selected disabled>Elegir un Tipo de Pago</option>
							<option value="Efectivo">Efectivo</option>
							<option value="Credito">Credito</option>
							<option value="Debito">Debito</option>
						</select>
						<small id="metodoPagoHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
					</div>
		  
					<div class="form-group fs-3 mt-4">
					  <label for="cantidadPago">Cantidad del Pago: </label>
					  <input 
						  name="cantidadPago"
						  class="form-control fs-4" 
						  type="number" 
						  id="cantidadPago"
						   />		  
					  <small id="diaHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
					</div> 
		  
		  			<div>
					  <button class="btn btn-primary btn-block mt-4 fs-3 m-3" type="submit" >Registrar Pago</button>
					  <small id="finalHelp" class="form-text text-danger"> </small>
		  			</div>
				  </form>

				</div>
			  </main>
			  <!-- Fin Codigo formulario Capacitacion -->
				 		  
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