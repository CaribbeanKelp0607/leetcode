package leetcode.SortCharactersByFrequency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * "tree"
 * <p>
 * 输出:
 * "eert"
 * <p>
 * 解释:
 * 'e'出现两次，'r'和't'都只出现一次。
 * 因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
 * 示例 2:
 * <p>
 * 输入:
 * "cccaaa"
 * <p>
 * 输出:
 * "cccaaa"
 * <p>
 * 解释:
 * 'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
 * 注意"cacaca"是不正确的，因为相同的字母必须放在一起。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-characters-by-frequency
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String frequencySort(String s) {
        // 1.找出每个字符和它出现的频率，放到Hashmap中
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashmap.get(s.charAt(i)) == null) {
                hashmap.put(s.charAt(i), 1);
            } else {
                hashmap.put(s.charAt(i), hashmap.get(s.charAt(i)) + 1);
            }
        }

        // 2.将出现频率和对应的字符放到对应的数组列表中，数组的索引对应出现的频率，索引对应的列表对应该频率对应的字符
        List<Character>[] freqEles = new ArrayList[s.length() + 1];
        for (char key : hashmap.keySet()) {
            Integer freq = hashmap.get(key);
            if (freqEles[freq] == null) {
                freqEles[freq] = new ArrayList<>();
            }
            freqEles[freq].add(key);
        }
        // 3.根据出现的频率和对应的字符，生成最后的结果列表
        StringBuilder sb = new StringBuilder();
        for (int i = freqEles.length - 1; i >= 0; i--) {
            if (freqEles[i] == null) {
                continue;
            }
            List<Character> eles = freqEles[i];
            for (Character ele : eles) {
                for (int j = 0; j < i; j++) {
                    sb.append(ele);
                }
            }
        }
        return sb.toString();

    }

}
