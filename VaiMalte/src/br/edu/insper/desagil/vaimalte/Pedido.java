package br.edu.insper.desagil.vaimalte;

public class Pedido {

	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		super();
		this.produto = produto;
		this.quantidade = 1;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void incrementa() {
		this.quantidade += 1;
	}
	
	public double total() {
		return this.produto.getPreco() * this.quantidade;
	}
}
