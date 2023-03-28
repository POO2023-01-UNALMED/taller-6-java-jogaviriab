package vehiculos;
import java.util.ArrayList;
import java.util.List;

import vehiculos.Pais;

public class Vehiculo {
	public String placa;
	public int puertas;
	public int velocidadMaxima;
	public String nombre;
	public int precio;
	public int peso;
	public String traccion;
	public Fabricante fabricante;
	public static int cantidadVehiculos=0;
	public static int cantAuto = 0;
	public static int cantCamion = 0;
	public static int cantCamioneta = 0;
	static public List<Vehiculo> listVe = new ArrayList<Vehiculo>();
	
	public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos +=1;
		
		switch(traccion) {
		case "4X4":
			cantCamioneta +=1;
		case "4X2":
			cantCamion +=1;
		case "FWD":
			cantAuto +=1;
		}
		
		listVe.add(this);

	}
	public static String vehiculosPorTipo(){
		return"Automoviles:"+cantAuto+"\nCaminonetas:"+cantCamioneta+"\nCamiones:"+cantCamion;
	}

		
	public String getPlaca() {return this.placa;}
	public int getPuertas() {return this.puertas;}
	public int getVelocidadMaxima() {return this.velocidadMaxima;}
	public String getNombre() {return this.nombre;}
	public int getPrecio() {return this.precio;}
	public int getPeso() {return this.peso;}
	public String getTraccion() {return this.traccion;}
	public Fabricante getFabricante() {return this.fabricante;}
	public static List<Vehiculo> getListVe() {return listVe;}
	public static int getCantidadVehiculos() {return cantidadVehiculos;}
	
	
	public void setPlaca(String placa ) {this.placa = placa;}
	public void setPuertas( int puertas) {this.puertas = puertas;}
	public void setVelocidadMaxima( int velocidad) {this.velocidadMaxima= velocidad;}
	public void setNombre( String nombre) {this.nombre= nombre;}
	public void setprecio( int precio) {this.precio =precio ;}
	public void setPeso( int peso) {this.peso = peso;}
	public void setTraccion( String traccion) {this.traccion =traccion ;}
	public void setFrabicante( Fabricante fabricante) {this.fabricante = fabricante;}
	public static void setCantidadVehiculos( int cantidadVehiculos) {Vehiculo.cantidadVehiculos= cantidadVehiculos;}
	public String toString(){
		return /*"Placa:"+this.placa+"\nPuertas:"+this.puertas+"\nVelocidad Maxima:"+this.velocidadMaxima+"\nNombre:"+this.nombre+"\nPrecio"+this.precio+"\nPeso:"+
	this.peso+"\nTraccion:"+this.traccion+*/"\nFabricante:"+this.fabricante.getPais();
	}

}
