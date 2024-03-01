class Solution {
    public String maximumOddBinaryNumber(String s) {
       Character[] chars = new Character[s.length()];
        for(int i = 0; i < s.length();i++) chars[i]=s.charAt(i);
        Arrays.sort(chars,Collections.reverseOrder());
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                char temp = chars[i];
                chars[i] = chars[chars.length - 1];
                chars[chars.length - 1] = temp;
                break;
            }
        }
          StringBuilder str = new StringBuilder();
        for(char el : chars) str.append(el);
        return str.toString();
    }
}