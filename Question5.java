package fujitsu;

public class Question5 {

	public static void main(String[] args) 
	{
		int rows = 2, columns = 3;
        int[][] aMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] bMatrix = { {-4, 5, 3}, {5, 6, 3} };

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = aMatrix[i][j] + bMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
		// TODO Auto-generated method stub

	}
	}
}



