package leetcode_434;

import java.util.*;

/**
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 * 示例:
 * 输入: "Hello, my name is John"
 * 输出: 5
 * 
 * **/
public class Solution {
	public int countSegments(String s) {
		int count = 0;
		String[] strs = s.split(" ");
		for(int i = 0; i < strs.length; i++) {
			if(!strs[i].isEmpty()) {
				count++;
			}
		}
        return count;
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(new Solution().countSegments(str));
	}
}
