import java.util.*;

public class question9 {
    public static void main(String[] args) {
        System.out.println("CODE BY- PURVI RAWAT    ST.iD=200121039   SEC= F");
        System.out.println();
        System.out.println();

        int[] arr = { 4, 5, 2, 4, 1,7,8,1 };
        mergesort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        boolean a = duplicate(arr);
        if (a == true)
            System.out.println("duplicate element");
        else
            System.out.println("no duplicate element");

    }

    static void mergesort(int[] arr, int start, int end) {
        if (end - start == 1)
            return;
        int mid = (start + end) / 2;
        mergesort(arr, start, mid);

        mergesort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;

            } else {
                mix[k] = arr[j];
                j++;

            }
            k++;
        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

    static boolean duplicate(int[] arr) {
        boolean ans = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                ans = true;
                return ans;
            }
        }
        return ans;

    }

}
