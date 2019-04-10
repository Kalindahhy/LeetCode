import java.util.*;

public class FindMin {
	public int findmin(int[] num) {
		int res = 0;
		for(int i = 0; i < num.length; i++) {
			int r = num[i];
			for(int j = i + 1; j < num.length; j++) {
				r = r + num[j];
				if(r < res) {
					res = r;
				}
			}	
			if(r < res) {
				res = r;
			}
		}
		return res;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = in.nextInt();
		}
		System.out.println(new FindMin().findmin(num));
	}
}
