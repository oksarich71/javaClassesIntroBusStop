import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){

        bus = new Bus("Glasgow", 100);
        person = new Person();
        bus.addPassenger(person);
        busStop = new BusStop("Glasgow");
        busStop.addQueuer(person);
    }

    @Test
    public void canCountPassengers(){
        bus.addPassenger(person);
        assertEquals(2, bus.countPassengers());
    }
    @Test
    public void canRemovePassengers() {
        bus.removePassenger();
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canTakePassengerFromStop() {
        bus.takePassengerFromBusStop(busStop);
        assertEquals(2, bus.countPassengers());
        assertEquals(0, busStop.countQueuer());


    }
}
