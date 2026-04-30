
public class Second_largest_element_in_an_array {

    public static void main(String[] args) {
        int arr[] = {5, 2, 56, 21, 10, 0, 45, 9};
        int largest_num = arr[0];
        int second_largest_num = -1;
        for(int i = 1;i<arr.length-1;i++){
            if(arr[i]>largest_num){
                second_largest_num = largest_num;
                largest_num = arr[i];
            }
            else if((largest_num>arr[i])&&(arr[i]>second_largest_num)){
                second_largest_num = arr[i];
            }
        }
        System.out.print(second_largest_num);
    }
}

// What I have learned?

// Used arr[i+1] instead of arr[i] (wrong element comparison)
// Loop didn’t run through full array (i < arr.length - 1)
// Didn’t properly use the current element in conditions
// Wrong condition for updating second largest
// Logic for updating largest and secondLargest was incorrect