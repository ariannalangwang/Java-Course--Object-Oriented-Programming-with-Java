
//public class Main {
//
//    public static void main(String[] args) {
//        // Exercise 4.1 Test:
//        Thing book = new Thing("Happiness in Three Steps", 2);
//        Thing mobile = new Thing("Nokia 3210", 1);
//
//        System.out.println("Book name: " + book.getName());
//        System.out.println("Book weight: " + book.getWeight());
//
//        System.out.println("Book: " + book);
//        System.out.println("Mobile: " + mobile);
        
//        // Exercise 4.2 Test:
//        Thing book = new Thing("Happiness in three steps", 2);
//        Thing mobile = new Thing("Nokia 3210", 1);
//        Thing brick = new Thing("Brick", 4);
//
//        Suitcase suitcase = new Suitcase(5);
//        System.out.println(suitcase);      
//
//        suitcase.addThing(book);
//        System.out.println(suitcase);        
//
//        suitcase.addThing(mobile);
//        System.out.println(suitcase);         
//
//        suitcase.addThing(brick);
//        System.out.println(suitcase); 
        
//        // Exercise 4.4 Test:
//        Thing book = new Thing("Happiness in Three Steps", 2);
//        Thing mobile = new Thing("Nokia 3210", 1);
//        Thing brick = new Thing("Brick", 4);
//
//        Suitcase suitcase = new Suitcase(10);
//        suitcase.addThing(book);
//        suitcase.addThing(mobile);
//        suitcase.addThing(brick);
//
//        System.out.println("Your suitcase contains the following things:");
//        suitcase.printThings();
//        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
         
//        // Exercise 4.5 Test:
//        Thing book = new Thing("Happiness in Three Steps", 2);
//        Thing mobile = new Thing("Nokia 3210", 1);
//        Thing brick = new Thing("Brick", 4);
//
//        Suitcase suitcase = new Suitcase(10);
//        suitcase.addThing(book);
//        suitcase.addThing(mobile);
//        suitcase.addThing(brick);
//
//        Thing heaviest = suitcase.heaviestThing();
//        System.out.println("The heaviest thing: " + heaviest);
        
//        // Exercise 4.6 Test:
//        Thing book = new Thing("Happiness in Three Steps", 2);
//        Thing mobile = new Thing("Nokia 3210", 1);
//        Thing brick = new Thing("Brick", 4);
//
//        Suitcase tomsCase = new Suitcase(10);
//        tomsCase.addThing(book);
//        tomsCase.addThing(mobile);
//
//        Suitcase georgesCase = new Suitcase(10);
//        georgesCase.addThing(brick);
//
//        Container container = new Container(1000);
//        container.addSuitcase(tomsCase);
//        container.addSuitcase(georgesCase);
//
//        System.out.println(container);
        
        
//        // Exercise 4.7 Test:
//        Thing book = new Thing("Happiness in Three Steps", 2);
//        Thing mobile = new Thing("Nokia 3210", 1);
//        Thing brick = new Thing("Brick", 4);
//
//        Suitcase tomsCase = new Suitcase(10);
//        tomsCase.addThing(book);
//        tomsCase.addThing(mobile);
//
//        Suitcase georgesCase = new Suitcase(10);
//        georgesCase.addThing(brick);
//
//        Container container = new Container(1000);
//        container.addSuitcase(tomsCase);
//        container.addSuitcase(georgesCase);
//
//        System.out.println("There are the following things in the container suitcases:");
//        container.printThings();
//
//    }
//}
        
// Exercise 4.8 Test:
public class Main {
    public static void main(String[] Container) {
        
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    
    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        for (int i = 1; i <= 100; i++) {
            Thing brick = new Thing("Brick", i);
            Suitcase suitcase = new Suitcase(i);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }
   
}
 
 
