class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int temp = hm.get(nums[i]);
                hm.put(nums[i],temp+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        int n = nums.length;
       int[][] arr = new int[n][2];
       for(int i=0;i<nums.length;i++){
        int key = nums[i];
        int value = hm.get(nums[i]);
        arr[i][0]=key;
        arr[i][1]=value;
       }

       Arrays.sort(arr,(a,b) ->{
        if(a[1]!=b[1]){
            return Integer.compare(a[1],b[1]);
        }else{
            return Integer.compare(b[0],a[0]);
        }
       });

       for(int i=0;i<nums.length;i++){
        nums[i]=arr[i][0];
       }
return nums;
    }
}
