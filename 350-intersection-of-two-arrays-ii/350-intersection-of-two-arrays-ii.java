class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      
      ArrayList<Integer> al = new ArrayList<>();
      int i = 0, j = 0;
      while (i < nums1.length && j < nums2.length){
          if(nums1[i] < nums2[j])
              i++;         
          else if(nums1[i] > nums2[j])
              j++;          
          else {
              al.add(nums1[i]);
              i++;j++;
          }
      }
      int[] arr = new int[al.size()];
      i = 0;
      for(int s : al) arr[i++] = s;
      
      return arr;
  }
}