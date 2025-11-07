package Arrays.ArraysOfArray;

public class Max{
    public static int max(int[][] arr)
    {
        int maxNum = arr[0][0];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(maxNum <= arr[i][j])
                    maxNum = arr[i][j];
            }
        }
    
        return maxNum;
    }

    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the mumber of columns: ");
        int col = sc.nextInt();

        System.out.println("Enter the numbers in an array(row wise)");
        int[][] arr = new int[row][col];

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(" [");
        for(int i = 0; i < row; i++)
        {
            System.out.print("  [ ");
            for(int j = 0; j < col; j++)
            {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println("\b\b ],");
        }
        System.out.println(" ]");

        System.out.println("The max number in this matrix is: " + max(arr));


        sc.close();
    }
}