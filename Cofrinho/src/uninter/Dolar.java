package uninter;

public class Dolar extends Moeda {
	
	public Dolar() {
		super();
	}
	
	public Dolar(double valorDolar) {
		this.valor = valorDolar;
	}

	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
	}

	@Override
	public double converter() {
		return this.valor * 5.32;
		
	}

	@Override 
	public boolean equals(Object obj) {
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Dolar objDolar = (Dolar) obj;
		
		if (this.valor != objDolar.valor) {
			return false;
		}
		
		return true;
	}
}
