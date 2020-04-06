package leetcode.reversevowelsofaString;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverseVowels() {
        String s = "hello";
        Solution solu = new Solution();
        Assert.assertEquals("holle", solu.reverseVowels(s));
    }

    @Test
    public void reverseVowels2(){
        String s = "leetcode";
        Solution solu = new Solution();
        Assert.assertEquals("leotcede", solu.reverseVowels(s));
    }
}