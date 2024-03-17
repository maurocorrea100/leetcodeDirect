class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
    ArrayList<int[]> smaller = new ArrayList<>();
        ArrayList<int[]> overlap = new ArrayList<>();
        ArrayList<int[]> larger = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[1] < newInterval[0]) {
                smaller.add(interval);
            } else if (interval[0] > newInterval[1]) {
                larger.add(interval);
            } else {
                overlap.add(interval);
            }
        }

        if (overlap.size() > 0) {
            int[] firstInOverlap = overlap.get(0);
            int[] lastInOverlap = overlap.get(overlap.size() - 1);
            newInterval[0] = Math.min(firstInOverlap[0], newInterval[0]);
            newInterval[1] = Math.max(lastInOverlap[1], newInterval[1]);
        }

        int[][] results = new int[smaller.size() + 1 + larger.size()][];
        int index = 0;
        for (int[] interval : smaller) {
            results[index++] = interval;
        }

        results[index++] = newInterval;

        for (int[] interval : larger) {
            results[index++] = interval;
        }

        return results;
    }
}