class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==0)
            return -1;
        else
            if(nums.length<2)
                return nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++)
        {
            int value = map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);
            
            if(value+1>(nums.length/2))
                return nums[i];
        }
        return -1;
    }
}