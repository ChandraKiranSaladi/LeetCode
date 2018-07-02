class Solution {
    public int addDigits(int num) {
        if(num<10)
            return num;
        while(num>=10){
            int temp = num,sum=0;
            while(temp!=0)
            {
                sum += temp%10;
                temp/=10;
            }
            if(sum<10)
                return sum;
            else
                num = sum;
        }
        return num;
    }
}