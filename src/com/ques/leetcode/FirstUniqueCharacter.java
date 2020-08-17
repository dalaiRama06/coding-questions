/*
    Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

    Examples:
    s = "leetcode"
    return 0.

    s = "loveleetcode"
    return 2.
 */
package com.ques.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    //not the best case solution
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int p = -1;
        for (int k = s.length() - 1; k >= 0; k--) {
            if (map.get(s.charAt(k)) == 1)
                p = k;
        }
        return p;
    }
}
