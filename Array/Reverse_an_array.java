
public class Reverse_an_array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 

        // What mistake I have made in this problem?

        // My mistake was running the loop for the entire array and using incorrect
        // swap logic, which caused elements to be swapped again after already being
        // reversed, effectively undoing the work. In an in-place reversal, each swap
        // fixes two elements at once (start and end), so only half the iterations are
        // needed. From this, I have learned that I should loop only till `n/2` and perform
        // a proper swap using a temporary variable, because continuing beyond that will 
        // reverse the array again and bring it back toward its original form.
    }
}
