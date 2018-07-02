class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0)
            return 0;
        if(nums.length<2)
                return 0 ;
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int small,big;
            int    index = Arrays.binarySearch(nums,k+nums[i]);
                if(index>-1 && i!=index)
                {
                    small = Math.min(nums[i],nums[index]);
                    big = Math.max(nums[i],nums[index]);
                    map.put(small,big);
                }
        }
        return map.size();
    }
}