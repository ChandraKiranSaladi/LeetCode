class Solution {
    public String reverseVowels(String s) {
       
        if(s.length()<2)
            return s;							// Other possible solutions are to use buckets for all characters, vowels would have 
        										// true as their values. 
        										// or check each character for vowel.
        										// Remember to check for UpperCase and LowerCase.
        char[] c = s.toCharArray();
        String str = "aeiouAEIOU";
        int i = 0, j = s.length()-1;
        while( i < j ){
            
            while(i<j && str.indexOf(c[i])==-1){
                i++;
            }
            while(i<j && str.indexOf(c[j])==-1){
                j--;
            }
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++; j--;
        }
        
        return new String(c);
     }
}