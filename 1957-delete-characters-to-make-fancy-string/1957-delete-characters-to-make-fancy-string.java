class Solution {
    public String makeFancyString(String s) {
        int size = s.length();
        if(size < 3) return s;
        char[] chars = s.toCharArray();


        char fist = chars[0];
        char second = chars[1];

        int end = 2;

        for(int i = 2; i < size; i++) {
            if(fist == second && second == chars[i]) {
                continue;
            }
            fist = second;
            second = chars[i];
            chars[end++] = chars[i];
        }
        return String.copyValueOf(chars, 0, end);
    }
}