package leetcode.reversevowelsofaString;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 * <p>
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-vowels-of-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public String reverseVowels(String s) {
        int begin = 0;
        int end = s.length() - 1;
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] sArrays = s.toCharArray();
        while (begin < end) {
            if (vowels.contains(sArrays[begin]) && vowels.contains(sArrays[end])) {
                char temp = sArrays[begin];
                sArrays[begin++] = sArrays[end];
                sArrays[end--] = temp;
            } else if (vowels.contains(sArrays[begin]) && !vowels.contains(sArrays[end])) {
                end--;
            } else if (!vowels.contains(sArrays[begin]) && vowels.contains(sArrays[end])) {
                begin++;
            } else {
                begin++;
                end--;
            }
        }


        return new String(sArrays);
    }
}
