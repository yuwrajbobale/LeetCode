class Solution {
    public int trap(int[] height) {
        int result =0;
        int n = height.length;
        
        int RightMax[] = new int[n];
        int LeftMax[] = new int[n];
        
        RightMax[0] = height[0];
        for(int i=1; i<n; i++){
            RightMax[i] = Math.max(RightMax[i-1], height[i]);
        }
        
        LeftMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            LeftMax[i] = Math.max(LeftMax[i+1], height[i]);
        }
        
        for(int i=0; i<n; i++){
            result += (Math.min(RightMax[i], LeftMax[i]) - height[i]);
        }
        
        return result;
    }
}