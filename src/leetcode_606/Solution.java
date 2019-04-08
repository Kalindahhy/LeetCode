package leetcode_606;

import java.util.*;

/**
 * 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
 * 空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
 * 示例 1:
 * 输入: 二叉树: [1,2,3,4]
 *        1
 *      /   \
 *     2     3
 *    /    
 *   4     
 * 输出: "1(2(4))(3)"
 * 解释: 原本将是“1(2(4)())(3())”，
 * 在你省略所有不必要的空括号对之后，
 * 它将是“1(2(4))(3)”。
 * 示例 2:
 * 输入: 二叉树: [1,2,3,null,4]
 *          1
 *        /   \
 *       2     3
 *        \  
 *         4 
 * 输出: "1(2()(4))(3)"
 * 解释: 和第一个示例相似，除了我们不能省略第一个对括号来中断输入和输出之间的一对一映射关系。
 * **/
public class Solution {
	public String tree2str(TreeNode t) {
		if (t == null) {
            return "";
        }
        String result = t.val + "";
        if (t.left != null || t.right != null) {
            result = result + "(" + tree2str(t.left) + ")";
        }
        if (t.right != null) {
            result = result + "(" + tree2str(t.right) + ")";
        }
        return result;
    }
	public void creatTree(int[] tree, TreeNode parent, int i) {
		if(2 * i <= tree.length && tree[2 * i - 1] != 0) {
			TreeNode left = new TreeNode(tree[2 * i - 1]);
			parent.left = left;
			creatTree(tree, parent.left, 2 * i);
		}
		if(2 * i + 1 <= tree.length && tree[2 * i] != 0) {
			TreeNode right = new TreeNode(tree[2 * i]);
			parent.right = right;
			creatTree(tree, parent.right, 2 * i + 1);
		}		
	}
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] str = in.nextLine().split(",");
		int[] tree = new int[str.length];
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals("null")) {
				tree[i] = 0;
			}else {
				tree[i] = Integer.parseInt(str[i]);
			}
		}	
		Solution solution = new Solution();
		TreeNode head = new TreeNode(tree[0]);
		TreeNode parent = head;
		solution.creatTree(tree, parent, 1);
		System.out.println(solution.tree2str(head));
	}
}
