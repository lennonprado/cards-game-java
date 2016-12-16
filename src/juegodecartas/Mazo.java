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
				System.out.println("--------------" + i + ": j1 : " + this.cartas.elementAt(i).toString());
				j1.add(this.cartas.elementAt(i));
				flag = false;
			}
			else 
			{
				System.out.println("--------------" + i + ": j2 : " + this.cartas.elementAt(i).toString());
				j2.add(this.cartas.elementAt(i));
				flag = true;
			}
		}
		
		System.out.println();
		System.out.println("Fin repartir");
		System.out.println();
		
		
	}
	
	public void jugar(Jugador j1, Jugador j2){
			
		while(!j1.isEmpty() && !j2.isEmpty()){

			if(this.atributoElegido == null){
				this.atributoElegido = j1.seleccionarAtributo();
			}

			System.out.println("Atributo elegido: " + this.atributoElegido.toString());
			System.out.println("Carta Jugador 1: " + j1.get().toString());
			System.out.println("Carta Jugador 2: " + j2.get().toString());
			
			System.out.println("--------------");
			
			if(j2.gana(this.atributoElegido) == 0){
				j1.entregarCarta();
				j2.entregarCarta();				
				this.jugar(j1, j2);
			}
			else
			{
				if(j2.gana(this.atributoElegido) == 1)
				{ 
					
					System.out.println("Gana J2");
					j2.add(j2.entregarCarta());
					j2.add(j1.entregarCarta());
					this.atributoElegido = null;
					this.jugar(j2, j1);
				}
				else
				{ 
					System.out.println("Gana J1");
					j1.add(j1.entregarCarta());
					j1.add(j2.entregarCarta());
					this.atributoElegido = null;
					this.jugar(j1, j2);
				}
			}	
		}
	}
	
}