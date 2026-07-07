class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack();
        int n= s.length();

        for(int i=0; i<n; i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                stk.push(s.charAt(i));
            }
            else {
                if(stk.isEmpty())
                return false;

                int top = stk.peek();

                if(s.charAt(i) == ')' && top == '(' 
                || s.charAt(i) == '}' && top == '{'
                || s.charAt(i) == ']' && top == '[')
                {
                    stk.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}
