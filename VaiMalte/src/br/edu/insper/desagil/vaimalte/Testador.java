package br.edu.insper.desagil.vaimalte;

public class Testador {
	public boolean testeA() {
		Carrinho carrinho_A = new Carrinho(); 
		
		Caixa caixa_A = new Caixa();
	    
		if(caixa_A.total(carrinho_A) == 0.0) {
			return true;
		}
		
		return false;	
	}

	public boolean testeB() {
		Carrinho carrinho_B = new Carrinho(); 
		
		Produto Litrao_do_Quata = new Produto(33, "Litrao_do_Quata", 13.99);
				
		carrinho_B.incrementa(Litrao_do_Quata);
		
		Caixa caixa_B = new Caixa();
		
		if(caixa_B.total(carrinho_B) == 13.99) {
			return true;
		}
		
		return false;	
	}

	public boolean testeC() {
		Carrinho carrinho_C = new Carrinho(); 
		
		Produto Litrao_do_Sujus = new Produto(33, "Litrao_do_Sujus", 15.00);
				
		carrinho_C.incrementa(Litrao_do_Sujus);
		
		Caixa caixa_C = new Caixa();

		caixa_C.adiciona_desconto(Litrao_do_Sujus, 30);
		
		if(caixa_C.total(carrinho_C) == 10.50) {
			return true;
		}
		
		return false;		}

	public boolean testeD() {
	    return false;
	}

	public boolean testeE() {
	    return false;
	}

}
