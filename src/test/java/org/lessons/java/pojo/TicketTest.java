package org.lessons.java.pojo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TicketTest {
	
	@Test
	public void testNegativeKm() {
		
		assertThrows(Exception.class, () -> new Ticket(-1, 10), "I km negativi devono lanciare un'eccezione");
	}

	@Test
	public void testNegativeAge() {
		
		assertThrows(Exception.class, () -> new Ticket(10, -1), "L'età se negativa deve lanciare un'eccezione");
	}
	
	@Test
	public void testFullPrice() throws Exception {
		
		Ticket t = new Ticket(10, 20);
				
		assertEquals(2.1, t.getTicketPrice(), "Il prezzo pieno viene calcolato per le persone da 18 a 65 anni");
	}
	
	@Test
	public void testUnder18price() throws Exception {
		
		Ticket t = new Ticket(10, 15);
		
		assertEquals(1.68, t.getTicketPrice(), "Il prezzo per gli andare 18 deve avere il 20% di sconto");
		
	}
	
	@Test
	public void testOver65price() throws Exception {
		
		Ticket t = new Ticket(10, 70);
		
		assertEquals(1.26 , t.getTicketPrice(), "Il prezzo per gli over 65 deve avere il 40% di sconto");
		
	}
}
