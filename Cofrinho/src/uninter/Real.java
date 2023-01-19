package uninter;

public class Real extends Moeda {
	
	public Real() {
		super();
	}

	public Real(double valorReal) {
		this.valor = valorReal;
	}

	@Override
	public void info() {
	System.out.println("Real - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Real objReal = (Real) obj;
		
		if (this.valor != objReal.valor) {
			return false;
		}
		
		return true;
	}
	

}

