public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        sortedOrNot(arr, n);
    }
    static void sortedOrNot(int[] arr, int n) {
        if (n==0) return;
        if (arr[n-1] > arr[n-2]) {
            System.out.println("Sorted");
            return;
        }
        sortedOrNot(arr, n-1);
        System.out.println("Not Sorted");
        return;

    }
}
