class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for (int i = 1; i < n; i++) {
            str = readString(str);
        }
        return str;
        
    }
    
    private String readString(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0, count = 1; i < chars.length; i++) {
            if(i == chars.length-1 || chars[i] != chars[i+1]) {
                sb.append(count);
                sb.append(chars[i]);
                count=1;
                
            } else count++;
        }
        return sb.toString();
    }
    
    
}