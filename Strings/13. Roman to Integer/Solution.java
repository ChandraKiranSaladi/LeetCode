class Solution {
    public int romanToInt(String s) {
        if(s.length()==0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        // I             1
        // V             5
        // X             10
        // L             50
        // C             100				Much better performance when switch case is used.
        // D             500
        // M             1000
        map.put('I',1);
        map.put('V',5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D',500);
        map.put('M',1000);
        int sum = map.get(s.charAt(0));
        int prev = sum;
        char[] c = s.toCharArray();
        for( int i = 1 ; i < c.length; i ++){
            int value = map.get(c[i]);
            if(value <= prev){
                sum += value;
            }
            else
            {
                sum = sum + value - 2*prev;
            }
            prev = value;
        }
        return sum;
        }
    }
