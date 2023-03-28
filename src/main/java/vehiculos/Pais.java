package vehiculos;
import java.util.*;


public class Pais {
	public String nombre;
	static public List<Pais> paises = new ArrayList<Pais>();
	public Pais(String nombre){
		this.nombre = nombre;
		paises.add(this);
	}
	
	void setNombre(String nombre) {this.nombre = nombre;}
	
	String getNombre(){return this.nombre;}
	
	public static Pais paisMasVendedor() {
		int mayor=0;
		int indice=0;
		List<Vehiculo> listVe = Vehiculo.getListVe();
		for(int j=0;j<paises.size();j++) {
			int cant = 0;
			for(int i=0;i<listVe.size();i++) {
				Vehiculo elemento = listVe.get(i);
				if(elemento.getFabricante().getPais() == paises.get(j)){
					cant+=1;
				}
			}
			if(cant>mayor) {
				indice = j;
				mayor = cant;
			}
		}
		return paises.get(indice);
	}
	
	
	
public String toString(){
	return getNombre();
}
	

}
