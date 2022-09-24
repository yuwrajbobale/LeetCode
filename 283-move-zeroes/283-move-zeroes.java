class Solution {
    public void moveZeroes(int[] nums) {
        int start1 = 0;
        int start2 = 0;
        int end = nums.length-1;
        
        if(end == 0){
            return;
        }
        int temp;
        
        while(start1 <= end){
            if(nums[start1] == 0){
                start1++;
            }else{
                temp = nums[start1];
                nums[start1] = nums[start2];
                nums[start2] = temp;
                start1++;
                start2++;
            }
        }
        return;
    }
}