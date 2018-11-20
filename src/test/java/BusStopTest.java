import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop("Glasgow Queen Street");
        person = new Person();
        busStop.addQueuer(person);


    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addQueuer(person);
        assertEquals(2, busStop.countQueuer());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.removeQueuer();
        assertEquals(0, busStop.countQueuer());
    }
}
