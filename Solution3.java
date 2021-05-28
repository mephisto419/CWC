import java.io.*;
 
class Test {
     
    static void Trib(int n)
    {
        if (n < 1)
            return;

        int second = 0,first;
        int third = 1;
     
        
        if (n > 1)
            System.out.print(second + " ");
         
        if (n > 2)
            System.out.print(second + " ");
     

        for (int i = 3; i < n; i++)
        {
            int curr =  second + third;
            first = second;
            second = third;
            third = curr;
     
            System.out.print(curr +" ");
        }
    }
     
    public static void main(String args[])
    {
        int n = 10;
        Trib(n);
    }
}