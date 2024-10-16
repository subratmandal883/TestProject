package stringProblems;

public class LongestCommonPrefixOne {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder prefix = new StringBuilder();
        int minLength = strs[0].length();

        // Find the minimum length among the strings
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

        // Compare characters manually
        for (int i = 0; i < minLength; i++) {
            char currentChar = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return prefix.toString();
                }
            }

            prefix.append(currentChar);
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"subrat", "sneha", "supriya"};
        String longestPrefix = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + longestPrefix);
    }
}
