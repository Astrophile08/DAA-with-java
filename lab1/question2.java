public class question2 {
    public static void main(String[] args) {
        System.out.println("CODE BY- PURVI RAWAT    ST.iD=200121039   SEC= F");
        System.out.println();
        System.out.println();
        int[] arr = { 1, 2, 3, 4, 5, 7, 9 };
        int target = 5;
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                ans = mid;
                break;
            } else if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        System.out.println(target + " found at index:: " + ans);
        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            int e = arr.length - 1;
            int comp = 0;
            int an = -1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[i] == arr[mid]) {
                    an = mid;
                    break;
                } else if (arr[i] > arr[mid]) {
                    s = mid + 1;

                } else {
                    e = mid - 1;

                }
                comp++;
            }
            System.out.println("for target: " + arr[i] + " total comparisions= " + (comp + 1));
            
        }
    }

}
