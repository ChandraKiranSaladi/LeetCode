class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
         calc(nums, 0 , nums.length-1, list);
        return list;
    }
    
    public void calc(int[] nums , int l , int r , List<List<Integer>> list ){
        
        if( l == r){
            List<Integer> ok = new ArrayList<>();
            for(int x : nums)
                ok.add(x);
           // System.out.println(Arrays.toString(nums));
            list.add(ok);
        }
        else
        {
            for( int i = l ; i <= r ; i++){
                swap(nums, l , i );
                calc( nums , l+1, r , list);
                swap( nums , l , i );
            }
        }
    }
    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}