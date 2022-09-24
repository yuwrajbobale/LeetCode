class Solution {
    // public boolean isEqual()
    public boolean isSubsequence(String s, String t) {
        
        if(s.length() <= 0){
            return true;
        }
        
        int j = 0;
        
        for(int i=0; i<t.length(); i++){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
            
            if(j == s.length()){
                return true;
            }
        }
        
        return false;
        
        
//         First Solution
        
//         int count = 0;
//         int start1 = 0;
//         int start2 = 0;
//         int end1 = s.length();
//         int end2 = t.length();
        
//         while(start1 < end1){
//             while(start2 < end2){
//                 if(s.charAt(start1) == t.charAt(start2)){
//                     count++;
//                     start2++;
//                     break;
//                 }
//                 start2++;
//             }
//             start1++;
//         }

//         if(s.length() == count){
//             return true;
//         }else{
//             return false;
//         }   
    }   
}