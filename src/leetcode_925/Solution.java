package leetcode_925;

import java.util.Scanner;

public class Solution {
	public boolean isLongPressedName(String name, String typed) {
		int index = 0;
		int count = 0;
		for(int i = 0; i < name.length(); i++) {
			while(index < typed.length()) {
				if(typed.charAt(index) == name.charAt(i)) {
					index++;
					count++;
					break;
				}
				index++;
			}
		}
		if(count == name.length()) {
			return true;
		}
        return false;
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		String typed = in.nextLine();
		System.out.println(new Solution().isLongPressedName(name, typed));
	}
}
