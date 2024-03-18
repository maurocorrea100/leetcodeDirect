class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       ArrayList<int[]> list = new ArrayList<>();
    
       int num1 = -1, num2 = -1;
       boolean found1 = false, found2 = false;

       for(int[] el : intervals){

           if(num1 < 0 && newInterval[0]<= el[0]) {
               num1 = newInterval[0];
               found1 = true;
           }

           if(!found1 && !found2){
               if(newInterval[0] >= el[0] && newInterval[0] <= el[1]){
                   found1 = true;
                   num1 = el[0];
               }

               if(newInterval[1]>= el[0] && newInterval[1] <= el[1]){
                   found2 = true;
                   num2 = el[1];
               }

               if(found1 && found2) list.add(new int[]{num1,num2});
               else if(!found1 && !found2) list.add(el);
               else if(!found1 && found2){
                   list.add(new int[]{newInterval[0],num2});

               }


           }else if(found1 && !found2){
               if(newInterval[1] < el[0]) {
                   found2 = true;
                   num2 = newInterval[1];
                   list.add(new int[]{num1,num2});
                   list.add(el);
               }
               if(newInterval[1]>= el[0] && newInterval[1] <= el[1]){
                   found2 = true;
                   num2 = el[1];
                   list.add(new int[]{num1,num2});
               }
           }
           else list.add(el);
       }

       if(!found1 && !found2) list.add(newInterval);
       else if(found1 && !found2) list.add(new int[]{num1,newInterval[1]});

     //  for (int[] el : list) System.out.println(Arrays.toString(el));
       int[][] res = new int[list.size()][2];
       int i = 0;
       for(int[] el : list){
           res[i] = el;
           i++;
       }
        return res;
    }
}