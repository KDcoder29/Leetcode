class Pair {
    Node n;
    int vl;
    Pair(Node n1 , int x ){
        n=n1;
        vl=x;
    }
    
}
class Solution {
    static ArrayList<Integer> topView(Node root) {
       Queue<Pair> q = new LinkedList<>();
       HashMap<Integer,Integer> hm = new HashMap<>();
       int maxVal=0;
       int minVal=0;
       q.add(new Pair(root,0));
       
       while(q.size()>0){
           int n = q.size();
           Pair rem = q.remove();
           if(hm.containsKey(rem.vl)==false){
               hm.put(rem.vl,rem.n.data);
           }
           if(rem.n.left!=null) {
               q.add(new Pair(rem.n.left,rem.vl-1));
               minVal=Math.min(minVal,rem.vl-1);
           }
           
           if(rem.n.right!=null) {
               q.add(new Pair(rem.n.right,rem.vl+1));
               maxVal=Math.max(maxVal,rem.vl+1);
           }
       }
       ArrayList<Integer> al = new ArrayList<>();
       for(int i=minVal;i<=maxVal;i++){
           if(hm.containsKey(i)){
               al.add(hm.get(i));
           }
       }
    
        return al;
    }
}
