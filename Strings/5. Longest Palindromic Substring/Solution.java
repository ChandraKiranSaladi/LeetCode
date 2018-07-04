class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0||s==null)
            return "";
        String res = "";
        int currentLength = 0;
        for( int i = 0 ; i < s.length(); i ++){
            
            if(checkPalindrome(s,i-currentLength-1,i))
            {
                res = s.substring(i-currentLength-1, i+1);
                currentLength += 2;
            }
            else
            {
                if(checkPalindrome(s,i-currentLength,i))
                {
                    
                    res = s.substring(i-currentLength, i+1);
                    currentLength += 1;
                }
            }
            
        }
        return res;
    }
    
    
    public boolean checkPalindrome(String s , int begin , int end){
        
        if(begin<0)
            return false;
        while(begin < end){
            if(s.charAt(begin++)!=s.charAt(end--))
                return false;
        }
        return true;
    }
}