package full_stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class FirstProblem {

    /**
     * Solution of the first problem of Full Stack Mid Level
     * <p>
     * Time complexity: O(n)
     * <p>
     * Space complexity: O(n)
     *
     * @param nums an array of numbers to be checked
     * @return a list of all the integers in the range [1, <code>nums.length</code>]
     *         that do not appear in <code>nums</code>
     */
    public static List<Integer> getFirstProblemSolution(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();

        // Convert the array of numbers into a set to remove duplicates

        Set<Integer> numsSet = new HashSet<Integer>() {
            {
                for (int number : nums) {
                    add(number);
                }
            }
        };

        // Iterate the nums set and add to the result list all the numbers that are
        // not contained

        for (int i = 1; i < nums.length + 1; i++) {
            if (!numsSet.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }

}
