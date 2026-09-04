class Solution {
    public int lastStoneWeight(int[] stones) {
        while(stones.length > 1){
            heapsort(stones) ; 
            int ans = stones[stones.length-1]-stones[stones.length-2] ;
            stones[stones.length-1] = ans ; 

            int[] newArr ;

            if(ans == 0){
                newArr = Arrays.copyOf(stones, stones.length - 2) ;
            } else{
                newArr = Arrays.copyOf(stones, stones.length - 1) ;
                newArr[newArr.length-1] = ans ; 
            }
            stones = newArr ; 
        } 
        return stones.length == 0 ? 0 : stones[0];
    }
    public void heapsort(int[] stones){
        int n = stones.length ; 
        for(int i = n/2-1 ; i >= 0 ; i--){
            heapify(stones , n , i) ; 
        }
        for(int i = n - 1; i > 0; i--){

            int temp = stones[0];
            stones[0] = stones[i];
            stones[i] = temp;

            heapify(stones, i, 0);
        }
    }
    public void heapify(int[] a , int n , int i){
        int largest = i ; 
        int left = 2*i + 1 ; 
        int right = 2*i + 2 ; 
        if(left < n && a[left] > a[largest]){
            largest = left ; 
        }        
        if(right < n && a[right] > a[largest]){
            largest = right ; 
        }
        if(largest != i){
            int swap = a[largest] ; 
            a[largest] = a[i] ; 
            a[i] = swap ; 

            heapify(a , n , largest) ; 
        }
    }
}