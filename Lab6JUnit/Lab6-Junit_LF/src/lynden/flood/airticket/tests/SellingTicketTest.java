package lynden.flood.airticket.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cc.airline.passengers.Passenger;
import com.cc.airline.passengers.PassengerName;
import com.cc.airline.passengers.StaffPassenger;
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.SeatingClass;
import com.cc.airline.ticketing.Ticket;

class SellingTicketTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.out.println("In the setUpBeforeClass");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		System.out.println("In the tearDownAfterClass");
	}

	
	
	@Test 
	public void sellTicketTest1() {
		SeatingClass sClass = SeatingClass.ECONOMY;
		Passenger passenger = new Passenger(
		new PassengerName("Mary", "I", "Worth"));
		Seat seat = new Seat();
		seat.setRow(3); seat.setLetter('D');
		double price = sClass.getPrice();
		Ticket ticket = new Ticket(passenger, seat, price);
		System.out.println("Ticket issued: " + ticket);
		assertEquals(ticket.getPrice(), 500.0, 0.005 );
	}
	
	@Test 
	public void sellingTicket2() {
		
		SeatingClass sClass = SeatingClass.ECONOMY;
		PassengerName pname= new PassengerName("Mary", "I", "Worth");
		StaffPassenger passenger = new StaffPassenger(
		pname, "EMP123");
	
		Seat seat = new Seat();
		seat.setRow(3); seat.setLetter('D');
		double price = sClass.getPrice();
		Ticket ticket = new Ticket(passenger, seat, price);
		System.out.println("Ticket issued: " + ticket);
		assertEquals(ticket.getPrice(), 250.0, 0.005 );
	}
	
	
	@Test 
	public void sellingTicket3() {
		
		SeatingClass sClass = SeatingClass.BUSINESS;
		PassengerName pname= new PassengerName("Mary", "I", "Worth");
		StaffPassenger passenger = new StaffPassenger(
		pname, "EMP123");
	
		Seat seat = new Seat();
		seat.setRow(1); seat.setLetter('A');
		double price = sClass.getPrice();
		Ticket ticket = new Ticket(passenger, seat, price);
		System.out.println("Ticket issued: " + ticket);
		assertEquals(ticket.getPrice(), 750, 0.005 );
	}

}
