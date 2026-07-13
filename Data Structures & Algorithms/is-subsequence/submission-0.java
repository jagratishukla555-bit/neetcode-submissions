class Solution {
    public boolean isSubsequence(String s, String t) {
        int p = 0;
        int q = 0;

        int l1= s.length();
        int l2 = t.length();
        int count = 0;
        while(q<l2)
        {
            while(p<l1){
                if(s.charAt(p) == t.charAt(q))
                {
                    count++;
                    p++;
                    q++;
                }
                else if( s.charAt(p) != t.charAt(q))
                {
                    q++;
                }
                else{
                    p++;
                }
            }
        }
        if(count == l1)
        return true;
        else
        return false;
    }
}