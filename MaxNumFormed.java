package ProblemSetI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MaxNumFormed {

	public String maxNumFormed(int arr[], int count, StringBuffer sb) {
		HashMap<Integer, Integer> maxnum = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (maxnum.containsKey(arr[i])) {
				maxnum.put(arr[i], (maxnum.get(arr[i])) + 1);
			} else {
				maxnum.put(arr[i], count);
			}

		}
		List<Integer> in = new ArrayList<Integer>();
		Iterator it = maxnum.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry kk = (Map.Entry) it.next();
			in.add((int) kk.getKey());

		}

		for (int j = in.size() - 1; j >= 0; j--) {
			for (int k = 1; k <= maxnum.get(in.get(j)); k++) {
				sb.append(in.get(j));
			}
		}
		return sb.toString();
	}

	public static void main(String arr[]) {
		int num[] = { 1, 3, 4, 3, 8, 7, 5, 5 };
		int count = 1;
		StringBuffer sb = new StringBuffer();
		MaxNumFormed mnf = new MaxNumFormed();
		System.out.println(mnf.maxNumFormed(num, count, sb));
	}

}
