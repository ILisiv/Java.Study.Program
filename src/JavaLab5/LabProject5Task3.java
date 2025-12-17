public static void main()
{
    int[][] matrix = new int[10][10];
    int diagonalSum = 0;
    for (int i = 0; i < 10; i++)
    {
        matrix[i][i] = i;
        diagonalSum += i;
    }

    System.out.println("Matrix:");
    for (int k = 0; k < 100; k++)
    {
        int i = k / 10;
        int j = k % 10;

        System.out.print(matrix[i][j] + " ");
        if (j == 9)
        {
            System.out.println();
        }
    }

    System.out.println("\nSum of diagonal elements: " + diagonalSum);
}


