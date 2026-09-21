class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> num3 ; 
        int i = 0 ; int j = 0 ; 
        while(i < nums1.size() && j < nums2.size()){
            if(nums1[i] < nums2[j]){
                num3.push_back(nums1[i]) ;
                i++ ; 
            }
            else {
                num3.push_back(nums2[j]) ; 
                j++ ;    
            }
        }
        while(i < nums1.size()){
            num3.push_back(nums1[i]) ; 
            i++ ; 
        }
        while(j < nums2.size()){
            num3.push_back(nums2[j]) ; 
            j++ ;     
        }
        int k = num3.size() ;
        if(k%2==0){
            k = k/2 ;
            return ((num3[k]+num3[k-1])/2.0) ;
        }else {
            k = k/2 ;
            return (num3[k]) ; 
        }
    }
};