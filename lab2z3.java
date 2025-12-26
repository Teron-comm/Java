import java.util.random.RandomGenerator;

public class lab2z3 {
    public static void main(String[] args) {

        int n = 4;
        int matrix[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = RandomGenerator.getDefault().nextInt(199) - 99;
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int resultArr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int maxNum = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > matrix[i][maxNum]) {
                    maxNum = j;
                }
            }
            resultArr[i] = maxNum;
        }

        System.out.println("Maximum element in each row:");
        for (int i = 0; i < n; i++) {
            resultArr[i] = resultArr[i] + 1;
            System.out.println("Row " + i + ": maxNum in place = " + resultArr[i]);
        }

    }

}
