package full_stack;

import org.junit.Assert;
import org.junit.Test;

public class SecondProblemTest {

    @Test
    public void givenFirstExample_whenGetSecondProblemSolution_thenReturnIndices() {
        int[] result = SecondProblem.getSecondProblemSolution(new int[] { 2, 7, 11, 15 }, 9);
        int[] expectedResult = new int[] { 0, 1 };

        Assert.assertArrayEquals(result, expectedResult);
    }

    @Test
    public void givenSecondExample_whenGetSecondProblemSolution_thenReturnIndices() {
        int[] result = SecondProblem.getSecondProblemSolution(new int[] { 3, 2, 4 }, 6);
        int[] expectedResult = new int[] { 1, 2 };

        Assert.assertArrayEquals(result, expectedResult);
    }

    @Test
    public void givenThirdExample_whenGetSecondProblemSolution_thenReturnIndices() {
        int[] result = SecondProblem.getSecondProblemSolution(new int[] { 3, 3 }, 6);
        int[] expectedResult = new int[] { 0, 1 };

        Assert.assertArrayEquals(result, expectedResult);
    }

}
