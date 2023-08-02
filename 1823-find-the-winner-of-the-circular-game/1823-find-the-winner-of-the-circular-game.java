class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <=n; i++){
            list.add(i);
        }

        int index = k-1;
        
        while(list.size()>1){
            list.remove(index);
            index = index + k -1;
            if(index>=list.size()){
                index = index%list.size();
            }
        }
        
        return list.get(0);
    }
}