package leetcode.MaximumNestingDepthofTwoValidParenthesesStrings;

import static org.junit.Assert.assertTrue;

import leetcode.MaximumNestingDepthofTwoValidParenthesesStrings.Solution;
import org.junit.Test;

/**
 * Unit test for simple Solution.
 */
public class SolutionTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void maxDepthAfterSplit() {
        String test = "(()())";
        Solution app = new Solution();
        app.maxDepthAfterSplit(test);
    }
}
