import java.util.*;

public class question5 {
    public static void main(String[] args) {
        System.out.println("CODE BY- PURVI RAWAT    ST.iD=200121039   SEC= F");
        System.out.println();
        System.out.println();
        int[] arr = { 1, 2, 3, 4 };

        int i = 0;

        for (i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] + arr[j] == arr[k]) {
                        System.out.println("i= " + i + " j=" + j + " k= " + k);

                    }
                }
            }
        }

    }

}
