class Solution {
    public String longestCommonPrefix(String[] strs) {
        //easy solution: go through each character
        StringBuilder build = new StringBuilder();
        
        //go through each character, compare to first
        for (int i = 0; i < strs[0].length(); i++) {
            char currChar = strs[0].charAt(i);
            for (String str : strs) {
                if (i >= str.length() || str.charAt(i) != currChar) {
                    return build.toString();
                }
            }
            build.append(currChar);
        }

        return build.toString();
    }
}