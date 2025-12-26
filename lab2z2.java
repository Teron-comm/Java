import java.util.random.RandomGenerator;

public class lab2z2 {
    public static void main(String[] args) {

        int randArr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            randArr[i] = RandomGenerator.getDefault().nextInt(199) - 99;
            System.out.println("Random num randArr: " + randArr[i]);
        }

        filterAndDivide(randArr);


    }

    public static void filterAndDivide(int arr[]) {


        int positiveNum = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] > 0) {
                positiveNum++;
            }
        }

        System.out.println("The number of + ones: " + positiveNum);

        double positiveArr[] = new double[positiveNum];

        positiveNum = 0;

        for (int i = 0; i < 10; i++) {
            if (arr[i] > 0) {
                positiveArr[positiveNum] = arr[i] / 5.0;
                System.out.println("positiveArr[" + positiveNum + "] = " + positiveArr[positiveNum]);
                positiveNum++;
            }
        }

        for (int i = 0; i < positiveArr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < positiveArr.length; j++) {
                if (positiveArr[j] < positiveArr[minIndex]) {
                    minIndex = j;
                }
            }

            double tempArr = positiveArr[i];
            positiveArr[i] = positiveArr[minIndex];
            positiveArr[minIndex] = tempArr;

        }

        System.out.println("Sorted array positiveArr:");
        for (int i = 0; i < positiveArr.length; i++) {
            System.out.println("positiveArr[" + i + "] = " + positiveArr[i]);
        }

    }


}
