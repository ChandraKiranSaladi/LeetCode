class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,int[]> map = new HashMap<>();
        int num;
        for(int i = 0 ; i < nums.length; i++){
            int x = nums[i];
            if(!map.containsKey(x))
                map.put(x,new int[] {1,i,i});
            else
            {
                int[] temp = map.get(x);
                temp[0]++;
                temp[2]=i;
                map.put(x,temp);
            }
        }
        int length = Integer.MIN_VALUE;
        int degree = -1;
           
        for(Map.Entry<Integer,int[]> entry : map.entrySet()){
            int[] temp = entry.getValue();
            if(temp[0]>degree){
                degree = temp[0];
                length = temp[2]-temp[1]+1;
            }
            else if (temp[0]==degree)
                length = Math.min(temp[2]-temp[1]+1,length);
        }
        
        return length;    
    }
}