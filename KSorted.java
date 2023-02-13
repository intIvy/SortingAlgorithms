import java.util.Random;
public class KSorted {
    public static void generateKSorted(int[] myArray) {
        Random rand = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt();
        }

        int k = 10;
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        for (int i = k; i < myArray.length; i++) {
            int j = i - k;
            while (j >= 0 && myArray[j] > myArray[i]) {
                int temp = myArray[j];
                myArray[j] = myArray[i];
                myArray[i] = temp;
                i--;
                j--;
            }
        }
    }


}


