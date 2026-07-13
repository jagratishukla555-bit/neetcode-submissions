class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() ==0) return true;
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        for(int i=0; i<str.length(); i++)
        {
            int start = str.charAt(i);
            int end = str.charAt(str.length()-1-i);

            if(start != end)
            return false;
        }

        return true;

    }
}
