package juegodecartas;

public class Atributo{
	
	protected String nombre;
	
	protected int valor;
	
	protected boolean mayor;
	
	public Atributo(String nombre, boolean mayor) {
		this.nombre = nombre;
		this.mayor = mayor;
	}
	
	public boolean equals(Atributo a){
		return this.getNombre() == a.getNombre();
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getValor() {
		return this.valor;
	}

	public boolean getMayor() {
		return this.mayor;
	}

	public void set(int valor){
		this.valor = valor;
	}
	
	public int gana(Atributo a){
		if(this.getValor() == a.getValor())
		{
			return 0;
		}
		else
		{
			if(this.getMayor())
			{
				if(this.getValor() < a.getValor())
					return -1;
				else
					return 1;
			}
			else
			{
				if(this.getValor() < a.getValor())
					return 1;
				else
					return -1;				
			}
		}
	}
	
	public String toString(){
		return this.nombre + " " + this.valor;
	}
}
