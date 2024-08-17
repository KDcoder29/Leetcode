class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int imove=0;
        int jmove=0;
        for(int i=0;i<commands.size();i++){
            if(commands.get(i).equals("UP")){
                imove--;
            }else if(commands.get(i).equals("DOWN")){
                imove++;
            }else if(commands.get(i).equals("RIGHT")){
                jmove++;
            }else if(commands.get(i).equals("LEFT")){
                jmove--;
            }
        }
    return (imove*n)+jmove;
    }
}
