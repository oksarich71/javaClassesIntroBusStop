import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int countQueuer(){
        return this.queue.size();
    }

    public void addQueuer(Person person){
        this.queue.add(person);
    }

    public Person removeQueuer() {
        return this.queue.remove(0);
    }

}
