import java.util.Scanner;

import classes.Produto;

public class App {
    public static void main(String[] args) throws Exception {
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
	
		sc.close();
    }
}
