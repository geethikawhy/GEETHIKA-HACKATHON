public class LowestID { 
    public static void main(String[] args) { 
 
        int[] studentIDs = {205, 103, 450, 120, 310}; 
 
        int lowest = studentIDs[0]; 
 
        for (int i = 1; i < studentIDs.length; i++) { 
            if (studentIDs[i] < lowest) { 
                lowest = studentIDs[i]; 
            } 
        } 
 
        System.out.println("Lowest Student ID = " + lowest); 
    }
}