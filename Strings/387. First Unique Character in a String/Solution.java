class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 0 )
            return -1;
        if( s.length() == 1)
            return 0;
        
        for( int i = 0 ; i < s.length() ; i ++)
        {
            char temp = s.charAt(i);
            if( s.indexOf(temp) == s.lastIndexOf(temp) )
            {
                return i;
            }
        }
        return -1;
    }
}