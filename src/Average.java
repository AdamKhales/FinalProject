import java.util.Arrays;
import java.util.Scanner;
public class Average {
    private int[] data = new int[5];
    private double mean;

    public Average() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Write the score number " + (i + 1));
            Scanner in = new Scanner(System.in);
            data[i] = in.nextInt();
        }
        calculateMean();
        selectionSort();
    }


    public void calculateMean() {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        mean = sum / data.length;

    }

    public void selectionSort() {
        Arrays.sort(data);
        int[] temp = new int[5];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[4-i];
        }
        data = temp;
    }

    public String toString() {
        String iLoveCoding = "Array in descending order: [ ";
        for (int i = 0; i < data.length; i++) {
            iLoveCoding += data[4 - i] + " ";
        }
        iLoveCoding += "] " + "Mean :" + mean;

        return iLoveCoding;
    }
}
