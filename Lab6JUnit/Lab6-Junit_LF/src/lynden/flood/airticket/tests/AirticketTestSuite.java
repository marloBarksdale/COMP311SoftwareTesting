package lynden.flood.airticket.tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ SeatingPlanTest.class, SellingTicketTest.class, TicketTest.class })
public class AirticketTestSuite {

}
