package juegodecartas;

public class AtributoMayor extends Atributo{
	
	public AtributoMayor(String nombre, double valor) {
		super.nombre = nombre;
		super.valor = valor;
	}
	
	public boolean equals(Object a){
				
		if(a instanceof AtributoMayor ){
			return (this.getNombre() == ((AtributoMayor) a).getNombre());
		}
		else
			return false;
	}
	
	public int gana(Atributo a){
		if(this.getValor() == a.getValor())
		{
			return 0;
		}
		else
		{
			if(this.getValor() < a.getValor())
				return -1;
			else
				return 1;
		}
	}
	
}
