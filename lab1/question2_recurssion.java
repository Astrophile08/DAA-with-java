public class question2_recurssion {
    public static void main(String[] args) {
        System.out.println("CODE BY- PURVI RAWAT    ST.iD=200121039   SEC= F");
        System.out.println();
        System.out.println();
        int[] arr = { 1, 2, 3, 4, 5, 7, 9 };
        int target = 5;
        int ans = binary(arr, target, 0, arr.length - 1);
        System.out.println(target + " found at index:: " + ans);
        for (int i = 0; i < arr.length; i++) {
            int count = comp(arr, arr[i], 0, arr.length - 1, 0);
            System.out.println("for target: " + arr[i] + " total comparisions= " + count);
        }

    }

    static int binary(int[] arr, int target, int start, int end) {

        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (target == arr[mid])
            return mid;
        else if (arr[mid] > target)
            return binary(arr, target, start, mid - 1);
        else
            return binary(arr, target, mid + 1, end);

    }

    static int comp(int[] arr, int target, int start, int end, int c) {

        if (start > end)
            return c;
        int mid = start + (end - start) / 2;
        c++;
        if (arr[mid] == target)
            return c;
        else if (arr[mid] > target) {

            return comp(arr, target, start, mid - 1, c);
        } else {

            return comp(arr, target, mid + 1, end, c);
        }

    }

}
