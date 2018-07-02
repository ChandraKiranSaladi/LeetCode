class Solution {
    public int findShortestSubArray(int[] nums) {
            int max=nums[0];
           for(int i = 0 ; i < nums.length; i++){
                max = Math.max(nums[i],max);
           }
        int[] degree = new int[max+1];
        int[] start = new int[max+1];
        int[] end =  new int[max+1];
        
        int num;
        
        for(int i = 0 ; i < nums.length; i++){
            if(degree[nums[i]]==0){
                
                start[nums[i]]=i;
                end[nums[i]]=i;
                
            }
            else
                end[nums[i]]=i;
            
            degree[nums[i]]++;
        }
        
        int length = Integer.MAX_VALUE;
        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
                count = Math.max(degree[nums[i]],count);
           }
       
         for(int i = 0 ; i < nums.length; i++){
                if(degree[nums[i]]==count)
                   length = Math.min(end[nums[i]]-start[nums[i]]+1,length);
           }
       
        
        return length;    
    }
}