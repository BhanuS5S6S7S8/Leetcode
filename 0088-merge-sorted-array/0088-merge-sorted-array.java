class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m] ; 
        int j = 0 ; 
        for(int i = 0; i < m ; i++){
            nums3[j] = nums1[i] ;
            j++ ; 
        }
        j = 0 ;
        int a = 0 ; 
        int b = 0 ; 
        while(a != m && b != n){
            if(nums3[a] <= nums2[b]){
                nums1[j] = nums3[a] ; 
                j++ ;
                a++ ; 
            }
            else{
                nums1[j] = nums2[b] ; 
                j++ ;
                b++ ; 
            }
        }
        while(a!=m){
            nums1[j] = nums3[a] ; 
            a++ ; 
            j++ ;
        }while(b!=n){
            nums1[j] = nums2[b] ; 
            b++ ; 
            j++ ;
        }
    }
}