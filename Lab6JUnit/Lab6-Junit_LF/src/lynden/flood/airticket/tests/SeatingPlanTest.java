package lynden.flood.airticket.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cc.airline.ticketing.SeatingPlan;


class SeatingPlanTest {
	
	


	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
			System.out.println("In setUpBeforeClass");
		
	}

	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("In tearDownAfterClass");
	}


	@BeforeEach
	void setUp() throws Exception {
		
		System.out.println("In setup");
	}

	
	@AfterEach
	void tearDown() throws Exception {
		
		System.out.println("In tearDown");
	}

	
	@Test
	public void testSeatingPlan() {
		
	SeatingPlan sp = new SeatingPlan();
	assertNotNull(sp);
	int numBusSeats = sp.getNumBusSeats();
	assertEquals(2, numBusSeats);
	assertEquals(14, sp.getTotalSeats());
	assertEquals(4, sp.getTotalRows());
		
//		fail("Not yet implemented");
	}

	
//	@Test
//	void testGetNumBusSeats() {
//		fail("Not yet implemented");
//	}

}
