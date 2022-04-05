import java.util.*;
import java.lang.Math;

public class question3 {
    public static void main(String[] args) {
        System.out.println("CODE BY- PURVI RAWAT    ST.iD=200121039   SEC= F");
        System.out.println();
        System.out.println();
        int[] arr = { 1, 3, 4, 5, 6, 7, 8, 9, 10, 13, 15, 17, 18 };
        int target = 13;
        int ans = range(arr, target);
        System.out.println(target + " found at index:: " + ans);

    }

    static int range(int[] arr, int target) {
        int start = 0;
        int end = 2;
        int i = 2;
        int ans = -1;
        while (end < arr.length) {

            int newstart = end;
            end = (int) Math.pow(2, i);
            start = newstart;
            i++;

            
            ans = binary(arr, target, start, end);

        }
        return ans;

    }

    static int binary(int[] arr, int target, int start, int end) {
        System.out.println("using binary");
        System.out.println();

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;

            } else if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return linear(arr, target, start);
    }

    static int linear(int[] arr, int target, int start) {
        System.out.println("using linear");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {

                return i;
            }

        }
        return -1;
    }
}