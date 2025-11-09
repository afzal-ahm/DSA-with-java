package Arrays;
public class Sort
{
    public static int[] sort(int[] arr)
    {
        int temp = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                if(arr[j] < arr[i])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static String pretty(int[] arr)
    {
        StringBuilder sb = new StringBuilder("[ ");
        for(int i = 0; i < arr.length; i++)
        {
            sb.append(arr[i]);
            if(i < arr.length - 1)
                sb.append(", ");
        }
        sb.append(" ]");
        return sb.toString();
    }

    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the numbers in an array");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Before sorting: " + pretty(arr));
        arr  = sort(arr);
        System.out.println("Array After sorting: " + pretty(arr));
        sc.close();
        
    }
}