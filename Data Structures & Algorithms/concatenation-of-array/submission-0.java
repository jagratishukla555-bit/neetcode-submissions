class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int n = nums.length;
        for(int i=0; i<n; i++)
        {   
            if(i<n)
            ans[i] = nums[i]; 
        }
        int j=0; 
            while(j<n)
            {
            ans[j+n] = nums[j];
            j++;
            }
        return ans;
    }
}