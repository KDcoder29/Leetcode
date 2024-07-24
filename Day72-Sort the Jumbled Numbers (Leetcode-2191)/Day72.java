class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[][] arr = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=mappedValue(mapping,nums[i]);
            arr[i][1]=nums[i];
        }

        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));

        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i][1];
        }
        return nums;
    }

    public int mappedValue(int[] mapping, int n ){
        StringBuilder mappedValue = new StringBuilder();
        int multiplier=1;
       String str = String.valueOf(n);
       char[] arr = str.toCharArray();
       for(int i=0;i<arr.length;i++){
          mappedValue.append(mapping[arr[i]-'0']);
       }
       String st = new String(mappedValue);
       int map = Integer.valueOf(st);
    return map;
    }
}
