package juegodecartas;

import java.util.Vector;

public class Mazo {
	
	protected Vector<Carta> cartas;
	protected Atributo atributoElegido;
	
	public Mazo() {
		this.cartas = new Vector<Carta>();
		this.atributoElegido = null;
	}

	public int cantidadCartas(){
		return this.cartas.size();
	}
	
	public void add(Carta c){
		this.cartas.addElement(c);		
	}
	
	public boolean pertenece(Carta c){
		if(this.cartas.isEmpty())
			return true;
		else
		{
			return c.equals(this.cartas.firstElement());
		}
	}
	
	public void repartir(Jugador j1, Jugador j2){
		boolean flag = true;
		for(int i = 0; i < this.cantidadCartas(); i++){
			if(flag)
			{
				j1.add(this.cartas.elementAt(i));
				flag = false;
			}
			else 
			{
				j2.add(this.cartas.elementAt(i));
				flag = true;
			}
		}	
	}
	
	public void jugar(Jugador j1, Jugador j2){
		while(!j1.isEmpty() && !j2.isEmpty()){

			if(this.atributoElegido == null){
				this.atributoElegido = j1.seleccionarAtributo();
			}				
				
			if(j2.gana(this.atributoElegido) == 0){
				this.jugar(j1, j2);
			}
			else
			{
				if(j2.gana(this.atributoElegido) == 1)
				{ 
					j2.add(j2.entregarCarta());
					j2.add(j1.entregarCarta());
					this.atributoElegido = null;
					this.jugar(j2, j1);
				}
				else
				{ 
					j1.add(j1.entregarCarta());
					j1.add(j2.entregarCarta());
					this.atributoElegido = null;
					this.jugar(j1, j2);
				}
			}	
		
		}
	}
	
}