class Solution {
    public boolean isValid(String s) {
        if(s.length()==0)
            return true;
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char x:c){
            switch(x){
                case '(':stack.push(')');break;
                case '[':stack.push(']');break;
                case '{': stack.push('}');break;
                default:  if(stack.isEmpty() || stack.pop()!=x)
                          return false;
            }
        }
        if(stack.isEmpty())
        return true;
        else return false;
    }
}
      