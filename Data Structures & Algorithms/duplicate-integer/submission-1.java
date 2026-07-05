class Solution{

   public boolean hasDuplicate(int[] nums)
    {
        int n= nums.length;
        int max =nums[0];
          for(int i=1; i<n; i++)
            {
                if(nums[i] > max){
                max=nums[i];
            }
            }


        int[] freq = new int[max+1];

        for(int i=0; i<n; i++)
        {
            freq[nums[i]]++;
        }

        for(int i=0; i<n; i++)
        {
            if(freq[i] > 1)
            return true;
        
        }
        return false;
    
   } 
}