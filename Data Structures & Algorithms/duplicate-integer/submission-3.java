class Solution{

   public boolean hasDuplicate(int[] nums)
    {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
        }

        for(var e : hash.entrySet())
        {
            if(e.getValue()>1)
            return true;
        }
        return false;
    
   } 
}