class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(S.length()<3)
            return list;
        char[] c = S.toCharArray();
        
        for( int i = 0 ; i < c.length; i++)
        {
            int prev = i, end = i;
           // int length = 0;
            while(i+1!=c.length && c[i]==c[i+1])
                i++;
            end = i;
            if(end-prev+1>2){
                List<Integer> temp = new ArrayList<>();
                temp.add(prev);
                temp.add(end);
                list.add(temp);
            }
        }
        return list;
    }
}