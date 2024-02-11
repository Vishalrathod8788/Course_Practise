public class array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of the array elements is: " + sum);
        String str = "Hello World";
        System.out.println(str.substring(0, 11));
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));
    }  // end of main method
}