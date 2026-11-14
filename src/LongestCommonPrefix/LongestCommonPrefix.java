package LongestCommonPrefix;


public class LongestCommonPrefix {

    // Finds the longest common prefix among the given strings.
    public String longestCommonPrefix(String[] strs) {

        // Use the first word as the initial prefix.
        String prefix = strs[0];

        // Compare the prefix with every other word.
        for (int i = 1; i < strs.length; i++) {

            // Keep shortening the prefix until the current word starts with it.
            while (!strs[i].startsWith(prefix)) {

                // Remove the last character from the prefix.
                prefix = prefix.substring(0, prefix.length() - 1);

                // Return an empty string if no common prefix exists.
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        // Return the longest common prefix.
        return prefix;
    }

    public static void main(String[] args) {

        // Create an instance of the LongestCommonPrefix class.
        LongestCommonPrefix solution = new LongestCommonPrefix();

        // Declare the array of strings.
        String[] strs = {"flower", "flow", "flight"};

        // Find the longest common prefix.
        String result = solution.longestCommonPrefix(strs);

        // Display the result.
        System.out.println("Longest Common Prefix: " + result);
    }
}
