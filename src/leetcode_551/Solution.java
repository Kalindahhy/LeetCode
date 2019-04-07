package leetcode_551;

import java.util.Scanner;

/**
 * 给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：
 * 'A' : Absent，缺勤
 * 'L' : Late，迟到
 *'P' : Present，到场
 *如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
 *你需要根据这个学生的出勤记录判断他是否会被奖赏。
 *示例 1:
 *输入: "PPALLP"
 *输出: True
 *示例 2:
 *输入: "PPALLL"
 *输出: False
 * **/
public class Solution {
	public boolean checkRecord(String s) {
		int countp = 0, countl = 0, count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'A') {
				countp++;
				countl = Math.max(count, countl);
				count = 0;
			}else if(s.charAt(i) == 'L'){
				count++;
			}else {
				countl = Math.max(count, countl);
				count = 0;
			}
		}
		countl = Math.max(count, countl);
		if(countp <= 1 && countl < 3) {
			return true;
		}
        return false;
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(new Solution().checkRecord(str));
	}
}
