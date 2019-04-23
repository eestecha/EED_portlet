
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<portlet:defineObjects />


<b>EED-TEST</b>.

	<div id="registro">
		<input type="text" id="clave" value="${oGrid.registro.clave}"></input>
		<input type="text" id="valor" value="${oGrid.registro.valor}"></input>
		<input type="text" id="precio" value="${oGrid.registro.precio}"></input>
		<input type="text" id="cantidad" value="${oGrid.registro.cantidad}"></input>
		<input type="text" id="importe" value="${oGrid.registro.importe}"></input>
		<input type="button" id="btnAgregar" value="add" onclick="agregar()" />
	</div>

	<div id="eed_id_1">
		<b class="row">
			    <div class="col-sm">
			      clave
			    </div>
			    <div class="col-sm">
					valor
			    </div>
			    <div class="col-sm">
					precio
			    </div>
			    <div class="col-sm">
					cantidad
			    </div>
			    <div class="col-sm">
					importe
			    </div>
		</b>
		<c:forEach var="item" begin="0" items="${oGrid.grid}">
		<div class="row">
			    <div class="col-sm">
			      ${item.clave}
			    </div>
			    <div class="col-sm">
					${item.valor}
			    </div>
			    <div class="col-sm">
					${item.precio}
			    </div>
			    <div class="col-sm">
					${item.cantidad}
			    </div>
			    <div class="col-sm">
					${item.importe}
			    </div>
		</div>
		</c:forEach>
	</div>