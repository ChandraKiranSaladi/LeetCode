class Solution {
    public boolean canPlaceFlowers(int[] num, int n) {
        if(n==0)
            return true;
        if(num.length==1 && num[0]==0 && n==1)
            return true;
        
        for( int i = 0 ; i < num.length; i ++){
            
            if(num[i]==0){
                
                    if( i==num.length-1 || num[i+1]==0  ){
                        n--;
                        i++;
                    }
                        // It feels really amazing when you can eliminate all the redundant 
                        // conditions to get the solution in more optimized way.
            }
            else
                i++;
            
        }
      return (n>0)?false:true;
    }
}