class Solution {
     public int splitArray(int[] nums, int m) {
int sum=0;
int max=Integer.MIN_VALUE;
for(int i:nums){
max=Math.max(max,i);
sum+=i;
}
int res=0;
int l=max,r=sum;
while(l <= r){
int mid=l+(r-l)/2;
int temp=0,ss=0;
for(int i=0;i<nums.length;i++){
ss+=nums[i];
if(ss > mid){
ss=nums[i];
temp++;
}
}
temp++;
if(temp <= m){
r=mid-1;
res=mid;
}
else l=mid+1;
}
return res;
}
}