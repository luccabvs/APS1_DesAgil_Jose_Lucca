package br.edu.insper.desagil.vaimalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> descontos;
	
	public Caixa() {
		super();
		this.descontos = new HashMap<>();
		
	}
	
	public void adicionaDesconto(Produto produto, int desconto) {
		if ( desconto > 0 && desconto < 100 ) {
			this.descontos.put(produto.getCodigo(), desconto);
		}
	}
	
	public double total(Carrinho carrinho){
		double totalCarrinho = 0.0;
		for (Pedido pedido : carrinho.getPedidos()){
			if (this.descontos.containsKey(pedido.getProduto().getCodigo())) {
				double desconto = this.descontos.get(pedido.getProduto().getCodigo());
				totalCarrinho  += pedido.getQuantidade() * pedido.getProduto().getPreco() * (1 - ((desconto)/100));
			}
			else {
				totalCarrinho += pedido.getQuantidade() * pedido.getProduto().getPreco();
			}
		}
		return totalCarrinho;
	}
	
}