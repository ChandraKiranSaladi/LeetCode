class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0)
            return new int[0];
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int j = 0;
        for( int i = 0 ; i < nums1.length && j < nums2.length; i++){
            
            if(nums1[i]==nums2[j]){
                  list.add(nums1[i]);            
                  j++;
            }
            else if(nums1[i] > nums2[j]){
                  j++;i-=1;
        }
        }
        
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}