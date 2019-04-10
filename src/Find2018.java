import java.util.*;

public class Find2018 {
	public int find(int num) {
		int count = 0;
		for(int i = 2018; i <= num; i++) {
			String s = i + "";
			boolean f1 = false, f2 = false, f3 = false, f4 = false;
			int index = 0;
			while(index < s.length()) {
				if(s.charAt(index) == '2') {
					index++;
					f1 = true;
					break;
				} 
				index++;
			}
			while(index < s.length()) {
				if(s.charAt(index) == '0') {
					index++;
					f2 = true;
					break;
				} 
				index++;
			}
			while(index < s.length()) {
				if(s.charAt(index) == '1') {
					index++;
					f3 = true;
					break;
				} 
				index++;
			}
			while(index < s.length()) {
				if(s.charAt(index) == '8') {
					index++;
					f4 = true;
					break;
				} 
				index++;
			}
			if(f1 && f2 && f3 && f4) {
				count++;
			}
		}
		return count;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(new Find2018().find(n));
	}
}
