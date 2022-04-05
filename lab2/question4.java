public class question4 {
    public static void main(String[] args) {
        System.out.println("CODE BY- PURVI RAWAT    ST.iD=200121039   SEC= F");
        System.out.println();
        System.out.println();
        int[] arr = { 1, 2, 3, 5, 6, 6, 6, 6, 6, 6, 8 };
        int target = 6;
        int first = binary(arr, target, true);
        
        int last = binary(arr, target, false);
    
        int ans = ((last - first) + 1);
        if (ans !=0)
            System.out.println("Found");
        System.out.println("no. of copies of target: " + target + " = " + ans);
    }

    static int binary(int[] arr, int target, boolean forward) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else {
                ans = mid;

                if (forward == true)
                    end = mid - 1;
                else
                    start = mid + 1;
            }

        }
        return ans;
    }
}
