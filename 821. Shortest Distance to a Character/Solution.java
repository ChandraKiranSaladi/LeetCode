class Solution {
    public int[] shortestToChar(String S, char C) {
        if(S.length()==0)
            return new int[] {};
        int[] dist = new int[S.length()];
        char[] c = S.toCharArray();
        int prev = -1,curr = 0;
        int i = 0;
        while( i < c.length )
        {
            while(curr!=c.length && c[curr]!=C)
                curr++;
            while( i < c.length && i <= curr){
                if(prev==-1)
                    dist[i] = curr-i;
                else if(curr==c.length){
                        dist[i] = i-prev;
                    //System.out.println(" i = " + i + " prev = "+prev);
                }
                else
                    dist[i] = Math.min(curr-i,i-prev); 
                i++;
            }
            prev = curr;
            curr++;
        }
        return dist;
    }
}