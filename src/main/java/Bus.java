import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {

        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Person person){
        this.passengers.add(person);
    }

    public int countPassengers() {
        return this.passengers.size();
    }

    public void removePassenger() {
         this.passengers.remove(0);
    }

    public void takePassengerFromBusStop(BusStop busStop) {
        Person person = busStop.removeQueuer();
        this.addPassenger(person);
    }





}
