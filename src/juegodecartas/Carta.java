package juegodecartas;

import java.util.Vector;

public class Carta {

	String nombre;

	Vector<Atributo> atributos;
	
	public Carta(String nombre, Vector<Atributo> atributos) {
		this.nombre = nombre;
		this.atributos = atributos;
	}
	
	public int cantidadAtributos(){
		return this.atributos.size();
	}
	
	public Vector<Atributo> getAtributos(){
		return this.atributos;
	}
	
	public int gana(Atributo a){
		Atributo b = this.atributos.elementAt(this.atributos.indexOf(a));
		return b.gana(a);
	}
	
	public String toString(){
		return this.nombre;
	}
	
	public boolean equals(Carta c){
		return this.atributos == c.getAtributos();	
	}
	
	

}
