import java.util.ArrayList;

public class Flights {
    private ArrayList<String> flights;
    private Planes planes;
    
    public Flights(Planes planes) {
        this.flights = new ArrayList<String>();
        this.planes = planes;
    }
    
    public void addFlight(String id, String departure, String destination) {
        String plane = this.planes.searchPlane(id);
        String fromTo = "(" + departure + "-" + destination + ")";
        String flight = plane + " " + fromTo;
        this.flights.add(flight);
    }
    
    public void printFlights() {
        for (String flight: this.flights) {
            System.out.println(flight);
        }
    }   
}
 