package Arrays.ArraysOfArray;

public class Sort{
    public static int[][] sort(int[][] arr)
    {
        int temp = 0;

        for(int i =  0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                for(int k = i; k < arr.length; k++)
                {
                    for(int l = j; l < arr[k].length; l++)
                    {
                        if(arr[k][l] < arr[i][j])
                        {
                            temp = arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = temp;
                        }
                    }
                }
            }
        }
        return arr;
    }
    public static String prettry2D(int[][] arr)
    {
        StringBuilder sb = new StringBuilder("\n[\n");
        for(int i = 0; i < arr.length; i++)
        {   sb.append("  [ ");
            for(int j = 0; j < arr[i].length; j++)
            {
                sb.append(arr[i][j]);
                if(j < arr[i].length - 1)
                    sb.append(", ");
            }
            sb.append(" ]");
            if(i < arr.length - 1)
                sb.append(",");
            sb.append("\n");
        }
        sb.append("]");
        return sb.toString();
    }
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        
        System.out.println("Enter the numbers in an Array(row wise)");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix before sorting" + prettry2D(arr));
        arr = sort(arr);
        System.out.println("The matrix after sorting" + prettry2D(arr));
        sc.close();
    }
}