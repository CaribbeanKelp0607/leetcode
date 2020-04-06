package leetcode.SortCharactersByFrequency;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.SchemaOutputResolver;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void frequencySort() {
        Solution solution = new Solution();
        String s = "tree";
        Assert.assertEquals("eert", solution.frequencySort(s));
    }

    @Test
    public void frequencySort1() {
        Solution solution = new Solution();
        String s = "cccaaa";
        Assert.assertEquals("aaaccc", solution.frequencySort(s));
    }
}