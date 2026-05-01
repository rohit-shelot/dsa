public class Moves_zeros_to_end{
    public static void main(String[] args) {
        int arr[] = {2,5,1,0,0,3,2,0,1};
        int z= 0;
        int nz = 0;
        int arr_len = arr.length;
        while(nz<arr_len){
            if(arr[nz]!=0){
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }        
    }
}
