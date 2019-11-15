package com.xu.leetcode.leetcode_03;

import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> q = new LinkedList<>();
        int length = 0;
        int size = 0;
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(q.contains(ch)){
                char f=q.poll();
                length--;
                while(f != ch){
                    f=q.poll();
                    length--;
                }
                q.add(ch);
                length++;
            }
            else {
                q.add(ch);
                length++;
            }
            size = Math.max(length,size);

        }
        return size;
    }

    /**
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     *
     * Input: "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     *
     * Input: "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     * @param s
     * @return
     */
    public int myLengthOfLongestSubstring(String s) {//这种方法很费时间
        List<Character> list = new ArrayList<>();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (list.contains(c)) {
                //  包含的话应该要从包含那里开始算
                int index = list.lastIndexOf(c);
                list = list.subList(index+1,list.size());
            }
            list.add(c);
            maxLength = maxLength>list.size()?maxLength:list.size();
        }
        return maxLength;
    }

    public int myLengthOfLongestSubstring2(String s) {
        Queue<Character> queue = new LinkedList<>();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (queue.contains(c)) {
                //  包含的话应该要从包含那里开始算
                Character poll = queue.poll();
                while (poll!=c) {
                    poll = queue.poll();
                }
            }
            queue.add(c);
            maxLength = maxLength>queue.size()?maxLength:queue.size();
        }
        return maxLength;
    }
}
