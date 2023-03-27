package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	int peso;
	String traccion;
	Fabricante fabricante;
	int cantidadVehiculo;
	static int cantAuto = 0;
	static int cantCamion = 0;
	static int cantCamioneta = 0;
	
	public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		this.cantidadVehiculo +=1;
		
		switch(traccion) {
		case "4X4":
			cantCamioneta +=1;
		case "4X2":
			cantCamion +=1;
		case "FWD":
			cantAuto +=1;
		}

	}
	static String vehiculosPorTipo(){
		return"Automoviles:"+cantAuto+"\nCaminonetas:"+cantCamioneta+"\nCamiones:"+cantCamion;
	}

		
	String getPlaca() {return this.placa;}
	int getPuertas() {return this.puertas;}
	int getVelocidadMaxima() {return this.velocidadMaxima;}
	String getnombre() {return this.nombre;}
	int getPrecio() {return this.precio;}
	int getPeso() {return this.peso;}
	String getTraccion() {return this.traccion;}
	Fabricante getFabricante() {return this.fabricante;}
	
	
	
	public String toString(){
		return "Placa:"+this.placa+"\nPuertas:"+this.puertas+"\nVelocidad Maxima:"+this.velocidadMaxima+"\nNombre:"+this.nombre+"\nPrecio"+this.precio+"\nPeso:"+
	this.peso+"\nTraccion:"+this.traccion+"\nFabricante:"+this.fabricante;
	}
	public static void main(String[]args) {
		Pais puerto = new Pais("Puerto Rico");
		Fabricante jovani = new Fabricante("jovani Vazques",puerto);
		Automovil auto1= new Automovil("444GGG","Montate en mi motora",10,100,jovani,4);
		
		System.out.print(auto1);
		
		System.out.print(vehiculosPorTipo());
		
	}
}
