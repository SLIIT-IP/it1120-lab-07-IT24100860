import java.util.Scanner;

public class IT24100860Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student = 1; 
        
        
        while (student <= 3) {
            int total = 0;
            int count = 0; 
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");
            
            
            while (count < 4) {
                int mark = scanner.nextInt();
                total += mark;
                count++;
            }
            
            
            double average = total / 4.0;
            System.out.println("Average is : " + average);
            
            
            if (average >= 75) {
                System.out.println("Overall Grade is : Distinction");
            } else if (average >= 50) {
                System.out.println("Overall Grade is : Credit");
            } else {
                System.out.println("Overall Grade is : Fail");
            }
            
            student++; 
            System.out.println();
        }
        
        scanner.close();
    }
}
