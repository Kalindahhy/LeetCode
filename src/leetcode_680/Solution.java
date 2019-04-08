package leetcode_680;

import java.util.Scanner;

/**
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 * 示例 1:
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * 注意:字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 * **/
public class Solution {
	public boolean validPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		int count = 0;
		while(left < right) { //删除左边的
			if(s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			}else if(left + 1 < s.length() && s.charAt(left + 1) == s.charAt(right)){
				left = left + 2;
				right--;
				count++;
			}else {
				break;
			}
		}
		if(left >= right && count < 2) {
			return true;
		}
		left = 0;
		right = s.length() - 1;
		count = 0;
		while(left < right) { //删除右边的
			if(s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			}else if(right > 0 && s.charAt(left) == s.charAt(right - 1)){
				left++;
				right = right - 2;
				count++;
			}else {
				break;
			}
		}
		if(left >= right && count < 2) {
			return true;
		}
		return false;
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(new Solution().validPalindrome(str));
	}
}
