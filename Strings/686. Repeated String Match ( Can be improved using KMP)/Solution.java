class Solution {
    public int repeatedStringMatch(String A, String B) {
        if(A.length() == 0 || B.length() == 0)
            return -1;
        StringBuilder build  = new StringBuilder();
        int i;
        for(i = 0 ; build.length() < B.length(); i++ ){
             build.append(A);
        }
       
         if( build.indexOf(B) != -1 )
             return i;
        else if (build.append(A).indexOf(B) == -1) return -1;
        else
            return i+1;
    }
}