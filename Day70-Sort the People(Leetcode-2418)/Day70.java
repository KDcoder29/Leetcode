class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i=0;i<heights.length;i++){
                hm.put(heights[i],names[i]);
        }
        String[] ans = new String[names.length];
        Arrays.sort(heights);
        int count=0;
        for(int i=heights.length-1;i>=0;i--){
            ans[count]=hm.get(heights[i]);
            count++;
        }
    return ans;
    }
}
