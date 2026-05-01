public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int total = 0;
        int actual_total = (arr.length*(arr.length+1))/2;
        for(int i = 0;i<arr.length;i++){
            total =total+arr[i];
        }
        System.out.println(actual_total-total);
    }
}
