package leetcode.Longestwordindictionarythroughdeleting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，该字符串可以通过删除给定字符串的某些字符来得到。如果答案不止一个，返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。
 *
 * 示例 1:
 *
 * 输入:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 *
 * 输出:
 * "apple"
 * 示例 2:
 *
 * 输入:
 * s = "abpcplea", d = ["a","b","c"]
 *
 * 输出:
 * "a"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String findLongestWord(String s, List<String> d) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < d.size(); i++) {
            int sIndex = 0;
            int dIndex = 0;
            String temp = d.get(i);
            while (dIndex < temp.length() && sIndex < s.length()) {
                //1. 如果两个字符相等，则两个指针继续移动， sIndex++，dIndex++，进行下一个字符的比较
                //2. 如果两个字符不相等，则sIndex++,然后继续判断s.charAt(sIndex)是否与d.charAt(dIndex)相等
                //   (1) 如果相等,sIndex++,dIndex++
                //   (2) 如果不相等，继续sIndex++，直到s.charAt(sIndex)==d.charAt(dIndex)，继续 sIndex++，dIndex++，否则终止，返回""
                if (temp.charAt(dIndex) == s.charAt(sIndex)) {
                    if (dIndex == temp.length() - 1) {
                        resultList.add(d.get(i));
                        break;
                    }
                    sIndex++;
                    dIndex++;
                } else {
                    sIndex++;
                }
            }
        }
        Collections.sort(resultList);
        return getResult(resultList);
    }

    private String getResult(List<String> tempList) {
        if (tempList.size() == 0) {
            return "";
        }
        int max = -1;
        int index = -1;
        for (int i = 0; i < tempList.size(); i++) {
            if (tempList.get(i).length() > max) {
                index = i;
                max = tempList.get(i).length();
            }
        }
        return tempList.get(index);
    }
}
