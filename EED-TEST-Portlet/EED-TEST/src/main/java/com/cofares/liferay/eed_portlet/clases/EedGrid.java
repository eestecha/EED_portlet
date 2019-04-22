package com.cofares.liferay.eed_portlet.clases;

import java.io.Serializable;
import java.util.ArrayList;

public class EedGrid implements Serializable {

	private static final long serialVersionUID = 5099598517605465166L;
	
	private EedGrid_item registro = new EedGrid_item(); 
	private ArrayList<EedGrid_item> grid = new ArrayList<EedGrid_item>();
	private int size;
	
	public void add_item(EedGrid_item e) {
		boolean isExiste = false;
		for (int i=0; i < this.getGrid().size(); i++) {
			if ( 0 == this.getGrid().get(i).compareTo( e ) ) {
				isExiste = true;
				break;
			}
		}
		if ( isExiste ) {
			System.out.println("Ya existe el elemento");;
		} else {
			this.grid.add(e);
		}
	}
	
	public void add_remove(EedGrid_item e) {
		for (int i=0; i < this.getGrid().size(); i++) {
			if ( 0 == this.getGrid().get(i).compareTo( e ) ) {
				this.grid.remove( i );
				this.grid.trimToSize();
				break;
			}
		}
	}
	
	public void precargar( int count ) {
		for (int i=0; i<count; i++) {
			EedGrid_item item = new EedGrid_item();
			item.setClave("00" + i);
			item.setValor("El número " + i);
			this.add_item(item);
		}
		this.getGrid().trimToSize();

	}	public String pintar() {
		String res = "";
		for (int i=0; i < this.getGrid().size(); i++) {
			res += "\n" + this.getGrid().get(i).toString();
		}
		return res;
	}

	public int getSize() {
		return grid.size();
	}

	public ArrayList<EedGrid_item> getGrid() {
		return grid;
	}

	public void setGrid(ArrayList<EedGrid_item> grid) {
		this.grid = grid;
	}

	public EedGrid_item getRegistro() {
		return registro;
	}

	public void setRegistro(EedGrid_item registro) {
		this.registro = registro;
	}

}
