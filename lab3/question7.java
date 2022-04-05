
public class question7 {
    public static void main(String[] args) {
        System.out.println("CODE BY- PURVI RAWAT    ST.iD=200121039   SEC= F");
        System.out.println();
        System.out.println();
        int[] arr = { 2, 5, 3, 1 };
        insertion(arr);

    }

    static void insertion(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            count2++;
            while (j >= 0 && arr[j] > temp) {

                arr[j + 1] = arr[j];
                count1++;
                count2++;
                j--;

            }
            arr[j + 1] = temp;

        }
        System.out.println("shifts:" + count1);
        System.out.println("comparision:" + (count2 - 1));
    }

}
