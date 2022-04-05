import java.util.*;

public class question8 {
    public static void main(String[] args) {
        System.out.println("CODE BY- PURVI RAWAT    ST.iD=200121039   SEC= F");
        System.out.println();
        System.out.println();
        int count1 = 0;
        int count2 = 0;
        int[] arr = { 3, 4, 6, 1, 7, 8, 9 };
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                count1++;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            count2++;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("comparision:" + count1);
        System.out.println("shifts:" + count2);
    }

}
