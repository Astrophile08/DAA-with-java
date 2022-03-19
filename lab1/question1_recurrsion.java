public class question1_recurrsion {

    public static void main(String[] args) {
        System.out.println("CODE BY- PURVI RAWAT    ST.iD=200121039   SEC= F");
        System.out.println();
        System.out.println();
        int[] arr = { 1, 3, 2, 4, 5, 7, 6, 9 };
        int target = 5;
        int ans = linear(arr, target, 0);
        System.out.println(target + " found at index: " + ans);
        System.out.println("total comparision for each input:");
        for (int j = 0; j < arr.length; j++) {
            int count = comp(arr, arr[j], 0);
            System.out.println("for target: " + arr[j] + " total comaprisions= " + count);
        }

    }

    static int linear(int[] arr, int target, int i) {
        if (target == arr[i]) {
            return i;
        }
        return linear(arr, target, i + 1);

    }

    static int comp(int[] arr, int target, int i) {
        if (target == arr[i]) {
            return i + 1;
        }
        return comp(arr, target, i + 1);
    }
}
