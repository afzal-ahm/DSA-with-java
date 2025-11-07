package Arrays;

import java.util.Scanner;

public class Max {

    public static int max(int[] a)
    {   
        int maxNum = -1;

        for(int i = 0; i < a.length; i++)
        {
            if(maxNum < a[i])
                maxNum = a[i];
        }

        return maxNum;
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the size of an array:");
        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the numbers in array");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("[ ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");            
        }
        System.out.println("]");
        System.out.println("The Maximum number in an araay is: " + max(arr));
        
        sc.close();
    }
}