class Solution {
    public String countAndSay(int n) {
        if(n < 1)
            return "";
        String str = "1";
        
        for( int i = 2; i <= n ; i++ ){
            StringBuilder build = new StringBuilder();

            int count = 1;
            int j = 0;
            while( j < str.length())
            {
               count = 1; 
            while( j+1 < str.length() && str.charAt(j) == str.charAt(j+1) ){
                count++;
                j++;
            }
          //      if(i ==6)
          //  System.out.println(" count = " + count + " char = " + str.charAt(j));
            build.append(count);
            build.append(str.charAt(j));
            j++;
            }
                
            str = build.toString();
        }
        return str;
    }
}