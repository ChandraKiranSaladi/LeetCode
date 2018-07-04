class Solution {
    public int numDecodings(String s) {
        if(s.length()==0 )
            return 0;
       
         int[] solutions = new int[s.length()+1];
             solutions[1] = s.charAt(0) != '0' ? 1 : 0;
             solutions[0] = 1;
         for( int i = 2 ; i < solutions.length ; i ++){
           
             int lastTwoCharacters = Integer.parseInt(s.substring(i-2,i));
            if(lastTwoCharacters <27 && lastTwoCharacters >9 )
                solutions[i] += solutions[i-2]; 
           //  System.out.println("solutions["+ i + "] = "+ solutions[i] +"s.substring(i-2,i) = "+ s.substring(i-2,i));
                
            if(s.charAt(i-1) > '0' && s.charAt(i-1) <= '9')   
                solutions[i] += solutions[i-1];
            }
        
        return solutions[s.length()];
    }
}
