//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.newIPAdd(s));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String newIPAdd(String s)
    {
        // your code here
        
        String result = "";
        int n = s.length();
        
        for(int i=0; i<n; i++){
            String temp = "";
            while(i<n && s.charAt(i) == '0'){
                i++;
            }
            
            while(i<n && s.charAt(i) != '.'){
                temp+=s.charAt(i++);
            }
            
            if(temp.length() == 0){
                temp = "0";
            }
            result+= i<n? temp+"." : temp;
        }
        
        return result;
    
    }
}