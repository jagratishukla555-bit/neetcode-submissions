class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
        {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0)+1);
        }

        ArrayList<Integer> ans = new ArrayList<>(); 
        for(var e: hash.entrySet())
        {
            if(e.getValue()>=k)
            {
               ans.add(e.getKey());
            }
        }
        int[] res = new int[ans.size()];

        for(int i=0; i<ans.size(); i++)
        res[i] = ans.get(i);


        return res;
    }
}
