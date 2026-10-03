public class AssignmentScenarioThreeoneWasteManagement 
{
   static class WasteManagement {
    void displayBinNumber() {
        
        System.out.println("Bin Number: 101");
    }

    void displayWasteType() {
        System.out.println("Waste Type: Plastic");
    }

    void displayBinStatus() {
        System.out.println("Bin Status: Half Full");
    }

    public static void main(String[] args) {

        WasteManagement obj = new WasteManagement();

        obj.displayBinNumber();
        obj.displayWasteType();
        obj.displayBinStatus();
    }
}
}