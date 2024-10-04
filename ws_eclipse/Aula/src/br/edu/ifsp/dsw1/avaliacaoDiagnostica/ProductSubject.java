package br.edu.ifsp.dsw1.avaliacaoDiagnostica;

public interface ProductSubject {
	public void attach(ProductObserver observer);
	public void detach(ProductObserver observer);
	public void notifyAllObserver();
}
