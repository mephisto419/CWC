class Test {
 
    static int Count(int n)
    {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;
 
        return inv_count;
    }
 

    public static void main(String[] args)
    int n;  
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter the number of elements you want to store: ");  

     n=sc.nextInt();  

    int[] arr = new int[n];  
    System.out.println("Enter the elements of the array: ");  
    for(int i=0; i<n; i++)  
    {  
    arr[i]=sc.nextInt();  
    }  
    {
        System.out.println("Number of inversions are "
                           + Count(arr.length));
    }
}