package leetcode_1013;
/**
 * 给定一个整数数组 A，只有我们可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 * 形式上，如果我们可以找出索引 i+1 < j 且满足 
 * 	 (A[0] + A[1] + ... + A[i] 
 * == A[i+1] + A[i+2] + ... + A[j-1] 
 * == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分。
 * 
 * 输出：[0,2,1,-6,6,-7,9,1,2,0,1]
 * 输出：true
 * 解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
 * 
 * **/
public class Solution {
	public boolean canThreePartsEqualSum(int[] A) {
		int sum = 0;
		for(int i = 0; i < A.length; i++) {
			sum = sum + A[i];
		}
		if(sum % 3 != 0) {
			return false;
		}
		sum = sum / 3;
		int s = 0, index = 0;
		while(index < A.length) {
			s = s + A[index];
			index++;
			if(s == sum) {
				break;
			}
		}
		if(index >= A.length - 1) {
			return false;
		}
		s = 0;
		while(index < A.length) {
			s = s + A[index];
			index++;
			if(s == sum) {
				break;
			}
		}
		if(index > A.length - 1) {
			return false;
		}
		s = 0;
		while(index < A.length) {
			s = s + A[index];
			index++;
		}
		if(s == sum) {
			return true;
		}
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {0,0,0,0};
		System.out.println(new Solution().canThreePartsEqualSum(A));
	}
}
