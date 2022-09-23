class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;
        int x = nums.length-1;
        int result[] = new int[nums.length];
        
        while(start <= end){
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                result[x] = nums[start]*nums[start];
                start++;
            }else{
                
                result[x] = nums[end]*nums[end];
                end--;
            }
            x--;
        }
        return result;
    }
}