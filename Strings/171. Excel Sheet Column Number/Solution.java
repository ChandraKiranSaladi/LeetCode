class Solution {
    public int titleToNumber(String s) {
        if(s.length() == 0 )
            return 0;
        int temp = 1;
        int sum = 0;
        for( int i = s.length()-1 ; i >= 0 ; i--)
        {
            sum += (Character.toUpperCase(s.charAt(i))-'A'+1)*temp;
            temp *= 26;
        }
        return sum;
    }
}