package leetcode_929;

import java.util.*;

public class Solution {
	public int numUniqueEmails(String[] emails) {
		Set<String> ema = new HashSet<>();
		for(int i = 0; i < emails.length; i++) {
			StringBuilder str = new StringBuilder(emails[i]);
			for(int j = 0; j < str.indexOf("@"); j++) {
				if(str.charAt(j) == '.') {
					str.deleteCharAt(j);
				}
				if(str.charAt(j) == '+') {
					String s = str.substring(0, j) + str.substring(str.indexOf("@"), str.length());
					str = new StringBuilder(s);
					break;
				}				
			}
			ema.add(str.toString());
		}
		return ema.size();
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] emails = in.nextLine().split(",");
		System.out.println(new Solution().numUniqueEmails(emails));
	}
}
