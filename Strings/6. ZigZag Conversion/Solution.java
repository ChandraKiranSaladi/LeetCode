class Solution {
    public String convert(String S, int numRows) {
       StringBuilder[] list = new StringBuilder[numRows];
        if(numRows == 1)
            return S;
        if( S.length() < 3 )
            return S;
        
        char[] c = S.toCharArray();
        int j = 0;
        int x = 1;
        while ( j < numRows )
        {
            list[j] = new StringBuilder();
         //   list[j].append(c[j]);
         //   System.out.println(" list["+j+"] = "+list[j].toString());
            j++;
        }
        //j = j - 1;
        list[0].append(c[0]);
        j = 1;
        for ( int i = 1; i < c.length ; i++)
        {
           
             list[j].append(c[i]);
         //    System.out.println(" list["+j+"] = "+list[j].toString());
             if( j == numRows - 1 )
                x = -1;
             else if( j == 0 )
                x = 1;
             j = j + x;
            
        }
        for( int i = 1 ;  i < numRows ; i++)
        {
            list[0].append(list[i]);
        }
        return list[0].toString();
    }
}