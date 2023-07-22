<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="${pageContext.request.contextPath}/">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle " href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Usuario
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item disabled" href="${pageContext.request.contextPath}/listar-usuarios">Listar Usuarios</a></li>
            <li><a class="dropdown-item disabled" href="${pageContext.request.contextPath}/createForm">Crear Usuarios</a></li>
          <!-- <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Something else here(sin Servicio)</a></li>   -->
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle " href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Capacitacion
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/capacitaciones">Listar Capacitaciones</a></li>
            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/capacitacion/new">Crear Capacitaciones</a></li>
          <!-- <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Something else here(sin Servicio)</a></li>   -->
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/contacto">Contacto</a>
        </li>
      </ul>   
       <div>
       		<sec:authorize access="!isAuthenticated()">
       			<div class="d-flex justify-content-between align-items-center">
	 		 		<a href="${pageContext.request.contextPath}/login">
				    <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Login</button>
				    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				    </a>
			    </div>
			</sec:authorize>
       </div>
       
     <div>
       	<sec:authorize access="isAuthenticated()">
	     	<div class="d-flex justify-content-between align-items-center">
	    	<p class="text-white-50 mx-3 my-2"> Bienvenido <span class="fw-bold text-capitalize">
	    	<sec:authentication property="principal.username"/>
			</span> 
			 Rol: <span class="fw-bold text-capitalize"><sec:authentication property="principal.authorities"/>
			</span></p>
	
		    <a href="${pageContext.request.contextPath}/logout">
		    <button class="btn btn-outline-danger my-2 my-sm-0" type="submit">Cerrar sesión</button>
		    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		    </a>
			</div>
		</sec:authorize>
     </div>
     
    </div>
  </div>
</nav>