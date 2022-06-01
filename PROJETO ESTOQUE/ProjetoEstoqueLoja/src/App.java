import java.util.Scanner;

import classes.Produto;

public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< Updated upstream
        Scanner sc = new Scanner(System.in);	        		
		System.out.println("QUANTOS CADASTROS DESEJA REALIZAR?");
		int qtdCad = sc.nextInt();
		Produto[] vetProd = new Produto[qtdCad];
		for (int i = 0; i < qtdCad; i++) {
			System.out.println("INFORME O NOME DO PRODUTO");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("INFORME O VALOR DO PRODUTO");
			double preco = sc.nextDouble();	
			
			vetProd[i] = new Produto(nome, preco);
		}

		double acValor = 0.0;
		for (int i = 0; i < vetProd.length; i++) {
			acValor += vetProd[i].getPreco();
		}
		double media = acValor / vetProd.length;
		System.out.printf("A MÉDIA DO PREÇO DOS PRODUTOS É %.2f", media);
	
=======
        Scanner sc = new Scanner(System.in);	        	
		System.out.println("Quanto deseja realizar ");
		int qtdCad = sc.nextInt();
		
		Produto[] vetProd = new Produto[qtdCad];

		for(int i = 0; i < qtdCad; i++){

			System.out.println("Informe o nome do produto");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Informe o valor ");
			double preco = sc.nextDouble();

		}

>>>>>>> Stashed changes
		sc.close();
    }
}
