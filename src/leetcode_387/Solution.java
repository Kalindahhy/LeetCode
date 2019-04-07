package leetcode_387;
import java.util.*;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * s = "leetcode",   返回 0.
 * s = "loveleetcode",   返回 2.
 * **/

public class Solution {
	public int firstUniqChar(String s) {
		int[] str_index = new int[26];
		for(int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			str_index[index]++;
		}
		for(int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			if(str_index[index] == 1) {
				return i;
			}
		}
        return -1;
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(new Solution().firstUniqChar(s));
	}
}
