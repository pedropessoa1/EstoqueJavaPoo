package classes;

public class Produto {
    private String nome;
	private double preco;
	private int quantidade;
    
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = 0.0;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    private double totalValorEstoque() {
		return preco * quantidade;
	}
	
	public void AddProduto(int qtd) {
		this.quantidade += qtd;		
	}
	
	public void RemProduto(int qtd) {
		this.quantidade -= qtd;		
	}
	
	@Override
	public String toString() {
		return 	nome
				+ ", R$"
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " Unidades, total: R$ "
				+ String.format("%.2f", totalValorEstoque());
	}
}

