package br.edu.ifsp.dsw1.avaliacaoDiagnostica;

public class Main {

	
	public static void main(String[] args) {
		Marketing marketing = new Marketing();
		Purchasing purchasing = new Purchasing();
		
		Product p1 = new Product("Arroz", 103, 10.0);
		Product p2 = new Product("Feijao", 5, 12.0);
		Product p3 = new Product("Vassoura", 76, 8.0);
		
		p1.attach(purchasing);
		p1.attach(marketing);
		p2.attach(purchasing);
		p2.attach(marketing);
		p3.attach(purchasing);
		p3.attach(marketing);
		
		System.out.println(p1.getPrice());
		System.out.println(p1.getQuantity());

		p1.reduceStock(101);
		
		System.out.println();

		System.out.println(p1.getPrice());
		System.out.println(p1.getQuantity());
		
		System.out.println();
		
		p1.notifyAllObserver();
		
		System.out.println(p1.getPrice());
		System.out.println(p1.getQuantity());
	}
}
