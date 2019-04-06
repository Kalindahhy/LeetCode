import java.util.Scanner;

public class FindMaxStr {
	
	static String findstr(String str) {
		int len = str.length();
		int[] length = new int[len];
		int maxindex = 0, maxlength = 0, left, right;
		
		for(int i = 0; i < len; i++) {
			/*考虑子串是奇数个的情况*/
	        left = i - 1;  
	        right = i + 1;  
	        while(left >= 0 && right != len && str.charAt(left) == str.charAt(right))  {  
	            left--;      /*从left和right向两边扫描，直到出现不相等的元素或者某一端到头了 */
	            right++;  
	        }
	        length[i] =  right - left - 1;
	        if(right - left - 1 > maxlength) {
	        	maxlength = right - left - 1;
	        	maxindex = i;
	        }
	  
	        /*考虑子串是偶数个的情况*/
	        left = i;  
	        right = i + 1;  
	        while(left >= 0 && right != len && str.charAt(left) == str.charAt(right))  {  
	            left--;  
	            right++;  
	        }  
	        length[i] =  right - left - 1;
	        if(right - left - 1 > maxlength) {
	        	maxlength = right - left - 1;
	        	maxindex = i;
	        }
		}
		if(maxlength % 2 == 0) {
			left = maxindex - (maxlength / 2) + 1;
			right = maxindex + (maxlength / 2);
		}else {
			left = maxindex - (maxlength / 2);
			right = maxindex + (maxlength / 2);
		}
		return str.substring(left, right + 1);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();	
		System.out.println(findstr(str));
	}
}
