public class AssignmentScenarioThreetwoWasteCollection
 {
   public static void main(String[] args) {

        int[] waste = {10, 20, 15, 25, 30};

        int total = 0;

        for (int i = 0; i < 5; i++) {
            total = total + waste[i];
        }

        System.out.println("Total Waste Collected: " + total);
    }
}

