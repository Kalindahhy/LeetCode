package leetcode_383;
import java.util.*;

/**
 * 
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
 * 判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
 * 如果可以构成，返回 true ；否则返回 false。
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 * 注意：你可以假设两个字符串均只含有小写字母。
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * 
 * **/
public class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		Map<String, Integer> maga = new HashMap<String, Integer>();
		for(int i = 0; i <magazine.length(); i++) {
			String s = magazine.charAt(i) + "";
			maga.putIfAbsent(s, 0);
			maga.put(s, maga.get(s) + 1);
		}
		for(int i = 0; i <ransomNote.length(); i++) {
			String s = ransomNote.charAt(i) + "";
			if(!maga.containsKey(s)) {
				return false;
			}else {
				maga.put(s, maga.get(s) - 1);
				if(maga.get(s) < 0) {
					return false;
				}
			}
		}
        return true;
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String ransom, magazine;
		ransom = in.nextLine();
		magazine = in.nextLine();
		System.out.println(new Solution().canConstruct(ransom, magazine));
	}

}
