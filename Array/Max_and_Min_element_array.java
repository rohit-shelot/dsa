public class Max_and_Min_element_array{
    public static void main(String[] args){
        int arr[] = {10,9,8,7,6,5,4,3,2,1,0};
        int max_num = Integer.MIN_VALUE;
        int min_num = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max_num){
                max_num = arr[i];
            }
            if(arr[i]<min_num){
                min_num = arr[i];
            }
        }
        System.out.println(max_num);
        System.out.println(min_num);

        //What mistake I have made from this problem?

        // Answer : I wasn't considering the both condition seperately,
        // like for if(arr[i]<min_num), I was using else if keyword so that
        // I didn't got my entire result. So that I was getting wrong small value.
    }
}