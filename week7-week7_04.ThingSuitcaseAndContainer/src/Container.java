import java.util.ArrayList;

public class Container {
    private int weightLimit;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase: this.suitcases) {
            totalWeight += suitcase.totalWeight();         
        }
        return totalWeight;
    }
    
    public int totalItems() {
        int totalItems = 0;
        for (Suitcase suitcase: this.suitcases) {
            totalItems++;         
        }
        return totalItems;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if ( this.weightLimit >= (this.totalWeight() + suitcase.totalWeight()) ) {
            this.suitcases.add(suitcase);    
        }
    }
    
    @Override
    public String toString() {
        if (this.totalItems() == 0) {
            return "empty (" + this.totalWeight() + " kg)"; 
        } else if (this.totalItems() == 1) {
            return this.totalItems() + " suitcase (" + this.totalWeight() + " kg)";
        } else {
            return this.totalItems() + " suitcases (" + this.totalWeight() + " kg)";
        }  
    }
    
    public void printThings() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printThings();  
        }
    }   
}


 