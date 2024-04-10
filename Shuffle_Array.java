public class Shuffle_Array {

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] ans = new int[nums.length];

        for(int i=0; i<n; i++){
            ans[i*2] = nums[i];
            ans[i*2+1] = nums[n+i]; // Issue occurs here
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
