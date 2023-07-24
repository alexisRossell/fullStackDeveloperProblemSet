package full_stack;

public class SecondProblem {

    /**
     * Solution of the second problem of Full Stack Mid Level
     * <p>
     * Time complexity: O(n^2)
     * <p>
     * Space complexity: O(1)
     * 
     * @param nums   an array of numbers
     * @param target the number that has to be added up to
     * @return the indices of the two numbers such that they add up to
     *         <code>target</code>
     */
    public static int[] getSecondProblemSolution(int[] nums, int target) {
        // Iterate all the numbers in the array except the last one

        for (int i = 0; i < nums.length - 1; i++) {
            // Start iterating from the next number after i

            for (int j = i + 1; j < nums.length; j++) {
                // If the sum of the combination of numbers add up to the target, return a new
                // array with both indexes

                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        // If no combination was found, return an empty array

        return new int[] {};
    }

}
