package juegodecartas;

import java.util.Vector;

public class Jugador {

	protected String nombre;
	
	protected Vector<Carta> cartas;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.cartas = new Vector<Carta>();
	}

	public void add(Carta c){
		
		this.cartas.add(c);
		
	}	

}
