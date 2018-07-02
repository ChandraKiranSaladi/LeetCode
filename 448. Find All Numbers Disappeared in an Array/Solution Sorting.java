class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums.length==0)
            return new ArrayList<>();
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int num = 1;
        int i = 0;
        while(num <= nums.length){
            if(i >= nums.length ){
                while(num <= nums.length)
                    list.add(num++);
                return list;
            }
           else if(nums[i]!=num){
                list.add(num);
            }
            else{
                while(i+1!=nums.length && nums[i]==nums[i+1])
                    i++;
                i++;
            }
            num++;
        }
        return list;
    }
}