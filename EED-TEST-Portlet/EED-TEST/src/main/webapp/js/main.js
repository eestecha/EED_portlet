
		var jsonRegistro = JSON.parse('${oGrid.registro}');

		function agregar() {
			jsonRegistro.clave = $("#clave").val();
			jsonRegistro.valor = $("#valor").val();
			jsonRegistro.precio = $("#precio").val();
			jsonRegistro.cantidad = $("#cantidad").val();
			jsonRegistro.importe = $("#importe").val();
			console.log( jsonRegistro );
			var ajax = $.ajax(
						{ 	  method: "POST"
							, url: "EedServlet"
							, data: jsonRegistro
//							, success: function(result){
//				    			console.log( result );
//				  			}
//							, error: function(XMLHttpRequest, textStatus, errorThrown) { 
//								alert("Status: " + textStatus); alert("Error: " + errorThrown); 
//						    }     
						});
			ajax.done( function( data, textStatus, jqXHR ) { 
							console.log( result ); 
						}
			);
			ajax.fail( function( jqXHR, textStatus, errorThrown ) { 
							alert("Fail: " + textStatus); alert("Error: " + errorThrown); 
						} 
			);
			ajax.always( function( data_jqXHR, textStatus, jqXHR_errorThrown ) { 
							alert("Always: " + textStatus); alert("Error: " + jqXHR_errorThrown); 
						} 
			);
 		}


		Liferay.Service(
			    "/user/get-user-by-email-address",
			    {
			        companyId: Liferay.ThemeDisplay.getCompanyId(),
			        emailAddress: 'test@liferay.com'
			    },
			    function(obj) {
			        console.log( "**** " + obj.companyId );
			    }
			);		