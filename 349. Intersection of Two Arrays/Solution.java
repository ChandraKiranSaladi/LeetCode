class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length==0||nums2.length==0)
            return new int[] {};
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        for( int x: nums1 ){
            
            if(!map.containsKey(x))
                map.put(x,false);
        }
        for(int y : nums2){
            
            if(map.containsKey(y))
                map.put(y,true);
        }
        for(Map.Entry<Integer,Boolean> entry : map.entrySet())
        {
            if(entry.getValue()==true)
                list.add(entry.getKey());
            
        }
        
        int[] temp = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
                temp[i] = list.get(i);
    
        return temp;    
    }
}