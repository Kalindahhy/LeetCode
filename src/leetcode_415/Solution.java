package leetcode_415;
import java.util.*;
/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 * **/
public class Solution {
	public String addStrings(String num1, String num2) {
		StringBuilder str = new StringBuilder();
		int end1 = num1.length() - 1;
		int end2 = num2.length() - 1;
		int count = 0;
		while(end1 >= 0 || end2 >= 0 || count != 0) {
			if(end1 >= 0) {
				count = count + num1.charAt(end1) - '0';
				end1--;
			}
			if(end2 >= 0) {
				count = count + num2.charAt(end2) - '0';
				end2--;
			}
			str.append(count % 10 + "");
			count = count / 10;
		}
        return str.reverse().toString();
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		System.out.println(new Solution().addStrings(str1, str2));
	}
}
