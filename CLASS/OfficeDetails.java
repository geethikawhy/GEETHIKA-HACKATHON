class Employee {
    String name;
    int id;
    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Manager extends Employee {
    int teammembers;

    void displayManager() {
        displayEmployee();
        System.out.println("Team Members: " + teammembers);
    }
}

public class OfficeDetails {
    public static void main(String[] args) {
        System.out.println("Office Details");

        Developer d = new Developer();
        d.name  = "Rahul";
        d.id  = 101;
        d.programmingLanguage = "Java";

        Manager m = new Manager();
        m.name = "Anjali";
        m.id = 102;
        m.teammembers = 10;
        System.out.println("Developer Details:");
        d.displayDeveloper();

        System.out.println("\nManager Details:");
        m.displayManager();
    }
}