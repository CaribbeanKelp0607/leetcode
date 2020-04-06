package leetcode.Longestwordindictionarythroughdeleting;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void findLongestWord() {
        Solution solution = new Solution();
        String s = "abpcplea";
        List<String> list = Arrays.asList("ale", "apple", "monkey", "plea");
        List<String> d = new ArrayList();
        d.addAll(list);
        Assert.assertEquals("apple", solution.findLongestWord(s, d));
    }

    @Test
    public void findLongestWord2() {
        Solution solution = new Solution();
        String s = "abpcplea";
        List<String> list = Arrays.asList("a", "b", "c");
        List<String> d = new ArrayList();
        d.addAll(list);
        Assert.assertEquals("a", solution.findLongestWord(s, d));
    }

    @Test
    public void findLongestWord3() {
        Solution solution = new Solution();
        String s = "bab";
        List<String> list = Arrays.asList("ba", "ab", "a", "b");
        List<String> d = new ArrayList();
        d.addAll(list);
        Assert.assertEquals("ab", solution.findLongestWord(s, d));
    }

    @Test
    public void findLongestWord4() {
        Solution solution = new Solution();
        String s = "apple";
        List<String> list = Arrays.asList("zxc", "vbn");
        List<String> d = new ArrayList();
        d.addAll(list);
        Assert.assertEquals("ab", solution.findLongestWord(s, d));
    }
}