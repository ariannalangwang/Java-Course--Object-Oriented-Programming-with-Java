import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int weightLimit;
     
    
    public Suitcase(int weightLimit) {
        this.things = new ArrayList<Thing>();
        this.weightLimit = weightLimit;
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing: this.things) {
            totalWeight += thing.getWeight();         
        }
        return totalWeight;
    }
    
    public int totalItems() {
        int totalItems = 0;
        for (Thing thing: this.things) {
            totalItems++;         
        }
        return totalItems;
    }
    
    public void addThing(Thing thing) {
        if ( this.weightLimit >= (this.totalWeight() + thing.getWeight()) ) {
            this.things.add(thing);    
        }
    }
    
    public Thing heaviestThing() {
        if (this.things.isEmpty()) {
            return null;
        }
        Thing heaviestThing = this.things.get(0);
        for (int i = 1; i < this.things.size(); i++) {
            if (this.things.get(i).getWeight() > heaviestThing.getWeight()) {
                heaviestThing = this.things.get(i);
            }
        }
        return heaviestThing;
    }
    
    @Override
    public String toString() {
        if (this.totalItems() == 0) {
            return "empty (" + this.totalWeight() + " kg)"; 
        } else if (this.totalItems() == 1) {
            return this.totalItems() + " thing (" + this.totalWeight() + " kg)";
        } else {
            return this.totalItems() + " things (" + this.totalWeight() + " kg)";
        }  
    }
    
    public void printThings() {
        for (Thing thing: this.things) {
            System.out.println(thing);
        }
    }
    
    
    

    
}
     