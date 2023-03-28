
package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
	public String nombre;
	public Pais pais;
	static public List<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais){
		this.nombre =nombre;
		this.pais = pais;
		fabricantes.add(this);
	}
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setPais(Pais pais) {this.pais = pais;}
	
	public String getNombre(){return this.nombre;}
	public Pais getPais() {return this.pais;}
	
	public static Fabricante fabricaMasVentas() {
		int mayor=0;
		int indice=0;
		List<Vehiculo> listVe = Vehiculo.getListVe();
		for(int j=0;j<fabricantes.size();j++) {
			int cant = 0;
			for(int i=0;i<listVe.size();i++) {
				Vehiculo elemento = listVe.get(i);
				if(elemento.getFabricante() == fabricantes.get(j)){
					cant+=1;
				}
			}
			if(cant>mayor) {
				indice = j;
				mayor = cant;
			}
		}
		return fabricantes.get(indice);
	}
}
