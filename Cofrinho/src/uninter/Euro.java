package uninter;

public class Euro extends Moeda {
	public Euro() {
		super();
	}

	public Euro(double valorEuro) {
		this.valor = valorEuro;
	}

	@Override
	public void info() {
		System.out.println("Euro - " + valor);
	}

	@Override
	public double converter() {
		return this.valor * 5.46;
		
	}
	

	@Override 
	public boolean equals(Object obj) {
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Euro objEuro = (Euro) obj;
		
		if (this.valor != objEuro.valor) {
			return false;
		}
		
		return true;
	}
}
