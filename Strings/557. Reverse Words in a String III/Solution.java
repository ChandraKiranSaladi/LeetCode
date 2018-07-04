class Solution {
    public String reverseWords(String s) {
        if(s.length()<2)
            return s;
        char[] c = s.toCharArray();
        int prev = 0;
        for( int i = 0 ; i < c.length; i ++){
            int index = s.indexOf(" ",i);       // using IndexOf is much faster than traversing the every character for whitespace check.
            if(index!=-1){
                reverse(c,prev,index-1);
                prev = index+1;
                i=prev;
            }
            else if(i == c.length-1)
                reverse(c,prev,i);

            
                                    // White Spaces before the first non whitespace character and after the last non whitespace 
                                    // doesn't matter   

                                    // Input  " Lets "   Output : " stel "   is valid. 
        }
        return new String(c);
    }
    
    public void reverse(char[] c, int begin, int end){
        if(begin>end)
            return;
        for(int i = begin; i <= (end+begin)/2; i++){
            char temp = c[i];
            c[i] = c[end-(i-begin)];
            c[end-(i-begin)] = temp;
            
        }
        
    }
}