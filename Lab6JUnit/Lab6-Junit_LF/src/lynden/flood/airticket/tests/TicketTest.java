package lynden.flood.airticket.tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cc.airline.passengers.Passenger;
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.Ticket;

class TicketTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetUpBeforeClass() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void testValidTicket() {
		
		Passenger p = new Passenger();
		Seat s = new Seat();
		s.setRow(3);
		s.setLetter('c');	
		Ticket t = new Ticket(p, s, 300);
		
		assertTrue(t.getTicketNo() > 1_000_000);
		
		
	}
	
	@Test
	public void testInvalidTicket() {
		
		assertThrows(IllegalArgumentException.class,
				()-> {Ticket ticket = new Ticket(null,null, -100);});
	}

}
