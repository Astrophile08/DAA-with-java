public class question6 {
    public static void main(String[] args) {
        System.out.println("CODE BY- PURVI RAWAT    ST.iD=200121039   SEC= F");
        System.out.println();
        System.out.println();
        int[] arr = { 1, 3, 20, 4, 5, 7, 10, 15, 2, 16 };
        int target = 2;
        System.out.println("target: " + target);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] - arr[j] == 2) {
                    System.out.println("pairs of indexes are: " + i + "," + j);
                }
            }
        }
    }
}
