package juegodecartas;

public class AtributoMenor extends Atributo {
	
	public AtributoMenor(String nombre) {
		super.nombre = nombre;
	}
	
	public boolean equals(Object a){
		if(a instanceof AtributoMenor ){
			return (this.getNombre() == ((AtributoMenor) a).getNombre());
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
				return 1;
			else
				return -1;
		}
	}

}
