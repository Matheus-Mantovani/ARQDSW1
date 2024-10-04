package br.edu.ifsp.dsw1.avaliacaoDiagnostica;

public class Purchasing implements ProductObserver{

	@Override
	public void update(Product product) {
		if(product.getQuantity() < 10) {
			product.increaseStock(100);
		}
	}
}
