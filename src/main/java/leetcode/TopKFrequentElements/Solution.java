package leetcode.TopKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 * <p>
 * 输入: nums = [1], k = 1
 * 输出: [1]
 * 说明：
 * <p>
 * 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
 * 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/top-k-frequent-elements
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {

        // 将每个元素作为key，出现的频率做为value，存入hashmap中
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) == null) {
                hashMap.put(nums[i], 1);
            } else {
                int freq = hashMap.get(nums[i]);
                hashMap.put(nums[i], freq + 1);
            }
        }
        // 使用桶排序，每个桶的下标是元素的出现频率，桶内装的是该频率对应的的元素集合
        // 使用列表数组代表桶，每个列表的索引对应着元素出现的频率，列表的内容对应着元素集合（也就是出现频率相同的元素集合）
        // nums.length + 1是防止这样的数组出现[1,1,1,1,1]，出现频率是5次，数组长度必须是6，不然freq[5]就会出现数组越界。
        ArrayList<Integer>[] list = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            int ele = map.getKey();
            int freq = map.getValue();
            if (list[freq] == null) {
                list[freq] = new ArrayList<>();
            }
            list[freq].add(ele);
        }


        List<Integer> res = new ArrayList<>();
        int num = 0;
        for (int i = list.length - 1; i >= 0 && res.size()<k; i--) {
            if (list[i] == null) {
                continue;
            }
            res.addAll(list[i]);
        }
        System.out.println(res);
        return res;
    }

}