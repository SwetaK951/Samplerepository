// Find missing number in the given array.


public class Interview1{

    public  int findMissingNumber(int[] array){
        int start =0, end = array.length-1;
        
        int diff = array[0] - 0;

        while(start <= end){
            int mid = start + (end-start)/2;

            if((array[mid] - mid) == diff){
                if((array[mid +1] - (mid+1)) != diff){
                    return array[mid+1]-1;
                }
                else if(array[mid+1] - (mid+1)== diff)
                    {
                        start = mid+1;
                } 
            }
            else {
                end = mid - 1;
            }}
        return -1;
    }
    public static void main(String[] args){
        Interview1 obj = new Interview1();
        int[] arr = {3,4,5,6,7,8,10};
        System.out.println(obj.findMissingNumber(arr));
}    
}