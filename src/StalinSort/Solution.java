package StalinSort;

import java.util.List;

public class Solution {
	public static void stalinSort(List<Integer> arr){
	    if (arr.isEmpty() || arr.size() == 1)
				return;
			int pos = 1;
			while (pos < arr.size() - 1) {
				if (arr.get(pos) < arr.get(pos - 1))
					arr.remove(pos);
				else
					pos++;
			}
	    if (arr.get(pos) < arr.get(pos - 1)) {
	      arr.remove(pos);
	    }
	}
}
