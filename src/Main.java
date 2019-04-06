import java.util.*;
public class Main {
	public List<String> commonChars(String[] A) {
	    List<String> list = new ArrayList<>();
	    Map<Character, Integer> map = new HashMap<>();
	    String str = A[0];
	    for(int i = 0; i < str.length(); i++) {
	    	map.putIfAbsent(str.charAt(i), 0);
	    	map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
	    }
	    for(int i = 1; i < A.length; i++) {
	    	str = A[i];
	    	Map<Character, Integer> map1 = new HashMap<>();
	    	for(int j = 0; j < str.length(); j++) {
		    	map1.putIfAbsent(str.charAt(j), 0);
		    	map1.put(str.charAt(j), map1.get(str.charAt(j)) + 1);
		    }
	    	for(Character c:map.keySet()) {
	    		if(map1.containsKey(c)) {
	    			map.put(c, Math.min(map.get(c), map1.get(c)));
	    		}else {
	    			map.put(c, 0);
	    		}
	    	}
	    }
	    for(Character c:map.keySet()) {
    		while(map.get(c) != 0) {
    			list.add(c + "");
    			map.put(c, map.get(c) - 1);
    		}
    	}
	    return list;
	}
	public static void main(String[] args) {
		Main m = new Main();
		String[] A = new String[] {"bella","label","roller"};
		List<String> list = new ArrayList<String>();
		list = m.commonChars(A);
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "  ");
		}
	}
//*******************************************************************************************************
/*	public int numRookCaptures(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
            	//找到R的位置
                if(board[i][j]=='R'){
                	//以R 为原点建立坐标系
                    //依次向上找,向下找,向右找,向左找
                    return cap(board,i,j,0,1)+cap(board,i,j,0,-1)+cap(board,i,j,1,0)+cap(board,i,j,-1,0);
                }
            }
        }
        return 0;
    }
    public int cap(char[][] a,int x,int y,int dx,int dy){
    	参数说明 
         *a为原数组矩阵
         *x,y为R的坐标
         *dx,dy为增长步长
        
        while(x>=0 && x<a.length && y>=0 && y<a[x].length && a[x][y]!='B'){
            if(a[x][y]=='p'){
                return 1;
            }
            x+=dx;
            y+=dy;
        }
        return 0;
    }
	public static void main(String[] args) {
		Main m = new Main();
		char[][] board = new char[][] {{'.','.','.','.','.','.','.','.'},
									   {'.','.','.','p','.','.','.','.'},
									   {'.','.','.','R','.','.','.','p'},
									   {'.','.','.','.','.','.','.','.'},
									   {'.','.','.','.','.','.','.','.'},
									   {'.','.','.','p','.','.','.','.'},
									   {'.','.','.','.','.','.','.','.'},
									   {'.','.','.','.','.','.','.','.'}};
		System.out.print(m.numRookCaptures(board));
	}*/
//*******************************************************************************************************	
	/*public List<Integer> addToArrayForm(int[] A, int K) {
		List<Integer> listk = new ArrayList<Integer>();
		while(K != 0) {
			listk.add(K % 10);
			K = K / 10;
		}
		List<Integer> list = new ArrayList<Integer>();
		for(int i = A.length - 1; i >= 0; i--) {
			list.add(A[i]);
		} 
		while(list.size() < listk.size()) {
			list.add(0);
		}
		while(listk.size() < list.size()) {
			listk.add(0);
		}
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum = listk.get(i) + list.get(i);
			if(sum > 9) {
				list.set(i, sum % 10);
				if(i + 1 < list.size()) {
					list.set(i + 1, list.get(i + 1) + 1);
				}else {
					list.add(1);
					break;
				}
			}else {
				list.set(i, sum);
			}
		}
		Collections.reverse(list);
		return list;
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] A = new int[] {9,9,9};
		List<Integer> list = new ArrayList<Integer>();
		list = m.addToArrayForm(A, 11);
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "  ");
		}
	}*/
//*******************************************************************************************************	
	/*public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int[] answer = new int[queries.length];
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
        	if(A[i] % 2 == 0) {
        		sum = sum + A[i];
        	}
        }
        for(int i = 0; i < queries.length; i++) {
        	int numa = A[queries[i][1]];
        	int numq = queries[i][0];
        	A[queries[i][1]] = A[queries[i][1]] + numq;
        	if(numa % 2 == 0) {
        		if(numq % 2 == 0) {
        			sum = sum + numq;
        		}else {
        			sum = sum - numa;
        		}
        	}else {
        		if(numq % 2 != 0) {
        			sum = sum + numq + numa;
        		}
        	}
        	answer[i] = sum;
        }
        return answer;
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] A = new int[] {1,2,3,4};
		int[][] queries = new int[][] {{1,0},{-3,1},{-4,0},{2,3}};
		int[] answer = new int[queries.length];
		answer = m.sumEvenAfterQueries(A, queries);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + "  ");
		}
	}*/
//*******************************************************************************************************	
	/*public int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++) {
        	A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] A = new int[] {-4,-1,0,3,10};
		A = m.sortedSquares(A);
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
	}*/
//*******************************************************************************************************	
	/*public boolean validMountainArray(int[] A) {
		if(A.length < 3) {
			return false;
		}
		for(int i = 1; i < A.length - 1; i++) {
			boolean f1 = true, f2 = true;
			for(int j = 0; j < i; j++) {
				if(A[j] >= A[j + 1]) {
					f1 = false;
					break;
				}
			}
			if(f1) {
				for(int j = i; j < A.length - 1; j++) {
					if(A[j] <= A[j + 1]) {
						f2 = false;
						break;
					}
				}
			}
			if(f1 && f2) {
				return true;
			}
		}
        return false;
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] A = new int[] {3,3,5};
		System.out.print(m.validMountainArray(A));
	}*/
//*******************************************************************************************************	
	/*public int[] sortArrayByParityII(int[] A) {
        int[] num = new int[A.length];
        int index = 0, index1 = 1;
        for(int i = 0; i < A.length; i++) {
        	if(A[i] % 2 == 0) {
        		num[index] = A[i];
        		index = index + 2;
        	}else {
        		num[index1] = A[i];
        		index1 = index1 + 2;
        	}
        }
        return num;
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] A = new int[] {4,2,5,7};
		A = m.sortArrayByParityII(A);
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
	}*/
//*******************************************************************************************************	
	/*public boolean hasGroupsSizeX(int[] deck) {
		Arrays.sort(deck);
		for(int i = 2; i <= deck.length; i++) {
			int index = 1;
			int count = 1;
			while(index < deck.length) {
				if(index % i == 0) {
					count = 1;
					index++;
				}
				if(deck[index] != deck[index - 1]) {
					break;
				}
				index++;
				count++;
			}
			if(index == deck.length && count == i) {
				return true;
			}
		}
        return false;
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] A = new int[] {1,1,2,2,2,2};
		System.out.print(m.hasGroupsSizeX(A));
	}*/
//*******************************************************************************************************	
	/*public int[] sortArrayByParity(int[] A) {
        int[] num = new int[A.length];
        int right = A.length - 1;
		int left = 0;
        for(int i = 0; i < A.length; i++) {
        	if(A[i] % 2 == 0) {
        		num[left] = A[i];
        		left++;
        	}else {
        		num[right] = A[i];
        		right--;
        	}
        }
        return num;
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] A = new int[] {3,1,2,4};
		A = m.sortArrayByParity(A);
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
	}*/
//*******************************************************************************************************	
	/*public boolean isMonotonic(int[] A) {
		if(A.length < 2) {
			return true;
		}
		int index = 1;
		while(index < A.length && A[index - 1] == A[index]) {
			index++;
		}
		if(index == A.length) {
			return true;
		}
		int f = (A[index - 1] > A[index])? 0 : 1;//1--单调递增          0--单调递减
		for(int i = index; i < A.length - 1; i++) {
			if(f == 0 && A[i] < A[i + 1]) { //单调递减
				return false;
			}
			if(f == 1 && A[i] > A[i + 1]) { //单调递减
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Main m = new Main();
		int[] A = new int[] {1,1,0};
		System.out.println(m.isMonotonic(A));
	}*/
//*******************************************************************************************************	
	/*public int[] fairCandySwap(int[] A, int[] B) {
		int[] n = new int[2];
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < A.length; i++) {
			sum1 = sum1 + A[i];
		}
		for (int i = 0; i < B.length; i++) {
			sum2 = sum2 + B[i];
		}
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < B.length; j++) {
				if((sum1 - sum2) == 2 * (A[i] - B[j])) {
					n[0] = A[i];
					n[1] = B[j];
					return n;
				}
			}
		}
		return n;
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] A = new int[] {1,2,5};
		int[] B = new int[] {2,4};
		int[] n = new int[2];
		n = m.fairCandySwap(A, B);
		System.out.print(n[0] + "  " + n[1]);
	}*/
//*******************************************************************************************************	
	/*public int[] transpose(int[][] A) {
		int row = A.length;
		int col = A[0].length;
		int[][] n = new int[col][row];
		for(int i = 0; i < col; i++) {
			for(int j = 0; j < row; j++) {	
				n[i][j] = A[j][i];
			}
		}
		return n;
    }
	
	public static void main(String[] args) {
		int[][] nums = new int[][] {{1,2,3}, 
									{4,5,6},
									{7,8,9},
									{10,11,12}};
		Main m = new Main();
		int[][] n = new int[nums[0].length][nums.length];
		n = m.transpose(nums);
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + "  ");
			}
			System.out.println();
		}
		
	}*/
//*******************************************************************************************************	
	/*public int maxDistToClosest(int[] seats) {
		int maxlen = 0;
		int left = -1;
		for(int i = 0; i < seats.length; i++) {
			if(seats[i] == 1) {
				if(left == -1) {
					maxlen = Math.max(maxlen, i);
				}else {
					maxlen = Math.max(maxlen, (i - left) / 2);
				}
				left = i;
			}
		}
		maxlen = Math.max(maxlen, seats.length - 1 - left);
        return maxlen;
    }
	public static void main(String[] args) {
		int[] seats = new int[] {0,0,1};
		Main m = new Main();
		System.out.println(m.maxDistToClosest(seats));
	}*/
//*******************************************************************************************************	
	/*public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for(int row = 2; row < grid.length; row++) {
        	for(int col = 2; col < grid[row].length; col++) {
        		ArrayList<Integer> list = new ArrayList<Integer>();
        		for(int i = row - 2; i <= row; i++) {
        			for(int j = col - 2; j <= col; j++) {
        				if((!list.contains(grid[i][j])) && grid[i][j] < 10 && grid[i][j] > 0) {
        					list.add(grid[i][j]);
        				}
        			}
        		}
        		if(list.size() != 9) {
        			continue;
        		}
        		if(grid[row - 1][col - 1] != 5) {
        			continue;
        		}else if((grid[row - 2][col - 2] + grid[row][col] != 10)
        		 ||(grid[row][col - 2] + grid[row - 2][col] != 10)) {
        			continue;
        		}else if((grid[row - 2][col - 2] + grid[row - 2][col - 1] + grid[row - 2][col] != 15)
        			   ||(grid[row - 1][col - 2] + grid[row - 1][col - 1] + grid[row - 1][col] != 15)
        			   ||(grid[row][col - 2] + grid[row][col - 1] + grid[row][col] != 15)
        			   ||(grid[row - 2][col - 2] + grid[row - 1][col - 2] + grid[row][col - 2] != 15)
        			   ||(grid[row - 2][col - 1] + grid[row - 1][col - 1] + grid[row][col - 1] != 15)
        			   ||(grid[row - 2][col] + grid[row - 1][col] + grid[row][col] != 15)) {
        			continue;
        		} 
        		count++;
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		int[][] grid = new int[][] {{5,5,5}, 
									{5,5,5},
									{5,5,5}};
		Main m = new Main();
		System.out.println(m.numMagicSquaresInside(grid));
	}*/
//*******************************************************************************************************	
	/*public int[][] flipAndInvertImage(int[][] A) {
		for(int i = 0; i < A.length; i++) {
			int len = A[i].length;
			for(int j = 0; j < len / 2; j++) {
				int temp = A[i][j];
				A[i][j] = A[i][len - j - 1];
				A[i][len - j - 1] = temp;
			}
		}
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				A[i][j] = (A[i][j] + 1) % 2;
			}
		}
        return A;
    }
	public static void main(String[] args) {
		int[][] nums = new int[][] {{1,1,0,0}, 
									{1,0,0,1},
									{0,1,1,1},
									{1,0,1,0}};
		Main m = new Main();
		m.flipAndInvertImage(nums);
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + "  ");
			}
			System.out.println();
		}
		
	}*/
//*******************************************************************************************************	
	/*public List<List<Integer>> largeGroupPositions(String S) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(S.length() < 3) return list;
		int start = 0;
		for(int i = 1; i <= S.length(); i++) {
			if((i == S.length()) || (S.charAt(i) != S.charAt(start))) {
				if(i - start >= 3) {
					List<Integer> lis = new ArrayList<Integer>();
					lis.add(start);
					lis.add(i - 1);
					list.add(lis);
				}
				start = i;
			}
		}
		return list;
    }
	public static void main(String[] args) {
		String s = "aaa";
		Main m = new Main();
		List<List<Integer>> list = m.largeGroupPositions(s);
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j) + "   ");
			}
			System.out.println();
		}
	}*/
//*******************************************************************************************************	
	/*public boolean isToeplitzMatrix(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		for(int i = 0; i < col; i++) {
			int m = 1, n = i + 1;
			while(m < row && n < col) {
				if(matrix[m][n] != matrix[0][i]) {
					return false;
				}
				m++;
				n++;
			}
		}
		for(int i = 1; i < row; i++) {
			int m = i + 1, n = 1;
			while(m < row && n < col) {
				if(matrix[m][n] != matrix[i][0]) {
					return false;
				}
				m++;
				n++;
			}
		}
        return true;
    }
	public static void main(String[] args) {
		int[][] nums = new int[][] {{1,2,3,4}, 
									{5,1,2,3},
									{9,5,1,2}
									{11,74,0,39},
									{40,11,74,7}};
		Main m = new Main();
		System.out.println(m.isToeplitzMatrix(nums));
	}*/
//*******************************************************************************************************	
	/*public int dominantIndex(int[] nums) {
		if(nums.length == 1) {
			return 0;
		}
        int index = 0;
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
        	if(nums[i] > max) {
        		max = nums[i];
        		index = i;
        	}
        }
        Arrays.sort(nums);
        if(nums[nums.length - 2] * 2 > max) {
    		return -1;
    	}
        return index;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2};
		Main m = new Main();
		System.out.println(m.dominantIndex(nums));
	}*/
//*******************************************************************************************************
	/*public int minCostClimbingStairs(int[] cost) {
        int[] value = new int[cost.length];
        value[0] = cost[0];
        value[1] = cost[1];
        for(int i = 2; i < cost.length; i++) {
        	value[i] = Math.min(cost[i - 1], cost[i - 2]) + cost[i];
        }
        return Math.min(value[cost.length - 1], value[cost.length - 2]);
    }
	public static void main(String[] args) {
		int[] nums = new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		Main m = new Main();
		System.out.println(m.minCostClimbingStairs(nums));
	}*/
//*******************************************************************************************************
	/*public int pivotIndex(int[] nums) {
		if(nums.length == 0) return -1;
		if(nums.length == 1) return 0;
        int left = 0 , right = 0;
        for(int i = 1; i < nums.length; i++) {
        	right = right + nums[i];
        }
        int index = 0;
        while(index < nums.length) {
        	if(left == right) {
        		return index;
        	}
        	left = left + nums[index];
        	index++;
        	if(index >= nums.length - 1) {
        		right = 0;
        	}else {
        		right = right - nums[index];
        	}
        }
        return -1;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {-1, 1, 2};
		Main m = new Main();
		System.out.println(m.pivotIndex(nums));
	}*/
//*******************************************************************************************************
	/*public boolean isOneBitCharacter(int[] bits) {
        int index = 0;
        while(index < bits.length - 1) {
        	if(bits[index] == 1) {
        		index++;
        	}
        	index++;
        }
        return index != bits.length;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {1,0,0};
		Main m = new Main();
		System.out.println(m.isOneBitCharacter(nums));
	}*/
//*******************************************************************************************************
	/*public int findShortestSubArray(int[] nums) {
        if(nums.length == 1) {
        	return 1;
        }
        
        //记录每个数据出现的次数
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
        	map.putIfAbsent(nums[i], 0);
        	map.put(nums[i], map.get(nums[i]) + 1);
        }
        
        //找到度
        int degree = 0;
        for(int key : map.keySet()) {
        	if(map.get(key) > degree) {
        		degree = map.get(key);
        	}
        }
        
        //找到构成度的数
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int key : map.keySet()) {
        	if(map.get(key) == degree) {
        		list.add(key);
        	}
        }
        
        int len = Integer.MAX_VALUE;
        for(int i =  0; i < list.size(); i++) {
        	int key = list.get(i);
        	int start = 0, end = nums.length - 1;
        	while(start < nums.length) {
        		if(nums[start] == key) {
        			break;
        		}
        		start++;
        	}
        	while(end >= 0) {
        		if(nums[end] == key) {
        			break;
        		}
        		end--;
        	}
        	len = Math.min(len, end - start + 1);
        }
        return len;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,2,3,1};
		Main m = new Main();
		System.out.println(m.findShortestSubArray(nums));
	}*/
//*******************************************************************************************************
	/*public int findLengthOfLCIS(int[] nums) {
		if(nums.length < 1) {
			return 0;
		}
        int maxlen = 1;
        int start = 0, end = 1;
        while(end < nums.length) {
        	if(nums[end - 1] >= nums[end]) {
        		maxlen = Math.max(maxlen, end - start);
        		start = end;
        	}
        	end++;
        }
        maxlen = Math.max(maxlen, end - start);
        return maxlen;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {1,3,5,4,7};
		Main m = new Main();
		System.out.println(m.findLengthOfLCIS(nums));
	}*/
//*******************************************************************************************************
	/*public boolean checkPossibility(int[] nums) {
		if(nums.length <= 2) return true;
		
		int index = -1; //记录要转换元素的位置
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] > nums[i + 1]) {
				index = i;
				break;
			} 
		}
		if(index < 0) return true; //数组递减
		
		boolean f1 = true, f2 = true;
		//取出index的情况
		if(index != 0 && nums[index + 1] < nums[index - 1]) {
			f1 = false;
		}
		for(int i = index + 1; i < nums.length - 1; i++) {
			if(nums[i] > nums[i + 1]) {
				f1 = false;
				break;
			}
		}
		//取出index + 1的情况
		index = index + 1;
		if(index + 1 < nums.length && nums[index + 1] < nums[index - 1]) {
			f2 = false;
		}
		for(int i = index + 1; i < nums.length - 1; i++) {
			if(nums[i] > nums[i + 1]) {
				f2 = false;
				break;
			}
		}
		if(f1 == false && f2 == false) {
			return false;
		}
        return true;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {2,3,3,2,4};
		Main m = new Main();
		System.out.println(m.checkPossibility(nums));
	}*/
//*******************************************************************************************************
	/*public int[][] imageSmoother(int[][] M) {
		int r = M.length;
		int c = M[0].length;
		int row = M.length + 2;
		int col = M[0].length + 2;
        int[][] newm = new int[row][col];
        
        *//**
         * 为矩阵外面套一层，便于计算
         * **//*
        for(int i = 0; i < row; i++) {
        	newm[i][0] = 0;
        	newm[i][col - 1] = 0;
        }
        for(int i = 1; i < col - 1; i++) {
        	newm[0][i] = 0;
        	newm[row - 1][i] = 0;
        }
        for(int i = 1; i < row - 1; i++) {
        	for(int j = 1; j < col - 1; j++) {
        		newm[i][j] = M[i - 1][j - 1];
        	}
        }
        
        *//**
         * 注意 i = 0,r - 1和j = 0, col - 1的点
         * **//*
        row = 1;
        for(int i = 0; i < r; i++, row++) {
        	col = 1;
        	for(int j = 0; j < c; j++, col++) {
        		int sum = newm[row - 1][col - 1] + newm[row - 1][col] + newm[row - 1][col + 1]
        				+ newm[row][col - 1] + newm[row][col] + newm[row][col + 1]
        				+ newm[row + 1][col - 1] + newm[row + 1][col] + newm[row + 1][col + 1];
        		int k = 0;
        		//i - 1
        		if(i - 1 >= 0) {
        			if(j - 1 >= 0) {
        				k++;
        			}
        			k++;
        			if(j + 1 < c) {
        				k++;
        			}
        		}
        		//i
        		if(j - 1 >= 0) {
        			k++;
        		}
        		k++;
        		if(j + 1 < c) {
        			k++;
        		}
        		//i + 1
        		if(i + 1 < r) {
        			if(j + 1 < c) {
        				k++;
        			}
        			k++;
        			if(j - 1 >= 0) {
        				k++;
        			}
        		}
        		M[i][j] = (int) Math.floor(sum / k);
        	}
        }
        return M;
    }
	public static void main(String[] args) {
		int[][] nums = new int[][] {{2,3,4},
									{5,6,7},
									{8,9,10},
									{11,12,13},
									{14,15,16}
									{1,1,1},
									{1,0,1},
									{1,1,1}
									{1}};
		Main m = new Main();
		nums = m.imageSmoother(nums);
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[0].length; j++) {
				System.out.print(nums[i][j] + "   ");
			}
			System.out.println();
		}
		 4,4,5
		 * 5,6,6
		 * 8,9,9
		 * 11,12,12
		 * 13,13,14
		 * 
	}*/
//*******************************************************************************************************
	/*public double findMaxAverage(int[] nums, int k) {
		double sum = Integer.MIN_VALUE;
        for(int i = 0; i <= nums.length - k; i++) {
        	double m = 0;
        	for(int j = i; j < k + i; j++) {
        		m = m + nums[j];
        	}
        	if(m > sum) {
        		sum = m;
        	}
        }
        return sum / k;
    }*/
	
	/*public double findMaxAverage(int[] nums, int k) {
		double sum = 0;
		for(int i = 0; i < k; i++) {
			sum = sum + nums[i];
		}
		double temp = sum;
        for(int i = k; i < nums.length; i++) {
        	temp = temp - nums[i - k] + nums[i];
        	sum = Math.max(temp, sum);
        }
        return sum / k;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {-1};
		Main m = new Main();
		System.out.print(m.findMaxAverage(nums, 1));
	}*/
//*******************************************************************************************************
	/*public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
        int m1 = nums[0] * nums[1] * nums[len - 1];
        int m2 = nums[len - 1] * nums[len - 2] * nums[len - 3];
        return m1 > m2? m1 : m2;
    }
	public static void main(String[] args) {
		int[] flowerbed = new int[] {1};
		Main m = new Main();
		System.out.print(m.maximumProduct(flowerbed));
	}*/
//*******************************************************************************************************
	/*public boolean canPlaceFlowers(int[] flowerbed, int n) {
		if(flowerbed.length == 1 && flowerbed[0] == 0) {
			n--;
			flowerbed[0] = 1;
		}
		if(flowerbed.length > 1) {
			if(flowerbed[0] == 0 && flowerbed[1] == 0) {
				n--;
				flowerbed[0] = 1;
			}
			int index = 1;
			while(index < flowerbed.length - 1) {
				if(flowerbed[index - 1] == 0 && flowerbed[index] == 0 && flowerbed[index + 1] == 0) {
					n--;
					flowerbed[index]  = 1;
				}
				index++;
			}
			if(flowerbed[index] == 0 && flowerbed[index - 1] == 0) {
				n--;
				flowerbed[index] = 1;
			}
		}		
		if(n <= 0) {
			return true;
		}
        return false;
    }
	
	public static void main(String[] args) {
		int[] flowerbed = new int[] {1};
		Main m = new Main();
		System.out.print(m.canPlaceFlowers(flowerbed, 0));
	}*/
//*******************************************************************************************************
	/*public int findUnsortedSubarray(int[] nums) {
		int[] numsClone = nums.clone();
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1;
        while(nums[start] == numsClone[start]) {
        	start++;
        }
        while(nums[end] == numsClone[end]) {
        	end--;
        }
        return end - start + 1;
    }
    public int findUnsortedSubarray(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int start = 0, end = 0;
        for(int i = 0; i < nums.length; i++) {
        	map.put(i, nums[i]);
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
        	if(map.get(i) != nums[i]) {
        		start = i;
        		break;
        	}
        }
        for(int i = nums.length - 1; i >= 0; i--) {
        	if(map.get(i) != nums[i]) {
        		end = i  + 1;
        		break;
        	}
        }
        return end - start;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {2, 6, 4, 8, 10, 9, 15};
		Main m = new Main();
		System.out.print(m.findUnsortedSubarray(nums));
	}*/
//*******************************************************************************************************
	/*public int[][] matrixReshape(int[][] nums, int r, int c) {
		if(nums.length * nums[0].length != r * c) {
        	return nums;
        }
        int[][] result = new int[r][c];
        int row = 0, col = 0;      
        for(int i = 0; i < nums.length; i++) {
        	for(int j = 0; j < nums[i].length; j++) {
        		if(col == c) {
        			row++;
        			col = 0;
        		}
        		result[row][col] = nums[i][j]; 
        		col++;
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		int[][] nums = new int[][] {{3,2},{2,4}};
		Main m = new Main();
		int[][] result = m.matrixReshape(nums, 1, 4);
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length ;j++) {
				System.out.print(result[i][j] + "  ");
			}
			System.out.println();
		}
	}*/
//*******************************************************************************************************
	/*public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i = i + 2) {
        	sum = sum + nums[i];
        }
        return sum;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {3, 2, 4, 1};
		Main m = new Main();
		System.out.print(m.arrayPairSum(nums));
	}*/
//*******************************************************************************************************
	/*public int findPairs(int[] nums, int k) {
		Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        if(k<0)return count;
        for(int i=0;i<nums.length;i++){
               map.putIfAbsent(nums[i], 0);
               map.put(nums[i], map.get(nums[i])+1);
        }
        for(int i:map.keySet()){
            if(k==0){
                if(map.get(i)>1)
                count++;
            }
            else if(map.containsKey(i+k)){
                count++;
            }
        }
        return count;
	 }
	 public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Map<String, Integer> map = new HashMap<String, Integer>(); 
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
        	for(int j = i + 1; j < nums.length; j++) {
        		if(nums[i] + k == nums[j]) {
        			String s = "(" + nums[i] + "," + nums[j] + ")";
        			if(!map.containsKey(s)) {
        				map.put(s, 1);
        				count++;
        			}
        		}		
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {3, 1, 4, 1, 5};
		Main m = new Main();
		System.out.print(m.findPairs(nums, 3));
	}
	*/
//*******************************************************************************************************
	/*public int findMaxConsecutiveOnes(int[] nums) {
        int len = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] == 1) {
        		len++;
        	}else {
        		len = 0;
        	}
        }
        return len;
    }
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(in.nextInt() != 2) {
			list.add(in.nextInt());
		}
		int[] numbers = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			numbers[i] = list.get(i);
		}
		Main m = new Main();
		System.out.print(m.findMaxConsecutiveOnes(numbers));
	}*/
//*******************************************************************************************************
	/*public List<Integer> findDisappearedNumbers(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> index = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], 1);
		}
		for(int i = 1; i <= nums.length; i++) {
			if(!map.containsKey(i)) {
				index.add(i);
			}
		}
        return index;
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] numbers = new int[] {4,3,2,7,8,2,3,1};
        List<Integer> index = new ArrayList<Integer>();
		index = m.findDisappearedNumbers(numbers);
		for(int i = 0; i < index.size(); i++) {
			System.out.print(index.get(i) + "  ");
		}
	}*/
//*******************************************************************************************************
	/*public void moveZeroes(int[] nums) {
		int len = nums.length;
        for(int i = 0; i < len; i++) {
        	if(nums[i] == 0) {
        		for(int j = i; j < len - 1; j++) {
        			nums[j] = nums[j + 1];
        		}
        		nums[len - 1] = 0;
        		i--;
        		len--;
        	}
        }
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] numbers = new int[] {0,0,1};
		m.moveZeroes(numbers);
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
		}
	}*/
//*******************************************************************************************************
	/*public int missingNumber(int[] nums) {
		int sum = 0, sum1 = 0;
		for(int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			sum1 = sum1 + i  + 1;
		}
		return sum1 - sum;
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] numbers = new int[] {9,6,4,2,3,5,7,0,1};
		System.out.println(m.missingNumber(numbers));
	}*/
//*******************************************************************************************************
	/*public boolean containsDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				if(i - map.get(nums[i]) <= k) {
					return true;
				}else {
					map.put(nums[i], i);
				}
			}else {
				map.put(nums[i], i);
			}
		}
        return false;
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] numbers = new int[] {1,2,3,1,2,3};
		System.out.println(m.containsDuplicate(numbers, 1));
	}*/
//*******************************************************************************************************
	/*public void revers(int[] n, int start, int end) {
		while(start < end) {
			int temp = n[start];
			n[start] = n[end];
			n[end] = temp;
			start++;
			end--;
		}
	}
	public void rotate(int[] nums, int k) {
		int len = nums.length;
		k = k % len;
		revers(nums, 0, len - k - 1);
		revers(nums, len - k, len - 1);
		revers(nums, 0, len - 1);
    }
	public void rotate(int[] nums, int k) {
		for(int j = 0; j < k; j++) {
			int temp = nums[nums.length - 1];
			for(int i = nums.length - 1; i > 0; i--) {
	        	 nums[i] = nums[i - 1];
	        }
			nums[0] = temp;
		}
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] numbers = new int[] {1,2,3,4,5,6,7};
		m.rotate(numbers, 3);
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "   ");
		}
	}*/
//*******************************************************************************************************
	/*
    public int majorityElement(int[] nums) {
        int number = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
        	if(map.containsKey(nums[i])) {
        		map.put(nums[i], map.get(nums[i]) + 1);
        	}else {
        		map.put(nums[i], 1);
        	}
        }
        Set<Integer> keyset = map.keySet();
        for(Integer key : keyset) {
        	if(map.get(key) > nums.length / 2 && map.get(key) > number) {
        		number = key;
        	}
        }
        return number;
    }
    public static void main(String[] args) {
		Main m = new Main();
		int[] numbers = new int[] {2,2,1,1,1,2,2};
		System.out.println(m.majorityElement(numbers));
	}*/
//*******************************************************************************************************
    /*public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        int index1 = 0;
        int index2 = numbers.length - 1;
        while(index1 < index2) {
        	int sum = numbers[index1] + numbers[index2];
        	if(sum == target) {
        		index[0] = index1;
        		index[1] = index2;
        		return index;
        	}
        	if(sum < target) {
        		index1++;
        	}else {
        		index2--;
        	}
        }        
        return index;
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] numbers = new int[] {2, 7, 11, 15};
		int target = 12;
		int[] index = new int[2];
		index = m.twoSum(numbers, target);
		System.out.println(index[0] + "      " + index[1]);
	}*/
//*******************************************************************************************************
	/*public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
        	if(Character.isLetterOrDigit(s.charAt(i))) {
        		str.append(s.charAt(i));
        	}
        }
        s = str.toString();
        int len = s.length();
        boolean f = true;
        for(int i = 0; i < len / 2; i++) {
        	if(s.charAt(i) != s.charAt(len - 1 - i)) {
        		f = false;
        		break;
        	}
        }       
        return f;
    }
	public static void main(String[] args) {
		Main m = new Main();
		String ss = "";
		System.out.println(m.isPalindrome(ss));
	}*/
//*******************************************************************************************************
	/*public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int min = prices[0];
        int money = Integer.MIN_VALUE;
        
        for(int i = 1; i < prices.length; i++) {
        	money = Math.max(money, prices[i] - min);
        	min = Math.min(min, prices[i]);
        }
        return (money < 0)? 0 : money; 
    }
	public static void main(String[] args) {
		Main m = new Main();
		int[] prices = new int[]{7,6,5,4,3,2,1};
		System.out.println(m.maxProfit(prices));
	}*/
//*******************************************************************************************************
	/*public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> r = new ArrayList<Integer>();              
        if(rowIndex == 0){ 
            r.add(1);
            return r;
        }
        if(rowIndex == 1){  
            r.add(1);
            r.add(1);
            return r;
        }
        r.add(1);
        res.add(r);
        for(int i = 1; i <= rowIndex; i++){
            List<Integer> result = new ArrayList<Integer>();
            result.add(1);
            for(int j = 1; j < i; j++){
            	result.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            result.add(1);
            res.add(result);
        }
        return res.get(rowIndex);
    }
	public static void main(String[] args) {
		Main m = new Main();
		List<Integer> list = new ArrayList<Integer>();
		list = m.getRow(5);
		for(int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j) + "    ");
		}
	}*/
//*******************************************************************************************************	
   /* public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0, index2 = 0;
        int len = m + n;
        while(index1 < m && index2 < n){
            if(nums1[index1] > nums2[index2]){
                for(int i =  len - 1; i > index1; i--){
                    nums1[i] = nums1[i - 1];
                }
                nums1[index1] = nums2[index2];
                index2++;
                index1++;
                m++;
            }else{
                index1++;
            }
        }
        if(index1 == m){
            while(index1 < len){
                nums1[index1] = nums2[index2];
                index2++;
                index1++;
            }            
        }
    }
	
	public static void main(String[] args) {
		int[] nums1 = new int[] {-1,0,1,1,0,0,0,0,0};
		int[] nums2 = new int[] {-1,0,2,2,3};
		merge(nums1, 4, nums2, 5);
		for(int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}		
	}*/
}