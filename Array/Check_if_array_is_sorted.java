public class Check_if_array_is_sorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.print("Array is not sorted");
            }
            else{
                System.out.println("Array is Sorted.");
            }
        }
    }
}

//What I have learned

// I need to take care of the Index out of bound so that iteration should work properly and there
// shouldn't be compile error. my mistake, I didin't did arr.length-1; in for loop so that it did gave
// me error in index out of bound in last compiled result.



