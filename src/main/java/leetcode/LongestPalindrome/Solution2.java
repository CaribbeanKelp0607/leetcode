package leetcode.LongestPalindrome;

import java.util.HashMap;

/**
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * <p>
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * <p>
 * 注意:
 * 假设字符串的长度不会超过 1010。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * "abccccdd"
 * <p>
 * 输出:
 * 7
 * <p>
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution2 {
    public int longestPalindrome(String s) {
        int[] count = new int[123];
        // 用数组存储字符串出现的次数
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        // 贪心算法
        // 如果字符出现的次数为偶数2N，则可以组成长度为2N的回文字串
        // 如果字符出现的次数为奇数2N+1，则至少可以组成长度为2N的回文字串，通过 ans = ans + v / 2 * 2实现
        int ans = 0;
        for (int v : count) {
            // 如果字符串出现三次，则至少可以形成长度是2的回文字串
            ans = ans + v / 2 * 2;
            // 如果字符出现的次数为奇数，那么可以取出该字符，作为回文的中心点，而且取出后，不再使用其他字符作为中心点
            if (v % 2 != 0 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
