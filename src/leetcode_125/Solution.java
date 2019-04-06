package leetcode_125;
/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * **/
public class Solution {
	public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        s = s.toLowerCase();
        while(left < right) {
        	while(left < s.length() && !Character.isLetterOrDigit(s.charAt(left))) {
        		left++;
        	}
        	while(right >= 0 && !Character.isLetterOrDigit(s.charAt(right))) {
        		right--;
        	}
        	if(left <= right && s.charAt(left) == s.charAt(right)) {
        		left++;
        		right--;
        	}else {
        		break;
        	}
        }
        return left >= right? true : false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		String s = "0p";
		System.out.println(solution.isPalindrome(s));
	}

}
