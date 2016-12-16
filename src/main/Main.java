package main;

import java.util.Vector;
import juegodecartas.Mazo;
import juegodecartas.Carta;
import juegodecartas.Atributo;
import juegodecartas.AtributoMayor;
import juegodecartas.AtributoMenor;
import juegodecartas.Jugador;

public class Main {

	public static void main(String[] args) {
		
		// Jugadores
		Jugador j1 = new Jugador("Marcelo");
		Jugador j2 = new Jugador("Eduardo");

		// atributos
		AtributoMayor altura = new AtributoMayor("Altura");
		AtributoMayor peso = new AtributoMayor("Peso");
		AtributoMayor fuerza = new AtributoMayor("Fuerza");
		AtributoMenor peleasPerdidas = new AtributoMenor("Peleas Perdidas");
		AtributoMayor velocidad = new AtributoMayor("Velocidad");		

		
		//cartas 		
		Vector<Atributo> atributosA1 = new Vector<Atributo>();
		altura.set(205);
		atributosA1.add(altura);
		peso.set(110);
		atributosA1.add(peso);
		fuerza.set(2000);
		atributosA1.add(fuerza);
		peleasPerdidas.set(2000);
		atributosA1.add(peleasPerdidas);
		velocidad.set(400);
		atributosA1.add(velocidad);
		Carta A1 = new Carta("Superman", atributosA1);
		
		Vector<Atributo> atributosA2 = new Vector<Atributo>();
		altura.set(195);
		atributosA2.add(altura);
		peso.set(90);
		atributosA2.add(peso);
		fuerza.set(640);
		atributosA2.add(fuerza);
		peleasPerdidas.set(900);
		atributosA2.add(peleasPerdidas);
		velocidad.set(800000);
		atributosA2.add(velocidad);
		Carta A2 = new Carta("Flash", atributosA2);	
		
		Vector<Atributo> atributosA3 = new Vector<Atributo>();
		altura.set(200);
		atributosA3.add(altura);
		peso.set(120);
		atributosA3.add(peso);
		fuerza.set(400);
		atributosA3.add(fuerza);
		peleasPerdidas.set(2000);
		atributosA3.add(peleasPerdidas);
		velocidad.set(30);
		atributosA3.add(velocidad);
		Carta A3 = new Carta("Firestorm", atributosA3);

		Vector<Atributo> atributosA4 = new Vector<Atributo>();
		altura.set(177);
		atributosA4.add(altura);
		peso.set(80);
		atributosA4.add(peso);
		fuerza.set(300);
		atributosA4.add(fuerza);
		peleasPerdidas.set(2000);
		atributosA4.add(peleasPerdidas);
		velocidad.set(35);
		atributosA4.add(velocidad);
		Carta A4 = new Carta("Manhunter", atributosA4);	
		
		// Mazo
		Mazo m = new Mazo();
		m.add(A1);
		m.add(A2);
		m.add(A3);
		m.add(A4);		
		
		m.repartir(j1,j2);
		
		System.out.println("Inicia el juego");

		m.jugar(j1, j2);

		System.out.println("Fin el juego");
	
	}	
	
}
