class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums , 0 , nums.length-1) ; 
        return nums ; 
    }
    public void mergesort(int[] nums , int s , int l){
        if(s >= l){
            return ; 
        }
        int mid = (s + l) / 2 ; 
        mergesort(nums , s , mid ) ; 
        mergesort(nums , mid +1 , l) ; 

        merge(nums , s , mid , l) ; 
    }
    public void merge(int[] nums , int s ,int mid ,int l ){
        int[] temp = new int[l-s+1] ; 

        int i = s; 
        int j = mid+1 ;
        int k = 0 ;

        while(i <= mid && j <= l){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++] ; 
            }else {
                temp[k++] = nums[j++] ; 
            }
        } 

        while(i<=mid){
            temp[k++] = nums[i++] ; 
        }
        while(j <= l){
            temp[k++] = nums[j++] ; 
        }

        for(int x = 0 ; x < temp.length ; x++){
            nums[x+s] = temp[x] ; 
        }
    } 
}