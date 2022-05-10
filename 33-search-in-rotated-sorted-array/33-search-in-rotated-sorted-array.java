class Solution {
int findIndex(int[] nums, int left, int right){
if (nums[left] <= nums[right]) return left;

    int mid = (left + right) / 2;
    
    if (nums[left] < nums[mid]) return findIndex(nums, mid, right);
    
    return findIndex(nums, left+1, mid);
}

int search(int[] nums, int left, int right, int target){
    if (target < nums[left] || target > nums[right]) return -1;
    int mid = (left + right) / 2;
    if (target == nums[mid]) return mid;
    
    if (left == right) return -1;
    
    if (target > nums[mid]) return search(nums, mid+1, right, target);
    
    return search(nums, left, mid-1, target);
}

public int search(int[] nums, int target) {
    if (nums == null || nums.length == 0) return -1;
    if (nums.length == 1) return nums[0] == target?0:-1;
    
    int index = findIndex(nums, 0, nums.length - 1);
    
    if (index == 0) return search(nums, 0, nums.length - 1, target);

    if (target >= nums[0]) return search(nums, 0, index-1, target);
    
    return search(nums, index, nums.length-1, target);
}
}