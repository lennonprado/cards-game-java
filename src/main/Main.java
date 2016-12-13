package main;
import java.util.Vector;
import juegodecartas.Mazo;
import juegodecartas.Carta;
import juegodecartas.Atributo;
import juegodecartas.Jugador;

public class Main {

	public static void main(String[] args) {
		
		// Jugadores
		Jugador j1 = new Jugador("Marcelo");
		Jugador j2 = new Jugador("Eduardo");
		Vector<Jugador> jugadores = new Vector<Jugador>();		
		jugadores.add(j1);
		jugadores.add(j2);

		// atributos
		Atributo altura = new Atributo("Altura", true);
		Atributo peso = new Atributo("Peso", true);
		Atributo fuerza = new Atributo("Fuerza", true);
		Atributo peleasGanadas = new Atributo("Peleas Ganadas", true);
		Atributo velocidad = new Atributo("Velocidad", true);		

		
		//cartas 		
		Vector<Atributo> atributosA1 = new Vector<Atributo>();
		altura.set(205);
		atributosA1.add(altura);
		peso.set(110);
		atributosA1.add(peso);
		fuerza.set(2000);
		atributosA1.add(fuerza);
		peleasGanadas.set(2000);
		atributosA1.add(peleasGanadas);
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
		peleasGanadas.set(900);
		atributosA2.add(peleasGanadas);
		velocidad.set(800000);
		atributosA2.add(velocidad);
		Carta A2 = new Carta("Superman", atributosA2);	
		
		//etc...
		Carta A3 = new Carta("Firestorm", atributosA1);
		Carta A4 = new Carta("Manhunter", atributosA1);	
		
		// Mazo
		Mazo m = new Mazo();
		m.add(A1);
		m.add(A2);
		m.add(A3);
		m.add(A4);

		
		
		
		m.repartir(jugadores);
	}	
	
}
