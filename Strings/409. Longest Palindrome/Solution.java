class Solution {
    public int longestPalindrome(String s) {
        if(s.length()<2)
            return s.length();
        int[] count = new int[58];
        for(char x : s.toCharArray()){
            
            count[x-'A']++;
        }
        int once = 0;
        int len = 0;
        for( int i = 0 ; i < count.length ; i ++){
            
            if(count[i]%2==0)
                len = len + count[i];
            else
            {
                len += count[i]-1;
                once++;
            }
            
        }
        if(once>0)
            len++;
        return len;
    }
}