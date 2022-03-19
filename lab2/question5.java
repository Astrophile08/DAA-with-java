public class question5 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 5, 7, 10, 15, 19, 16 };
        int i = 0;
        int j = 0;

        for (i = 0; i < arr.length - 1; i++) {
            int count = 0;
            int k = i + 1;
            for (j = 0; j < arr.length ; j++) {
                if (arr[i] + arr[j] != arr[k]) {
                    k++;
                    count++;
                }

            }
            if (count == 0)
                System.out.println("i= " + i + "  j= " + j + "  k= " + k);
        }
    }

}
