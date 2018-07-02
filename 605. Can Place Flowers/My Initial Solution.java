class Solution {
    public boolean canPlaceFlowers(int[] num, int n) {
        if(n==0)
            return true;
        if(num.length==1 && num[0]==0 && n==1)
            return true;
        
        for( int i = 0 ; i < num.length; i ++){
            
            if(num[i]==0){
                if(i==0){
                    if(i+1!=num.length && num[i+1]==0){
                        n--;
                        i++;
                    }                                   
                }
                else if(i==num.length-1)
                {
                    if(num[i-1]==0)
                        n--;
                        i++;
                        
                }
                else
                {
                    if(num[i-1]==0 && num[i+1] == 0)
                    {
                        n--;
                        i++;
                    }
                }
            }
            else
                i++;
            
        }
      return (n>0)?false:true;
}
}