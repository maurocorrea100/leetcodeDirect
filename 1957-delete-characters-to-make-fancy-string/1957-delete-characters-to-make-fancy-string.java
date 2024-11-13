class Solution {
 public String makeFancyString(String s) {
        byte[] sc = s.getBytes();
        int inpIdx = 1;
        int outIdx = 1;
        int prevChar = sc[0];
        int dupCount = 0;
        int len = sc.length;
        while (inpIdx < len) {
            int c = sc[inpIdx++];
            if (c != prevChar) {
                prevChar = c;
                sc[outIdx++] = (byte)c;
                dupCount = 0;
            } else {
                if (++dupCount < 2)  sc[outIdx++] = (byte)c;
            }
        }
        return new String(sc, 0, outIdx);
    }
}