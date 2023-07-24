package full_stack;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FirstProblemTest {

    @Test
    public void givenEmptyArray_whenGetFirstProblemSolution_thenReturnEmptyArray() {
        List<Integer> result = FirstProblem.getFirstProblemSolution(new int[] {});
        List<Integer> expectedResult = new ArrayList<Integer>();

        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void givenFirstExample_whenGetFirstProblemSolution_thenReturnDissapearedNumbers() {
        List<Integer> result = FirstProblem.getFirstProblemSolution(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 });
        List<Integer> expectedResult = new ArrayList<Integer>() {
            {
                add(5);
                add(6);
            }
        };

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void givenSecondExample_whenGetFirstProblemSolution_thenReturnDissapearedNumbers() {
        List<Integer> result = FirstProblem.getFirstProblemSolution(new int[] { 1, 1 });
        List<Integer> expectedResult = new ArrayList<Integer>() {
            {
                add(2);
            }
        };

        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void givenCompleteArray_whenGetFirstProblemSolution_thenReturnEmptyArray() {
        List<Integer> result = FirstProblem.getFirstProblemSolution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
        List<Integer> expectedResult = new ArrayList<Integer>();

        Assert.assertEquals(result, expectedResult);
    }
}
