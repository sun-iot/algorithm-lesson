package com.ci123.day03;

import java.util.HashMap;

import java.util.Map;


/**
 * @author Mr.Sun
 * @version v.1.0
 * @title LengthLongCharest
 * @description
 * @date 2020/1/6 11:15
 */
public class LengthLongCharest {

    public static void main(String[] args) {
        LengthLongCharest lengthLongCharest = new LengthLongCharest();
        System.out.println(lengthLongCharest.lengthOfLongestSubstring("abcabca"));
    }

    public int lengthOfLongestSubstring(@org.jetbrains.annotations.NotNull String s) {
        int length = s.length();
        int current = 0;
        Map<Character, Integer> map = new HashMap<>();
        // j  记录重复字段的最大值
        for (int i = 0, j = 0; i < length; i++) {
            //  取第 i 个元素 ， 判断在不在 map 里面
            if (map.containsKey(s.charAt(i))) {
                // 如果在
                j = Math.max(map.get(s.charAt(i)), j);
            }
            // 拿到滑动窗口的大小
            current = Math.max(current, i - j + 1);
            map.put(s.charAt(i), i + 1);
        }
        return current;
    }

    /*
     */

}
