class Solution {
    public boolean hasDuplicate(int[] nums) {
        int max = 0;

        for(int i=1; i<nums.length; i++)
        {
            if(nums[max]<nums[i])
            max = i;
        }

        int[] freq = new int[max+1];

        for(int i=0; i<nums.length; i++)
        {
            freq[nums[i]]++;
            if(freq[i]>1)
            return false;
        
        }

        return true;
        
    }
}