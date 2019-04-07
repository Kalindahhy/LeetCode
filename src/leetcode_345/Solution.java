package leetcode_345;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。A.E.I.O.U
 * 输入: "hello"
 * 输出: "holle"
 * 输入: "leetcode"
 * 输出: "leotcede"
 * **/
public class Solution {
	public String reverseVowels(String s) {
		StringBuilder str = new StringBuilder(s);
		String aeiou = "aeiouAEIOU";
		int left = 0, right = str.length() - 1;
        while(left < right) {
        	while(left < str.length() && aeiou.indexOf(str.charAt(left)) == -1) {
        		left++;
        	}
        	while(right >= 0 && aeiou.indexOf(str.charAt(right)) == -1) {
        		right--;
        	}
        	if(left < right) {
        		char c = str.charAt(left);
        		str.setCharAt(left, str.charAt(right));
        		str.setCharAt(right, c);
        		left++;
        		right--;
        	}
        }
        s = str.toString();
        return s;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hlhlhl";
		Solution solution = new Solution();
		System.out.println(solution.reverseVowels(str));
	}

}
