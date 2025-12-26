import java.util.random.RandomGenerator;

public class lab2z4 {
    public static void main(String[] args) {

        int n = 4;
        int matrix[][] = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = RandomGenerator.getDefault().nextInt(9) - 4;
            }
        }


        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        int count = 0;
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] > 0) {
                count++;
            }
        }
        System.out.println("Count of positive num: " + count);


        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            //System.out.println(" " + i + " " + j);
            matrix[i][j] = matrix[i][j] * count;
        }


        System.out.println("Matrix after multiplying:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
