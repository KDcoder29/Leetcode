class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] ans = new int[queries.length];
        HashMap<Integer,Integer> hm = new HashMap<>();
        int occurence=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                occurence++;
                hm.put(occurence,i);
            }
        }
        int add=0;
        for(int i=0;i<queries.length;i++){
            if(hm.containsKey(queries[i])){
                ans[add]=hm.get(queries[i]);
                add++;
            }else{
                ans[add]=-1;
                add++;
            }
        }
 return ans;
    }

}
