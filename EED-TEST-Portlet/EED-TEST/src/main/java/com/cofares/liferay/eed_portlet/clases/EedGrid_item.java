package com.cofares.liferay.eed_portlet.clases;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.MathContext;

public class EedGrid_item implements Serializable, Comparable<Object> {

	private static final long serialVersionUID = 7620398602294613930L;
	
	private String clave = "";
	private String valor = "";
	private BigDecimal precio = new BigDecimal(0, new MathContext(2));
	private Long cantidad = 0L;
	private BigDecimal importe = new BigDecimal(0, new MathContext(2)); // BigDecimal.ZERO;


	@Override	
	public String toString() {
		Gson gson = new Gson(); 
    	JsonObject obj = new JsonObject();
		Object valor_N = null;
		Object valor_V = null;
       	for ( Field f : this.getClass().getDeclaredFields() ) {
			try {
				valor_N = f.getName();
				valor_V = f.get( this );
			} catch (SecurityException e) {
//				e.printStackTrace();
			} catch (IllegalArgumentException e) {
//				e.printStackTrace();
			} catch (IllegalAccessException e) {
//				e.printStackTrace();
			}
			if ( valor_N != null && valor_V != null ) {
//				obj.put(valor_N.toString(), valor_V.toString());
				JsonElement v = gson.toJsonTree(valor_V, valor_V.getClass());
				obj.add( valor_N.toString(), v );
			}
    	}
		return obj.toString();
	}

	@Override
	public int compareTo(Object o) {
		
		String yo = this.getClave();
		try {
			Field clave_otro = o.getClass().getDeclaredField("clave");
			String otro = clave_otro.get(o).toString();
			if ( yo.equalsIgnoreCase( otro ) ) {
				return 0;	// IGUALES
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return 1;	// DISTINTOS
	}	
	
	
	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

    public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
}
