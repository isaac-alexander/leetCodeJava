package TwoSum;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        // The first loop selects the first number.
        for (int i = 0; i < nums.length; i++) {

            // The second loop selects the next number.
            for (int j = i + 1; j < nums.length; j++) {

                // Check whether the two numbers add up to the target.
                if (nums[i] + nums[j] == target) {

                    // Return the indices of the two numbers.
                    return new int[]{i, j};
                }
            }
        }

        // Return an empty array if no solution is found.
        return new int[]{};
    }

    public static void main(String[] args) {

        // Create an instance of the TwoSum class.
        TwoSum solution = new TwoSum();

        // Declare the input array.
        int[] nums = {2, 7, 11, 15};

        // Declare the target value.
        int target = 9;

        // Call the twoSum method.
        int[] result = solution.twoSum(nums, target);

        // Display the resulting indices.
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
