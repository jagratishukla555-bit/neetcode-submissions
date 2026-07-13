class Solution {
    public boolean isSubsequence(String s, String t) {
        int p = 0;
        int q = 0;

        int l1= s.length();
        int l2 = t.length();
        int count = 0;
        while(p < l1 && q < l2)
        {
            if(s.charAt(p) == t.charAt(q))
                p++;
            q++;
        }
        
        if(p == l1)
        return true;
        else
        return false;
    }
}