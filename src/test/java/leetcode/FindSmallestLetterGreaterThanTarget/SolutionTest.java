package leetcode.FindSmallestLetterGreaterThanTarget;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution;
    @Before
    public void setup() {
         solution = new Solution();
    }

    @Test
    public void nextGreatestLetter() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'z';
        Assert.assertEquals('c', solution.nextGreatestLetter(letters, target));
    }

    @Test
    public void nextGreatestLetter2() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        Assert.assertEquals('f', solution.nextGreatestLetter(letters, target));
    }
}