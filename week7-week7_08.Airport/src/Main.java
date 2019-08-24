import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        
//        // Testing Classes: Planes and Flights 
//        Planes planes = new Planes();
//        planes.addPlane("HA-LOL", 42);
//        planes.addPlane("G-OWAC", 101);
//        planes.printPlanes();
//        
//        Flights flights = new Flights(planes);
//        flights.addFlight("HA-LOL", "BAL", "HEL");
//        flights.addFlight("G-OWAC", "JFK", "BAL");
//        flights.printFlights();
        
        // Testing the whole program:
        Scanner reader = new Scanner(System.in);
        Planes planes = new Planes();
        Flights flights = new Flights(planes);
        Panel panel = new Panel(planes, flights, reader);
        panel.start();
        
    }
}
 