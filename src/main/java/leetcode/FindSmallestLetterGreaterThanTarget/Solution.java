package leetcode.FindSmallestLetterGreaterThanTarget;


/**
 * 给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
 * <p>
 * 在比较时，数组里字母的是循环有序的。举个例子：
 * <p>
 * 如果目标字母 target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回 'a'。
 * 如果目标字母 target = 'n' 并且有序数组为 letters = ['m', 'z', 'c', 'f', 'j'] ，则答案返回 'z' 。
 *  
 * <p>
 * 示例：
 * <p>
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "a"
 * 输出: "c"
 * <p>
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "c"
 * 输出: "f"
 * <p>
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "d"
 * 输出: "f"
 * <p>
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "g"
 * 输出: "j"
 * <p>
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "j"
 * 输出: "c"
 * <p>
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "k"
 * 输出: "c"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // 将该问题等效为查找问题，如果找到对应的元素
        int l = 0;
        int h = letters.length - 1;
        while (l <= h) {
            int middle = l + (h - l) / 2;
            if (letters[middle] <= target) {
                l = middle + 1;
            } else {
                h = middle - 1;
            }
        }
        if (l < letters.length) {
            return letters[l];
        } else {
            return letters[0];
        }
    }
}
