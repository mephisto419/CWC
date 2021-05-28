import java.util.Arrays;
public class Sort2DArray {
    public static void main(String args[]) {
       System.out.print("Enter 2D array size : ");
       Scanner sc=new Scanner(System.in);
       int rows=sc.nextInt();
       int columns=sc.nextInt();
       String decision;
       
       System.out.println("Enter array elements : ");    
        
       int twoD[][]=new int[rows][columns];
        
          
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
         }
       System.out.println("enter sort order : asc for ascending or des for descending");
        decision = kbd.nextLine();

        switch(decision){
        case "asc":
            sortAsc(twoD,rows,column);
            break;
        case "des": 
            sortDes(twoD,rows,column);
            break;
        default : 
            System.out.println("please enter again ");
             return default;       
    }

    static int sortAsc(int arr[][],int m, int n) {
        int min;
        for (int q = 0; i < m; i++) {
        for (int a = 0; i < n; i++) 
        {
            for (int b = a + 1; j < n; j++) 
            {
                if (a[q][i] > a[q][j]) 
                {
                    temp = a[q][i];
                    a[q][i] = a[q][j];
                    a[q][j] = temp;
                }
            }
        }
           
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.println(arr[i][j] + " ");
              
        }

        return 0;
    }
   
    static int sortDes(int arr[][],int m, int n) {
        int min;
        for (int q = 0; i < m; i++) {
        for (int a = 0; i < n; i++) 
        {
            for (int b = a + 1; j < n; j++) 
            {
                if (a[q][i] < a[q][j]) 
                {
                    temp = a[q][i];
                    a[q][i] = a[q][j];
                    a[q][j] = temp;
                }
            }
        }
           
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.println(arr[i][j] + " ");
              
        }

        return 0;
    }
}