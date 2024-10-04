package br.edu.ifsp.dsw1.avaliacaoDiagnostica;

import java.util.List;
import java.util.ArrayList;

public class Product implements ProductSubject{
	private String name;
	private int quantity;
	private double price;
	private List<ProductObserver> observers;
	
	
	public Product(String name, int quantity, double price) {
		setName(name);
		setQuantity(quantity);
		setPrice(price);
		observers = new ArrayList<>();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(name.trim() != "") {
			this.name = name;
		}
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		if(quantity > 0) {
			this.quantity = quantity;
		}
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;	
		}
	}
	
	public boolean reduceStock(int quantity) {
		if(this.quantity >= quantity) {
			this.quantity -= quantity;
			notifyAllObserver();
			return true;
		}
		return false;
	}
	
	public void increaseStock(int quantity) {
		if(quantity >= 0) {
			this.quantity += quantity;
			notifyAllObserver();
		}
	}


	@Override
	public void attach(ProductObserver observer) {
		if(!observers.contains(observer)) {
			observers.add(observer);
		}
		
	}


	@Override
	public void detach(ProductObserver observer) {
			observers.remove(observer);
	}


	@Override
	public void notifyAllObserver() {
		for(ProductObserver obs : observers) {
			obs.update(this);
		}
	}
	
	
}
