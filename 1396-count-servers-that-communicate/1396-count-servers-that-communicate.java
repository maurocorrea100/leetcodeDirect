class Solution {
    public int countServers(int[][] grid) {
               int rowA = grid.length;
        int colA = grid[0].length;

        int noContactAmount = 0;
        int totalServerAmount = 0;
        for(int i  = 0; i < rowA; i++){
            int count = 0;
            int colLoc = -1;
            for(int j = 0; j < colA; j++){
                if(grid[i][j] == 1) {
                    count++;
                    if(count==1) {
                        colLoc = j;
                    }
                }
            }

            if(count==1){
                boolean talkingServerFound = false;
                for(int a = 0; a < rowA; a++){
                    if(a==i) continue;
                    if(grid[a][colLoc]==1) {
                        talkingServerFound = true;
                        break;
                    }
                }
                if(!talkingServerFound) noContactAmount++;
            }
            totalServerAmount = totalServerAmount + count;
        }

        return totalServerAmount - noContactAmount;

    }
}