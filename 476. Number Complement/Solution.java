class Solution {
    public int findComplement(int num) {
        int temp=1;
        int i = 0;
        int number=0;
        while(num!=0){
            int rem = num%2;
            num/=2;
            number += (rem>0)?0:1*temp;
            temp*=2;
        }
        return number;
    }
}