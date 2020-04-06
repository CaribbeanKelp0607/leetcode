package leetcode.TopKFrequentElements;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void topKFrequent() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> list = Arrays.asList(1, 2);
        Assert.assertEquals(list, solution.topKFrequent(nums, k));
    }

    @Test
    public void topKFrequent2() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 4, 4};
        int k = 2;
        List<Integer> list = Arrays.asList(4, 1);
        Assert.assertEquals(list, solution.topKFrequent(nums, k));
    }

    @Test
    public void topKFrequent3() {
        Solution2 solution = new Solution2();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> list = Arrays.asList(1, 2);
        Assert.assertEquals(list, solution.topKFrequent(nums, k));
    }
}