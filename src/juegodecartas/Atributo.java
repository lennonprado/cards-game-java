package juegodecartas;

public abstract class Atributo {

	protected String nombre;
	
	protected float valor;

	public abstract boolean equals(Object o);
	
	public abstract int gana(Atributo a);

	public String getNombre() {
		return this.nombre;
	}

	public float getValor() {
		return this.valor;
	}

	public void set(float valor){
		this.valor = valor;
	}
	public String toString(){
		return this.nombre + " " + this.valor;
	}
	public Atributo clone(){
		Atributo aux = this;
		return aux;
	}
	
}
