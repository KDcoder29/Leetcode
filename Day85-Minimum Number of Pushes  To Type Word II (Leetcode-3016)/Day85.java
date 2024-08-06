class Solution {
    public int minimumPushes(String word) {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int temp = hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }else{ 
                hm.put(arr[i],1);
            }
        }
        HashSet<Character> hs = new HashSet<>();
        int[][] arr2 = new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
                arr2[i][0]=arr[i];
                arr2[i][1]=hm.get(arr[i]);
            }
        }
    Arrays.sort(arr2,(a,b)-> Integer.compare(b[1],a[1]));
    int pushes=0;
    for(int i=0;i<arr2.length;i++){
        int value = arr2[i][1];
        if(i>=0 && i<=7){
            pushes+=1*value;
        }else if(i>=8 && i<=15){
            pushes+=2*value;
        }else if(i>=16 && i<=23){
            pushes+=3*value;
        }else if(i>=24 && i<=26){
            pushes+=4*value;
        }
    }
    
    return pushes;
    }
}
