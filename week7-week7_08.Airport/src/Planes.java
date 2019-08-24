import java.util.HashMap;

public class Planes {
    private HashMap<String, Integer> planes;
    
    public Planes() {
        this.planes = new HashMap<String, Integer>();     
    }
    
    public void addPlane(String id, int Capacity) {
        this.planes.put(id, Capacity);
    }
    
    public void printPlanes() {
        for (String key: this.planes.keySet()) {
            System.out.println(key + " (" + this.planes.get(key) + " ppl)");
        }
    }
    
    public String searchPlane(String id) {
        for (String key: this.planes.keySet()) {
            if (id.equals(key)) {
                return key + " (" + this.planes.get(key) + " ppl)";
            }
        }
        return null;
    }
     
}
 
 
