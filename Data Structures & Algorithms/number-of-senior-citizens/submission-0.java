class Solution {
    public int countSeniors(String[] details) {
        
        int old=0;
        for(int i = 0; i<details.length; i++)
        {
            int ageNum1 = details[i].charAt(11) - '0';
            int ageNum2 = details[i].charAt(12) - '0';

            if(ageNum1 > 6 && ageNum2 > 0)
            {
                old++;
            }
        }
        return old;
    }
}