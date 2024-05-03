import java.lang.reflect.Array;
import java.util.Arrays;

public class Large_Element {
    public static void main(String[] args) {
        int arr[]={9, 5, 1, 2, 8, 3, 7, 4, 6};
        int n = arr.length - 1;
        int res = sort(arr, n);
        System.out.println(res);
    }
    static public int sort(int arr[],int n){
        Arrays.sort(arr);
        int max = 0;
        if(n == 0){
            return max;
        }

        sort(arr, n-1);


        if(arr[n] > arr[n-1]){
            max = arr[n];
        }
        return max;
    }
}
