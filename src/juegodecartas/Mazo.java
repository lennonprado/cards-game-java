package juegodecartas;

import java.util.Vector;

public class Mazo {
	
	protected Vector<Carta> cartas;
	
	public Mazo() {
		this.cartas = new Vector<Carta>();
	}

	public int cantidadCartas(){
		return this.cartas.size();
	}
	
	public void add(Carta c){
		this.cartas.addElement(c);		
	}
	
	public void repartir(Vector<Jugador> jugadores){
		
		int posicion = 0;
		
		for(int i = 0; i < this.cantidadCartas(); i++){
			
			if(posicion < jugadores.size())
			{
				jugadores.elementAt(posicion).add(this.cartas.elementAt(i));
				posicion++;
			}
			else
			{
				posicion=0;
				jugadores.elementAt(posicion).add(this.cartas.elementAt(i));
				posicion++;
			}			
		}	
	}
	
}