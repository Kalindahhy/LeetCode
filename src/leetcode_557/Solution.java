package leetcode_557;

import java.util.*;
/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * 示例 1:
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc" 
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 * 
 * **/

public class Solution {
	public String reverseWords(String s) {
		String[] strs = s.split(" ");
		String str = "";
		for(int i = 0; i < strs.length; i++) {
			StringBuilder str1 = new StringBuilder(strs[i]);
			str = str + str1.reverse().toString() + " ";
		}
        return str.substring(0, str.length() - 1);
    }

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(new Solution().reverseWords(str));
	}
}
