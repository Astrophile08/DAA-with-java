import java.util.*;

public class question10 {

    public static void main(String[] args) {
        System.out.println("CODE BY- PURVI RAWAT    ST.iD=200121039   SEC= F");
        System.out.println();
        System.out.println();

        int[] arr = { 4, 5, 2, 4, 1, 7, 8, 1 };
        int count = 0;
        mergesort(arr, 0, arr.length, count);
        System.out.println(Arrays.toString(arr));

    }

    static void mergesort(int[] arr, int start, int end, int c) {
        if (end - start == 1)
            return;
        int mid = (start + end) / 2;

        mergesort(arr, start, mid, c + 1);

        mergesort(arr, mid, end, c + 1);
        merge(arr, start, mid, end, 0);

    }

    static void merge(int[] arr, int s, int m, int e, int c) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
                c++;

            } else {
                mix[k] = arr[j];
                j++;
                c++;
            }
            k++;
        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
            c++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
            c++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
        System.out.println("no. of comparisions:" + c);
    }

}
