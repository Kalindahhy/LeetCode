package leetcode_709;

import java.util.Scanner;
/**
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * **/
public class Solution {
	public String toLowerCase(String str) {
		StringBuilder s = new StringBuilder(str);
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
				s.replace(i, i + 1, (char)(s.charAt(i) - 'A' + 'a') + "");
			}
		}
        return s.toString();
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(new Solution().toLowerCase(str));
	}
}
