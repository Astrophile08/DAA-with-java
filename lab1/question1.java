import java.util.*;

public class question1 {
    public static void main(String[] args) {
        System.out.println("CODE BY- PURVI RAWAT    ST.iD=200121039   SEC= F");
        System.out.println();
        System.out.println();
        int[] arr = { 1, 3, 2, 4, 5, 7, 6, 9 };
        int target = 5;
        System.out.println(Arrays.toString(arr));
        System.out.println("target: " + target);
        int count = 0;
        int i = 0;

        for (i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                count++;
                break;
            }

        }
        if (count == 1) {
            System.out.println(target + " found at index:" + (i + 1));
            System.out.println();
        }
        System.out.println("total comparision for each input:");
        for (int j = 0; j < arr.length; j++) {
            int comp = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] == arr[j]) {
                    comp++;
                    break;
                }
                comp++;

            }
            System.out.println("for target: " + arr[j] + " total comparisions= " + comp);
        }

    }

}
