class Player{
    int position;
    int health;
    char direction;
    int index;
        Player(int position, int health, char direction,int index){
            this.position = position;
            this.health=health;
            this.direction=direction;
            this.index=index;
        }
      
}
class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        
        ArrayList<Player> players = new ArrayList<>();
        Stack<Player> st = new Stack<>();
        char[] dir = directions.toCharArray();
        for(int i=0;i<positions.length;i++){
            players.add(new Player(positions[i],healths[i],dir[i],i)); 
        }
        players.sort(Comparator.comparingInt(p->p.position));

        for(int i=0;i<positions.length;i++){
            positions[i]=players.get(i).position;
            healths[i]=players.get(i).health;
            dir[i]=players.get(i).direction;
        }

       
        
        int collision=0;
        for(int i=0;i<positions.length;i++){
            Player current = players.get(i);
            while(!st.isEmpty() && st.peek().direction=='R' && current != null && current.direction=='L'){
                collision++;
                 Player top = st.pop();
                if(top.health>current.health){
                    top.health-=1;
                    current=null;
                    st.push(top);
                }else if(top.health<current.health){
                    current.health-=1;
                }else{
                    current=null;
                }
            }
            if (current != null) {
                st.push(current);
            }
        }
         List<Player> survivors = new ArrayList<>(st);
         survivors.sort(Comparator.comparingInt(i->i.index));

         List<Integer> ans = new ArrayList<>();
         for(int i=0;i<survivors.size();i++){
            ans.add(survivors.get(i).health);
         }
         return ans;
    }
}
