/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        // int x=(1<<31)-1+(1<<31)-2;
        // System.out.println(x);
        
        int i=1;
        int j=n; 
        if(guess(n)==0) return n;
        if(n==((1<<31)-1))n--;
        
        while(i<=j){
        
       int mid=(i/2)+j/2;
            if(mid<i){
                for(int k=i;k<=j;k++){
                    if(guess(k)==0) return k;
                }
            }
       int api=guess(mid);       
        
            if(api==-1) {
                j=mid-1;                        
            }else if(api==1){ 
                i=mid+1;
            } else{
                return mid;
            }
        } 
        return -1;
        
    }
}