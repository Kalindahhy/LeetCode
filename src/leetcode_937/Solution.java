package leetcode_937;

import java.util.*;

public class Solution {
	public String[] reorderLogFiles(String[] logs) {
		if(logs.length == 1) {
			return logs;
		}
		List<String> numberLog = new ArrayList<String>();
		List<String> stringLog  = new ArrayList<String>();
		for(int i = 0; i < logs.length; i++) {
			if(Character.isDigit(logs[i].charAt(logs[i].length() - 1))) {
				numberLog.add(logs[i]);
			}else {
				stringLog.add(logs[i]);
			}
		}
		if(stringLog.size() == 0) {
			return numberLog.toArray(new String[numberLog.size()]);
		}
		for (int i = 0; i < stringLog.size() - 1; i++) {
            for (int j = i + 1; j < stringLog.size(); j++) {
                String minstr = stringLog.get(i).substring(stringLog.get(i).indexOf(" ") + 1, stringLog.get(i).length());
                String str = stringLog.get(j).substring(stringLog.get(j).indexOf(" ") + 1, stringLog.get(j).length());
                if(minstr.compareTo(str) > 0) {
                	String temp = stringLog.get(i);
                	stringLog.set(i, stringLog.get(j));
                	stringLog.set(j, temp);
                }
            }
        }

		stringLog.addAll(numberLog);
        return stringLog.toArray(new String[stringLog.size()]);
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] logs = in.nextLine().split(",");
		logs = new Solution().reorderLogFiles(logs);
		for(int i = 0; i < logs.length; i++) {
			System.out.println(logs[i]);
		}
	}
}
