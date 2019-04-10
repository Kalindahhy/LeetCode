package leetcode_859;

import java.util.*;

public class Solution {
	public boolean buddyStrings(String A, String B) {
		if(A.length() != B.length()) {
			return false;
		}
		ArrayList<Integer> index = new ArrayList<>();
		HashSet<Character> code = new HashSet<>();
		for(int i = 0; i < A.length(); i++) {
			code.add(A.charAt(i));
			if(A.charAt(i) != B.charAt(i)) {
				index.add(i);
			}
		}
		if(index.size() > 2 || index.size() == 1) {
			return false;
		}
		if(index.size() == 0) {
			if(code.size() == A.length()) {
				return false;
			}
			return true;
		}
		if(index.size() == 2 && A.charAt(index.get(0)) == B.charAt(index.get(1)) && A.charAt(index.get(1)) == B.charAt(index.get(0))) {
			return true;
		}
		return false;
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		System.out.println(new Solution().buddyStrings(str1, str2));
	}
}
