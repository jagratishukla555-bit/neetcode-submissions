class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.replaceAll("[ ?]", "");
        int l = 0, r = str.length()-1;

        while(l<=r){
            char ch1 = str.charAt(l);
            char ch2 = str.charAt(r);
            if(ch1 == ch2)
            {
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        if(l==r)
        return true;
    return false; 
    }
}
