/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        // System.out.println((1<<31)-1);
        long i=1;
        long j=n;
        long ans=-1;
        
        while(i<=j){
            long mid=(i+j)/2; 
            boolean b= isBadVersion((int)mid);
            
            if(!b){
                i=mid+1;
            }else{
                ans=mid;
                j=mid-1;
            }            
        }
        return (int)ans;
        
    }
}