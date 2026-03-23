package SecuritySystem;

public class Solution {
	public static int breachAttempts(int[] hackers, int securityLevel, int increase) {
		int breach = 0;
	    for (int i : hackers) {
	    	if (i <= securityLevel) {
	    		securityLevel += increase;
	    	}
	    	else breach++;
	    }
	    return breach;
	  }
}
