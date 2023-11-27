package org.lessons.java.pojo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ticket {
	
	static final double PRICE_KM = 0.21;
	
	private float km;
	private int age;
	
	public Ticket(float km, int age) throws Exception {
		
		setKm(km);
		setAge(age);
	}
	
	public float getKm() {
		return km;
	}

	public void setKm(float km) throws Exception {
		
		if( km < 0) {
			throw new Exception("il numero di Km deve essere positivo");
		}
		this.km = km;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception{
		
		if( age < 0) {
			throw new Exception("l'età deve essere un numero positivo");
		}
		
		this.age = age;
	}
	
	public double getTicketPrice() {
		
		
		double price = getKm() * PRICE_KM;
		
		
		if (getAge() < 18) {
			
			double discount = price * 20 / 100;
	
			price -= discount;
			
		} else if (getAge() >= 65) {
			
			
			double discount = price * 40 / 100;
	
			price -= discount;
		}
		
			BigDecimal roundedPrice = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);
		    return roundedPrice.doubleValue();
	}
	
	@Override
	public String toString() {
		
		return "\nChilometri da percorrere: " + getKm() + "km"
				+ "\nEtà passeggero: " + getAge() + " anni"
				+ "\nPrezzo biglietto totale: " + String.format("%.2f", getTicketPrice()) + "€";
	}

}
