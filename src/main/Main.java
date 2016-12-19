package main;

import java.util.Vector;
import juegodecartas.Mazo;
import juegodecartas.Carta;
import juegodecartas.Atributo;
import juegodecartas.AtributoMayor;
import juegodecartas.AtributoMenor;
import juegodecartas.Jugador;

public class Main {
	
	static  Atributo atributoElegido;
	
	static  Vector<Carta> empates;

	public static void jugar(Jugador j1, Jugador j2){
		while(!j1.isEmpty() && !j2.isEmpty()){
			if(atributoElegido == null){
				atributoElegido = j1.seleccionarAtributo();
			}
			System.out.println("Atributo elegido por "+ j1.toString() +": " + atributoElegido.toString());
			System.out.println("Carta Jugador " + j1.toString() +": " + j1.get().toString());
			System.out.println("Carta Jugador " + j2.toString() + ": " + j2.get().toString());			
			if(j2.gana(atributoElegido) == 0){
				empates.add(j1.entregarCarta());
				empates.add(j2.entregarCarta());				
				jugar(j1, j2);
			}
			else
			{
				if(j2.gana(atributoElegido) == 1){ 					
					System.out.println("Gana Jugador " + j2.toString());
					System.out.println("--------------");
					j2.add(j2.entregarCarta());
					j2.add(j1.entregarCarta());
					if(empates != null){
						for(int i=0; i < empates.size();i++)
							j2.add(empates.elementAt(i));
						empates = null;
					}
					atributoElegido = null;
					jugar(j2, j1);
				}
				else
				{ 
					System.out.println("Gana Jugador " + j1.toString());
					System.out.println("--------------");					
					j1.add(j1.entregarCarta());
					j1.add(j2.entregarCarta());
					if(empates != null){
						for(int i=0; i < empates.size();i++)
							j1.add(empates.elementAt(i));
						empates = null;
					}
					atributoElegido = null;
					jugar(j1, j2);
				}
			}	
		}
	}
	
	
	public static void main(String[] args) {
		// Mazo
		Mazo m = new Mazo();

		// Jugadores
		Jugador j1 = new Jugador("Marcelo");
		Jugador j2 = new Jugador("Eduardo");

		// atributos
		AtributoMayor altura1 = new AtributoMayor("Altura",2.05);
		AtributoMayor peso1 = new AtributoMayor("Peso",110);
		AtributoMayor fuerza1 = new AtributoMayor("Fuerza",2000);
		AtributoMenor peleasPerdidas1 = new AtributoMenor("Peleas Perdidas",990);
		AtributoMayor velocidad1 = new AtributoMayor("Velocidad",400);				
		//cartas 		
		Vector<Atributo> atributosA1 = new Vector<Atributo>();
		atributosA1.add(altura1);
		atributosA1.add(peso1);
		atributosA1.add(fuerza1);
		atributosA1.add(peleasPerdidas1);
		atributosA1.add(velocidad1);
		Carta A1 = new Carta("Superman", atributosA1);
		if(m.pertenece(A1))
			m.add(A1);
		

		// atributos
		AtributoMayor altura2 = new AtributoMayor("Altura",1.95);
		AtributoMayor peso2 = new AtributoMayor("Peso",90);
		AtributoMayor fuerza2 = new AtributoMayor("Fuerza",840);
		AtributoMenor peleasPerdidas2 = new AtributoMenor("Peleas Perdidas",900);
		AtributoMayor velocidad2 = new AtributoMayor("Velocidad",600000);				
		//cartas 		
		Vector<Atributo> atributosA2 = new Vector<Atributo>();
		atributosA2.add(altura2);
		atributosA2.add(peso2);
		atributosA2.add(fuerza2);
		atributosA2.add(peleasPerdidas2);
		atributosA2.add(velocidad2);
		Carta A2 = new Carta("Flash", atributosA2);
		if(m.pertenece(A2))
			m.add(A2);
		
		

		// atributos
		AtributoMayor altura3 = new AtributoMayor("Altura",1.36);
		AtributoMayor peso3 = new AtributoMayor("Peso",70);
		AtributoMayor fuerza3 = new AtributoMayor("Fuerza",700);
		AtributoMenor peleasPerdidas3 = new AtributoMenor("Peleas Perdidas",815);
		AtributoMayor velocidad3 = new AtributoMayor("Velocidad",220);				
		//cartas 		
		Vector<Atributo> atributosA3 = new Vector<Atributo>();
		atributosA3.add(altura3);
		atributosA3.add(peso3);
		atributosA3.add(fuerza3);
		atributosA3.add(peleasPerdidas3);
		atributosA3.add(velocidad3);
		Carta A3 = new Carta("Firestorm", atributosA3);
		if(m.pertenece(A3))
			m.add(A3);
	
		
		// atributos
		AtributoMayor altura4 = new AtributoMayor("Altura",1.85);
		AtributoMayor peso4 = new AtributoMayor("Peso",85);
		AtributoMayor fuerza4 = new AtributoMayor("Fuerza",400);
		AtributoMenor peleasPerdidas4 = new AtributoMenor("Peleas Perdidas",950);
		AtributoMayor velocidad4 = new AtributoMayor("Velocidad",65);				
		//cartas 		
		Vector<Atributo> atributosA4 = new Vector<Atributo>();
		atributosA4.add(altura4);
		atributosA4.add(peso4);
		atributosA4.add(fuerza4);
		atributosA4.add(peleasPerdidas4);
		atributosA4.add(velocidad4);
		Carta A4 = new Carta("Manhunter", atributosA4);
		if(m.pertenece(A4))
			m.add(A4);
				
		m.repartir(j1,j2);		

		System.out.println("Inicia el juego");
		
		System.out.println("--------------");					

		jugar(j1, j2);

		System.out.println("Fin el juego");

		System.out.println("--------------");					

		if(j1.isEmpty() && j2.isEmpty()){
			System.out.println("Empate");
		}
		else{
			if(j1.isEmpty())
				System.out.println("Campeón Jugador " + j2.toString());
			else
				System.out.println("Campeón Jugador " + j1.toString());
		}				
	
	}	
	
}
