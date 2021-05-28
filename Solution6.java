import java.util.Scanner;
public class Biggest_Number 
{
    public static void main(String[] args) 
    {
        int x, y;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        if(x > y)
        { 
            System.out.print("Enter the third number:");
            y = s.nextInt();
            if(x > y)
            { 
            System.out.println("Largest number is:"+x);
            }
            else {
            System.out.println("Largest number is:"+y);
            }
        }
        else
        { 
            System.out.print("Enter the third number:");
            x = s.nextInt();
            if(x > y)
            { 
            System.out.println("Largest number is:"+x);
            }
            else {
            System.out.println("Largest number is:"+y);
            } 
            
        }
 
    }
}