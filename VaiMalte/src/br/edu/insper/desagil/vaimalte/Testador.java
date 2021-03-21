package br.edu.insper.desagil.vaimalte;

public class Testador {
	public boolean testeA() {
		Carrinho carrinhoA = new Carrinho(); 
		
		Caixa caixaA = new Caixa();
	    
		if(caixaA.total(carrinhoA) == 0.0) {
			return true;
		}
		
		return false;	
	}

	public boolean testeB() {
		Carrinho carrinhoB = new Carrinho(); 
		
		Produto litraoQuata = new Produto(33, "litraoQuata", 13.99);
				
		carrinhoB.incrementa(litraoQuata);
		
		Caixa caixaB = new Caixa();
		
		if(caixaB.total(carrinhoB) == 13.99) {
			return true;
		}
		
		return false;	
	}

	public boolean testeC() {
		Carrinho carrinhoC = new Carrinho(); 
		
		Produto litraoSujus = new Produto(33, "litraoSujus", 15.00);
				
		carrinhoC.incrementa(litraoSujus);
		
		Caixa caixaC = new Caixa();

		caixaC.adicionaDesconto(litraoSujus, 30);
		
		if(caixaC.total(carrinhoC) == 10.50) {
			return true;
		}
		
		return false;		}

	public boolean testeD() {
		Carrinho carrinhoD = new Carrinho(); 
		
		Produto litraoSujus = new Produto(33, "litraoSujus", 15.00);
		Produto litraoQuata = new Produto(69, "litraoQuata", 13.99);
		Produto litraoSupra = new Produto(24, "litraoSupra", 20.00);
				
		carrinhoD.incrementa(litraoSujus);
		carrinhoD.incrementa(litraoQuata);
		carrinhoD.incrementa(litraoSupra);

		Caixa caixaD = new Caixa();

		caixaD.adicionaDesconto(litraoSujus, 40);
		
		if(caixaD.total(carrinhoD) == 42.99) {
			return true;
			
			
		}
		
	    return false;
	}

	public boolean testeE() {
		Carrinho carrinhoE = new Carrinho(); 
		
		Produto litraoSujus = new Produto(33, "litraoSujus", 15.00);
		Produto litraoQuata = new Produto(69, "litraoQuata", 14.00);
		Produto litraoSupra = new Produto(24, "litraoSupra", 20.00);
				
		carrinhoE.incrementa(litraoSujus);
		carrinhoE.incrementa(litraoQuata);
		carrinhoE.incrementa(litraoSupra);

		Caixa caixaE = new Caixa();

		caixaE.adicionaDesconto(litraoSujus, 40);
		caixaE.adicionaDesconto(litraoQuata, 10);
		
		if(caixaE.total(carrinhoE) == 41.6 ) {
			return true;
	}
	    return false;

	}

}
