class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
     
        int n=nums.length;
        
        if(n<3) return 0;
        
        if(n==3) return 1;
        int ans=0;
        
        int diff=nums[0]-nums[1];
        
        int count=2;
        
        for(int i=2;i<n;i++){
            int el=nums[i];
            
            if(nums[i-1]-el ==diff){
                count++;
            }
            else{
                if(count==3)
                    ans+=1;
                else if(count>3){
                int d=count-3;
                    
                    ans+=1+d;
                    
                    ans+= (d)*(d+1)/2;
                                    
                } 
                diff=nums[i-1]-nums[i];
                 count=2; 
                
            }
        }
        
        if(count==3) ans++;
        else if(count>3){
                  int d=count-3;
                    
                    ans+=1+d;
                    
                    ans+= (d)*(d+1)/2;
                      
        }
        return ans;
        
    }
}