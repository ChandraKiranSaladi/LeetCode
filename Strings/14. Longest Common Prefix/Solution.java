class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        if(strs.length==0)
            return strs[0];
        
        String common = strs[0];
        
        for( int i = 1 ; i < strs.length; i ++)
        {
            while(common.length()!=0)
            {
                if(strs[i].startsWith(common))
                    break;
                else
                    common = common.substring(0,common.length()-1);
            }
        
        }
        return common;
    }
}