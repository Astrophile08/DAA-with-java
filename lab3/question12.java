public class question12 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 10, 5, 7, 6 };
        linear(arr, 1, 0);
    }

    static void linear(int[] arr, int count, int j) {
        int max = 0;
        if (count == 4) {
            max = j;
            System.out.println("3rd max:" + arr[j]);
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            if (max == j)
                continue;
            if (arr[max] < arr[i]) {
                max = i;
            }

        }
        j = max;
        linear(arr, count + 1, j);
    }
}
