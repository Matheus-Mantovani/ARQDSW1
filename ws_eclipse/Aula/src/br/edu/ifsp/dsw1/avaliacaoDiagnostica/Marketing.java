package br.edu.ifsp.dsw1.avaliacaoDiagnostica;

public class Marketing implements ProductObserver{

	@Override
	public void update(Product product) {
		if(product.getQuantity() > 100) {
			product.setPrice(product.getPrice() * 0.9); //reduzir em 10%
		} else if(product.getQuantity() < 50) {
			product.setPrice(product.getPrice() / 0.82); //aumentar em 18%
		}
	}
}
