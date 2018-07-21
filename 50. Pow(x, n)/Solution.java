class Solution {
    public double myPow(double x, int n) {
       double y = calc( x , Math.abs(n) );
        
        if(n<0)
            return 1/y;
        else
            return y;
            
    }
    
    public double calc( double x , int n )
    {
        double num = 1;
        if( n == 0 )
            return 1;
        else{
            num = calc(x*x,n/2);
        }
    //    System.out.println(" n = "+n+" n%2 = "+n%2);
       return (n%2==0)? num:num*x;
    }
}