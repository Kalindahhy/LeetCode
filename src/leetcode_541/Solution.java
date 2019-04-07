package leetcode_541;

import java.util.Scanner;
/**
 * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。
 * 如果剩余少于 k 个字符，则将剩余的所有全部反转。
 * 如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
 * 示例:
 * 输入: s = "abcdefg", k = 2
 * 输出: "bacdfeg"
 * 要求:该字符串只包含小写的英文字母。给定字符串的长度和 k 在[1, 10000]范围内。
 * **/
public class Solution {
	public String reverseStr(String s, int k) {
		StringBuilder str = new StringBuilder(s);
		int index = 0;
		while(index < str.length()) {
			if(str.length() - index <= k) {
				StringBuilder str1 = new StringBuilder(str.substring(index, str.length()));
				str1.reverse();
				str.replace(index, str.length(), str1.toString());
				break;
			}
			StringBuilder str1 = new StringBuilder(str.substring(index, index + k));
			str1.reverse();
			str.replace(index, index + k, str1.toString());
			index = index + 2 * k;
		}
        return str.toString();
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		int k = in.nextInt();
		System.out.println(new Solution().reverseStr(str1, k));
	}
}
