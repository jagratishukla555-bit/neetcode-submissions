class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int rem=0;
        for(int i=0; i<nums.length; i++)
        {
            rem = target-nums[i];
            if(hash.containsKey(rem))
            {
                return new int[]{hash.get(rem), i };
            }
            hash.put(nums[i], i);
        }
        return new int[]{};
    }
}
