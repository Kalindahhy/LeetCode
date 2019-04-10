package leetcode_917;

import java.util.Scanner;

public class Solution {
	public String reverseOnlyLetters(String S) {
		StringBuilder str = new StringBuilder(S);
		int left = 0, right = str.length() - 1;
		while(left < right) {
			while(left < str.length() && !Character.isLetter(str.charAt(left))) {
				left++;
			}
			while(right >= 0 && !Character.isLetter(str.charAt(right))) {
				right--;
			}
			if(left < right) {
				char temp = str.charAt(left);
				str.setCharAt(left, str.charAt(right));
				str.setCharAt(right, temp);
				left++;
				right--;
			}
		}
        return str.toString();
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(new Solution().reverseOnlyLetters(str));
	}
}
