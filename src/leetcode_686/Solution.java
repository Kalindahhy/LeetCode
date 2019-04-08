package leetcode_686;

import java.util.*;

/**
 * 给定两个字符串 A 和 B, 寻找重复叠加字符串A的最小次数，使得字符串B成为叠加后的字符串A的子串，如果不存在则返回 -1。
 * 举个例子，A = "abcd"，B = "cdabcdab"。
 * 答案为 3， 因为 A 重复叠加三遍后为 “abcdabcdabcd”，此时 B 是其子串；A 重复叠加两遍后为"abcdabcd"，B 并不是其子串。
 * 注意:A 与 B 字符串的长度在1和10000区间范围内。
 * 
 * 最终的长度：2 * A.length + B.length
 * **/
public class Solution {
	public int repeatedStringMatch(String A, String B) {
		int n = (B.length() + A.length() * 2) / A.length() + 1;
		StringBuilder st = new StringBuilder();
		for(int i = 1; i < n; i++) {
			st.append(A);
			if(st.toString().indexOf(B) != -1) {
				return i;
			}
		}
        return -1;
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		System.out.println(new Solution().repeatedStringMatch(str1, str2));
	}
}
