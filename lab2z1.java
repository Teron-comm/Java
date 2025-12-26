import java.util.random.RandomGenerator;


public class lab2z1 {

    public static void main(String[] args) {

        int randArr[] = new int[10];
        //int randArr[] = {0, 11, 13, 14, 12, 16, 17, 9, 10, 0};

        for (int i = 0; i < 10; i++) {
            randArr[i] = RandomGenerator.getDefault().nextInt(199) - 99;
            System.out.println("Random num in first arr: " + randArr[i]);
        }

        int allowNumArr[] = {10, 11, 13, 14, 12, 16, 17, 9, 10};

        checkForAllowed(randArr, allowNumArr);

        CreateReciprocalFraction(randArr);

    }


    public static void CreateReciprocalFraction(int arr[]) {

        double divideArr[] = new double[arr.length];

        try {
            for (int i = 0; i < 10; i++) {
                if (arr[i] == 0) {
                    throw new ArithmeticException("Array element number " + i + " equals zero");
                }
                divideArr[i] = 1.0 / arr[i];
                System.out.println("New num in arr: " + divideArr[i]);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        ;
    }


    public static void checkForAllowed(int arr[], int allowNumArr[]) {

        double arrWhitOutAllowNum[];
        int newArrlenth = 0;

        for (int i = 0; i < 10; i++) {

            boolean check = false;

            for (int j = 0; j < allowNumArr.length; j++) {
                if (arr[i] == allowNumArr[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                newArrlenth++;
            }
        }

        int finalArr[] = new int[newArrlenth];
        newArrlenth = 0;

        for (int i = 0; i < 10; i++) {
            boolean check = false;
            for (int j = 0; j < allowNumArr.length; j++) {
                if (arr[i] == allowNumArr[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                finalArr[newArrlenth] = arr[i];
                System.out.println("Without not allowed: " + finalArr[newArrlenth]);
                newArrlenth++;
            }
        }
    }

}
