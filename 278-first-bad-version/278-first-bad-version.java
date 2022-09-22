/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        int mid = 0;
        int bad = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(isBadVersion(mid)){
                end = mid - 1;
                bad = mid;
            }else{
                start = mid + 1;
            }
        }
        return bad;
    }
}