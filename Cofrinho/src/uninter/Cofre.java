package uninter;

import java.util.ArrayList;
import java.util.List;

public class Cofre {
	
	private List<Moeda> listaMoedas;
	
	public Cofre() {
		this.listaMoedas = new ArrayList<>();
	}
	
	//metodo para adicionar varias moedas na lista
	public void adicionar(Moeda m) {
		this.listaMoedas.add(m);
	}
	
	//metodo para remover moedas da lista
	public void remover(Moeda m) {
		this.listaMoedas.remove(m);
	}
	
	
	//excecoes para retornar a listagem de moedas
	public void listagemMoedas() {
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Nao existe moedas no cofrinho.");
			return; //ele retorna se houver um valor e se nao, o programa para
		}
		for (Moeda m : this.listaMoedas) {
			m.info();
		}
	}
	//excecoes para retornar o total convertido em real
	public double totalConvertido() {
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		double totalAcumulado = 0;
		
		for (Moeda m : this.listaMoedas) {
			totalAcumulado = totalAcumulado + m.converter();
		}
		return totalAcumulado; //loop
	}
	
}