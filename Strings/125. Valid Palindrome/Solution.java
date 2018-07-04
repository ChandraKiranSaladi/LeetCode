class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0||s==null)
            return true;
        int i = 0, j = s.length()-1; 
        while(i<j){
            char first = s.charAt(i);
            char second = s.charAt(j);
            if( !Character.isLetterOrDigit(first) ) 
            {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(second))
            {
                j--;
                continue;
            }
                if(Character.toLowerCase(first)!=Character.toLowerCase(second))
                    return false;
                i++;
                j--;
        }
        return true;
    }
}