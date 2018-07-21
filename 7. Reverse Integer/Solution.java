class Solution {
    public int reverse(int x) {
        int sum = 0;
        boolean isNegative = false;
        if(x < 0)
            isNegative = true;
        while( x != 0)
        {
          int temp = sum*10 + Math.abs(x)%10;
           
            if((temp - Math.abs(x)%10)/10 != sum)
                return 0;
             x = x/10;
            sum = temp;
        }
        return (isNegative == true)?(-sum):sum;
    }
}