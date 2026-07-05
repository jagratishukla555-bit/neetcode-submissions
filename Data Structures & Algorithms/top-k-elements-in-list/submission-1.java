class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
        {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0)+1);
        }
        List<Map.Entry<Integer, Integer>> li = new ArrayList<>(hash.entrySet()); 
        li.sort(Map.Entry.comparingByValue());
        
        int[] res = new int[k];

        int i=0;

        for(int j=li.size()-1; j>=li.size()-k; j--)
        {
            res[i++] = li.get(j).getKey();
        }

        return res;
    }
}
