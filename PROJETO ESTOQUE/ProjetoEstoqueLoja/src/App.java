import java.util.Scanner;

import classes.Produto;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);	        		
		
		System.out.println("INFORME O NOME DO PRODUTO");
		String nomep1 = sc.next();
		System.out.println("INFORME O VALOR DO PRODUTO");
		double precop1 = sc.nextDouble();
		System.out.println("INFORME A QUANTIDADE DO PRODUTO");
		int qtdp1 = sc.nextInt();
		
		Produto p1 = new Produto(nomep1, precop1, qtdp1);		
		
		System.out.println();
		System.out.println("DADOS DO PRODUTO: " + p1);
		
		System.out.println();
		System.out.print("INFORME QUANTOS VOCÊ DESEJA ADICIONAR NO ESTOQUE: ");
		int quantidade = sc.nextInt();
		p1.AddProduto(quantidade);
		
		System.out.println();
		System.out.println("ATUALIZAÇÃO DADOS DO PRODUTO: " + p1);
		System.out.println();
		
		System.out.print("INFORME QUANTOS VOCÊ DESEJA REMOVER NO ESTOQUE: ");
		quantidade = sc.nextInt();
		p1.RemProduto(quantidade);
		System.out.println();
		System.out.println("ATUALIZAÇÃO DADOS DO PRODUTO: " + p1);
		
		sc.close();
    }
}
