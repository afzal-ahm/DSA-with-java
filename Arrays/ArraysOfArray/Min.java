package Arrays.ArraysOfArray;
public class Min{
    public static int min(int[][] arr)
    {
        int minNum = arr[0][0];
        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] <= minNum)
                    minNum = arr[i][j];
            }
        }


        return minNum;
    }

    public static void main (String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int row = sc.nextInt();

        System.out.print("Enter the number if columns:");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the numbers in an array(row wise)");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("[");
        for(int i = 0; i < row; i++)
        { 
            System.out.print("  [ ");
            for(int j = 0; j < col; j++)
            {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println("]");
        }
        System.out.println("]");

        System.out.println("The min number in the matrix is: " + min(arr));

        sc.close();
    }
}