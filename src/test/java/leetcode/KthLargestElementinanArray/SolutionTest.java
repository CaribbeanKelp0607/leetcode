package leetcode.KthLargestElementinanArray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findKthLargest() {
        //输入: [3,2,1,5,6,4] 和 k = 2
        //输出: 5
        Solution solution = new Solution();
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;
        Assert.assertEquals(5, solution.findKthLargest(nums, k));
    }

    @Test
    public void findKthLargest2(){
        Solution solution = new Solution();
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        int k = 4;
        Assert.assertEquals(4, solution.findKthLargest(nums, k));
    }
}