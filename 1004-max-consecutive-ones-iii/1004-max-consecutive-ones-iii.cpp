class Solution {
    private:
    bool possible(vector<int> &nums,int mid,int k)
    {
        int n =nums.size();
      int count[2]={0};
      for(int i=0;i<mid;i++){
          count[nums[i]]++;
      }  
        
      if(count[0]<=k)return true;
      for(int i=mid;i<n;i++)
      {
          count[nums[i]]++;
          
          count[nums[i-mid]]--;
          
          if(count[0]<=k)return true;
      }
       return false;
    }
        
    
public:
    int longestOnes(vector<int>& nums, int k) {
      int n= nums.size();
      int ans  = n;
      int l=0,r=n;
      while(l<=r)
      {
          int mid = l+(r-l)/2;
          if(possible(nums,mid,k)==true){
              ans=mid;
              l=mid+1;
            }
          else{
            r=mid-1;  
          }
            
      }
        return ans;
    }
};