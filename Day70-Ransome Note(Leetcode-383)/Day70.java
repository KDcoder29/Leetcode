class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] rn = ransomNote.toCharArray();
        char[] mg = magazine.toCharArray();
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
    
        for(int i=0;i<rn.length;i++){
            if(hm1.containsKey(rn[i])){
                int temp = hm1.get(rn[i]);
                hm1.put(rn[i],temp+1);
            }else{
                hm1.put(rn[i],1);
            }
        }

        for(int i=0;i<mg.length;i++){
            if(hm2.containsKey(mg[i])){
                int temp = hm2.get(mg[i]);
                hm2.put(mg[i],temp+1);
            }else{
                hm2.put(mg[i],1);
            }
        }

        for(int i=0;i<rn.length;i++){
            if(hm2.containsKey(rn[i])==false){
                return false;
            }else{
                int c1 = hm1.get(rn[i]);
                int c2 = hm2.get(rn[i]);
                if(c1>c2){
                    return false;
                }
            }
        }
    return true;

    }
}
