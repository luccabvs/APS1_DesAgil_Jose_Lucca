package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;
	
	public Carrinho() {
		super();
		this.pedidos = new ArrayList<>();
	}

	public List<Pedido> getPedidos() {
		return this.pedidos;
	}
	
	public void incrementa(Produto produto) {
		for (Pedido pedido:this.pedidos){
			if(pedido.getProduto() == produto) {
				pedido.incrementa();
				break;
			}
		}
		Pedido novoPedido = new Pedido(produto);
		this.pedidos.add(novoPedido);
	}
}


