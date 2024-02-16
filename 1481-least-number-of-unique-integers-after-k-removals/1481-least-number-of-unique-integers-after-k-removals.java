class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
           // Step 1: Create a frequency map
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int num : arr) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }
    
    // Step 2: Sort frequencies in ascending order
    List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
    Collections.sort(frequencies);
    
    // Step 3: Iterate through frequencies and remove elements
    int uniqueCount = frequencyMap.size(); // Initial unique count
    for (int frequency : frequencies) {
        if (k >= frequency) {
            k -= frequency; // Remove all occurrences of the current number
            uniqueCount--; // Reduce unique count
        } else {
            break; // If remaining removals are less than frequency, break
        }
    }
    
    // Step 4: Return the count of unique integers left
    return uniqueCount;
    }
}