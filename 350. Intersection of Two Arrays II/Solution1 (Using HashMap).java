class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0)
            return new int[0];
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int x : nums1){
                map.put(x,map.getOrDefault(x,0)+1);
        }
        
        for(int x: nums2){
            int count = map.getOrDefault(x,0);
            if(count>0){
                list.add(x);
                map.put(x,count-1);
            }
        }
        
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}