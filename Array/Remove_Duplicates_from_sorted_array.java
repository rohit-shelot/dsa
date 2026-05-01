
public class Remove_Duplicates_from_sorted_array {
    static int remove_duplicates(int[] array){
        int rd = 0;
        for(int i = 1;i<array.length;i++){
            if(array[rd]!=array[i]){
                rd++;
                array[rd] = array[i];
            }
        }
        return rd+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,3,3,4,5,6,7,8};
        int rd = remove_duplicates(arr);
        for(int i = 0;i<rd;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

// Finally Learned the Remove_Duplicates_from_sorted_array. Feeling Proud now, everytime,
// I see this problem, I get scared but finally, I made it.