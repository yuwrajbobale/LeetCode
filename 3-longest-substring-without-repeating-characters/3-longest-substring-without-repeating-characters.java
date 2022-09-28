class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        int right = 0;
        // int count = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            if(set.add(c)){
                // count++;
                // if(count > max){
                //     max = count;
                // }
                
                max = Math.max(max, right-left+1);
                right++;
            }else{
                
                while(s.charAt(left) != c){
                    set.remove(s.charAt(left));
                    left++;
                    // count--;
                }
                set.remove(s.charAt(left));
                    left++;
                    // count--;
            }
        }
        return max;
    }
}