import java.util.Scanner;

public class IT24100860Lab7Q1A
{

    public static void main(String[] args)
    {

        Scanner value = new Scanner(System.in);

        int count,mark,sum,i;
        double average;
        char grade;

        count = 1;
        sum = 0;
        i = 0; 

        while(count <= 4)
        {

            System.out.print("Enter Subject Mark " + (i + 1) + ": ");

            mark = value.nextInt();

            sum = sum + mark;
     
            i++;

            count++;

        }

        average = sum / 4.0;
        System.out.println("Average Marks : "+ average);

        if(average >= 75)
        {
          System.out.println("Overall Grade is : distinction");
        }
          else if(average >= 50)
        {
                 System.out.println("Overall Grade is : credit");
        }
          else
        {
                 System.out.println("Overall Grade is : fail");
        }
        
    }
}
          