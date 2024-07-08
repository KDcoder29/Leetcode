class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        int count =0;
        for(int i=1;i<=n;i++){
            q.add(i);
        }

        while(q.size()!=1){
            int remove = q.remove();
            count=(count+1)%k;
            if(count!=0){
            q.add(remove);}
        }
        int winner = q.remove();
        return winner;
    }
}
