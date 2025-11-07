package Arrays;

public class Min {
    public static int min(int[] arr)
    {
        int minNumber = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(minNumber >= arr[i])
                minNumber = arr[i];
        }

        return minNumber;
    }

    public static void main(String[] args)
    {
        System.out.print("Enter the size of an array:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the numbers in an array");
        
        for(int i = 0;i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("[ ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + ", ");
        }

        System.out.println("\b\b ]");

        System.out.println("The Min number in an arrays is: " + min(arr));

        sc.close();
       
    }
    
}
