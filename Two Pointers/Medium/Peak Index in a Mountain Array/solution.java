class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int left =0;
      int right = arr.length-1;

      while(left < arr.length-1 && arr[left]<arr[left+1]){
        left++;
      }  

      while(right > 0 && arr[right-1]>arr[right]){
        right --;
      }
      //if(left == right)
      return left;
      //else{
        //return -1; 
      //}
    }
}