import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Violet");
        hash_map.put(2, "Orange");
        hash_map.put(3, "Purple");
        hash_map.put(4, "Pink");
        hash_map.put(5, "Black");

        System.out.println(hash_map);
        
        hash_map.remove(4);
        System.out.println("After removing Pink: " + hash_map);
        
        if(hash_map.containsValue("Green")) 									//Check if green exists in the map
            System.out.println("Green color exists in the Map");
        else 
            System.out.println("Green color does not exist in the Map"); 
        System.out.println("Size of the map is: " + hash_map.size());
    }
}
