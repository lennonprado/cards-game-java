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
	
	public Atributo seleccionarAtributo(){
		if(!this.cartas.isEmpty()){
			Vector<Atributo> atributos = this.cartas.firstElement().getAtributos();
			int atributoElegido = (int)(Math.random() * atributos.size());
			return atributos.elementAt(atributoElegido);
		}
		else
			return null;
	}
	
	public Carta get(){
		return this.cartas.firstElement();
	}
	
	public Carta entregarCarta(){
		Carta c = this.cartas.firstElement();
		this.cartas.remove(0);
		return c;
	}
	
	public boolean isEmpty(){
		return this.cartas.isEmpty();
	}

	public int gana(Atributo a){
		return this.cartas.firstElement().gana(a);
	}
}
