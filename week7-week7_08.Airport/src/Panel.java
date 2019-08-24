import java.util.Scanner;

public class Panel {
    private Planes planes;
    private Flights flights;
    private Scanner reader;
    
    public Panel(Planes planes, Flights flights, Scanner reader) {
        this.planes = planes;
        this.flights = flights;
        this.reader = reader;
    }
    
    public void start() {
        this.airportPanel();
        System.out.println("");
        this.flightService();
    }
    
    private void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String input = this.reader.nextLine();
            if ( input.equals("1") ) {
                this.addPlane();
            } else if ( input.equals("2") ) {
                this.addFlight();
            } else if ( input.equals("x") ) {
                break;
            }
        }
    }
    
    private void addPlane() {
        System.out.print("Give plane ID: ");
        String id = this.reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(this.reader.nextLine());
        this.planes.addPlane(id, capacity);
    }
    
    private void addFlight() {
        System.out.print("Give plane ID: ");
        String id = this.reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departure = this.reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = this.reader.nextLine();
        this.flights.addFlight(id, departure, destination);
    }
    
    private void flightService() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String input = this.reader.nextLine();
            if ( input.equals("1") ) {
                this.planes.printPlanes();
            } else if ( input.equals("2") ) {
                this.flights.printFlights();
            } else if ( input.equals("3") ) {
                this.printPlaneInfo();    
            } else if ( input.equals("x") ) {
                break;
            }
        }
    }
     
    private void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String id = this.reader.nextLine();
        String plane = this.planes.searchPlane(id);
        System.out.println(plane);      
    } 
    
}
  
 