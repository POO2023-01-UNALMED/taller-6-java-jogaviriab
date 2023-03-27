
package vehiculos;

public class Fabricante {
	String nombre;
	Pais pais;
	Fabricante(String nombre,Pais Pais){
		this.nombre =nombre;
		this.pais = pais;
	}
	
	void setNombre(String nombre) {this.nombre = nombre;}
	void setPais(Pais pais) {this.pais = pais;}
	
	String getNombre(){return this.nombre;}
	Pais getpais() {return this.pais;}
	

}
