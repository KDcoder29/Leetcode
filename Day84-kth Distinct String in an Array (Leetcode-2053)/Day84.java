class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int temp = hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        String ans = "";
        for(int i=0;i<arr.length;i++){
            if(hm.get(arr[i])==1){
                k--;
            }
            if(k==0){   
                ans=arr[i];
                break;
            }
        }
    return ans;

    }
}
