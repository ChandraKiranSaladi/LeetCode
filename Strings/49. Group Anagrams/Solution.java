class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new LinkedList<List<String>>();
        HashMap<String,LinkedList<String>> map = new HashMap<>();
        
        for( String temp : strs){
            char[] c = temp.toCharArray();
            Arrays.sort(c);
            String str = String.valueOf(c);
            LinkedList<String> x = 
                map.getOrDefault(str,new LinkedList<String>());
           x.add(temp);
           map.put(str,x);
        }
        return new LinkedList<List<String>>(map.values());
    }
}