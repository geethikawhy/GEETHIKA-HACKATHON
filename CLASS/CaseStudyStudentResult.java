public class  CaseStudyStudentResult
{
    static class StudentResult {
    // Method to calculate total
    int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }
    // Method to calculate average
    double calculateAverage(int total) {
        return total / 3.0;
    }
    // Method to calculate grade
    char calculateGrade(double average) {
        if (average >= 90)
            return 'A';
        else if (average >= 75)
            return 'B';
        else if (average >= 60)
            return 'C';
        else if (average >= 50)
            return 'D';
        else
            return 'F';
    }
    // Method to display result
    void displayResult(String name, int total, double average, char grade) {
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : " + grade);
    }
}

public class StudentResultMain {
    public static void main(String [] args) {
        StudentResult student = new StudentResult();
        String name = "Rahul";
        int mark1 = 85;
        int mark2 = 78;
        int mark3 = 92;
       int total = student.calculateTotal(mark1, mark2, mark3);
        double average = student.calculateAverage(total);
        char grade = student.calculateGrade(average);
        student.displayResult(name, total, average, grade);
    }


}
}