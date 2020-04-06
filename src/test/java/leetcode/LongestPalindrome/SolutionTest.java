package leetcode.LongestPalindrome;

import org.junit.Assert;
import org.junit.Test;

import java.net.Socket;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestPalindrome() {
        String s = "abccccdd";
        Solution solution = new Solution();
        Assert.assertEquals(7, solution.longestPalindrome(s));
    }

    @Test
    public void longestPalindrome2() {
        String s = "bb";
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.longestPalindrome(s));
    }

    @Test
    public void longestPalindrome3() {
        String s = "ccc";
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.longestPalindrome(s));
    }

    @Test
    public void longestPalindrome4() {
        String s = "ccc";
        Solution2 solution2 = new Solution2();
        Assert.assertEquals(3, solution2.longestPalindrome(s));
    }

}