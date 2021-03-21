package br.edu.insper.desagil.vaimalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {

	private Map<Integer, Integer> descontos;
	
	public Caixa() {
		super();
		this.descontos = new HashMap<>();
		
	}
	
	public void adiciona_desconto(Produto produto, int desconto) {
		
		if ( desconto > 0 && desconto < 100 ) {
			
			this.descontos.put(produto.getCodigo(), desconto);
		}
	}
	
	public double total(Carrinho carrinho){
		double total_carrinho = 0.0;
		for (Pedido pedido :carrinho.getPedidos()) {
			if (descontos.containsKey(pedido.getProduto().getCodigo())) {
				total_carrinho  += (1 - descontos.get(pedido.getProduto().getCodigo())/100) * pedido.getProduto().getPreco();
			}
			
			else {
				total_carrinho += pedido.getProduto().getPreco();
			}
		}
		
		return total_carrinho;
	}
	
}
	
	

