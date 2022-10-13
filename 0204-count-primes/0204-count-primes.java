class Solution {
    public int countPrimes(int n) {
        boolean arr[] = new boolean[n];
        Arrays.fill(arr, true);
        
        
        if(n >= 1){ 
            arr[0] = false;
        }
        if(n >= 2){
            arr[1] = false;
        }
        
        for(int i=2; i*i<n; i++){
            for(int j=2*i; j<n; j+=i){
                arr[j] = false;
            }
        }
        
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i]){
                count++;
            }
        }
        
        return count;
        
    }
}