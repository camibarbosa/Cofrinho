package uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private Cofre cofrinho;
	
	public Menu() {
		sc = new Scanner(System.in);
		//instanciando a variavel cofrinho
		cofrinho = new Cofre();
	}
	
	public void exibirMenuPrincipal() {
		System.out.println("=============================");
		System.out.println("======= MENU COFRINHO =======");
		System.out.println("=============================");
		System.out.println("1 - Adicionar moeda");
		System.out.println("2 - Remover moeda ");
		System.out.println("3 - Listar moedas ");
		System.out.println("4 - Calcular valor total convertido para real");
		System.out.println("0 - Encerrar ");
		System.out.println("==============================================");
		System.out.println("Opcao: ");
		String opcao = sc.next();
		
		switch (opcao) {
		
			/*Adicionar moedas*/
			case "1":
				adicionarMoedas();
				exibirMenuPrincipal();
				
			/*Remover moedas*/
			
			case "2":
				removerMoedas();
				exibirMenuPrincipal();
				break;
				
			/*Listar moedas*/
			
			case "3":
				cofrinho.listagemMoedas();
				exibirMenuPrincipal();
				break;
				
			/*Valor convertido da moeda para Real*/
				
			case "4":
				double valorTotalConvertido = cofrinho.totalConvertido();
				System.out.printf("O valor total convertido para real: R$ " + "%.2f %n", (valorTotalConvertido));
				exibirMenuPrincipal();
				break;
				
			case "0":
				System.out.println("Final do progranma");
				break;
			//caso a opcao nao for escolhida
		default:
			System.out.println("Opcao invalida! Tente outra opcao");
			exibirMenuPrincipal();
			break;
		}
		
	}
	
		private void adicionarMoedas() {
			System.out.println("Escolha Moeda: ");
			System.out.println("1 - Real");
			System.out.println("2  - Dolar");
			System.out.println("3 - Euro");
			
			int opcaoMoeda = sc.nextInt();
			
			System.out.println("Digite o valor:");
			String valorStMoeda = sc.next();
			
			//metodo replace para formatar string em double
			valorStMoeda = valorStMoeda.replace(",", ".");
			double valorMoeda = Double.parseDouble(valorStMoeda); 
		
			
			Moeda m = null; //inicializando a variavel como nula
			
			if(opcaoMoeda == 1) {
				m = new Real(valorMoeda); //instanciando m e os valores da moeda
			} else if (opcaoMoeda == 2) {
				m = new Dolar(valorMoeda);
			} else if (opcaoMoeda == 3) {
				m =  new Euro(valorMoeda);
	
			} else {
				System.out.println("Moeda inexistente. Por favor digite uma das opcoes abaixo");
				adicionarMoedas();
			}
			cofrinho.adicionar(m);//chamando a variavel para adicionar a moeda	
	}
		
	//repetindo o codigo, mas agora para remover moedas
		private void removerMoedas() {
			System.out.println("Escolha Moeda: ");
			System.out.println("1 - Real");
			System.out.println("2  - Dolar");
			System.out.println("3 - Euro");
			
			int opcaoMoeda = sc.nextInt();
			
			System.out.println("Digite o valor: ");
			String valorStMoeda = sc.next();
			
			
			valorStMoeda = valorStMoeda.replace(",", ".");
			double valorMoeda = Double.parseDouble(valorStMoeda); 
			
			Moeda m = null;
			
			if(opcaoMoeda == 1) {
				m = new Real(valorMoeda);
			} else if (opcaoMoeda == 2) {
				m = new Dolar(valorMoeda);
			} else if (opcaoMoeda == 3) {
				m =  new Euro(valorMoeda);

			} else {
				System.out.println("Moeda inexistente. Por favor digite uma das opcoes abaixo"); //excecao
				adicionarMoedas();
			}
			cofrinho.remover(m);
			
	}
}
