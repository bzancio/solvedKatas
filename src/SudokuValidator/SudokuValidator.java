package SudokuValidator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SudokuValidator {
    public static boolean validate(int[][] board) {
    	for (int[] row : board) {
    		if (!validateGroup(row))
    			return false;
    	}
    	for (int i = 0; i < 9; i++) {
    		int[] column = new int[9];
    		for (int j = 0; j < 9; j++) {
    			column[j] = board[j][i];
    		}
    		if (!validateGroup(column))
    			return false;
    	}
    	for (int startRow = 0; startRow < 9; startRow += 3) {
    	    
    	    for (int startColumn = 0; startColumn < 9; startColumn += 3) {
    	        
    	        int[] group = new int[9];
    	        int counter = 0;

    	        for (int i = 0; i < 3; i++) {
    	            for (int j = 0; j < 3; j++) {
    	                group[counter] = board[startRow + i][startColumn + j];
    	                counter++;
    	            }
    	        }

    	        if (!validateGroup(group))
    	        	return false;
    	    }
    	}
        return true;
    }

    public static boolean validateGroup(int[] group) {
    	List<Integer> numbers = new ArrayList<Integer>();
    	for (int i : group) {
    		numbers.add(i);
    		if (Collections.frequency(numbers, (Integer)i) > 1 || i > 9 || i < 1) {
    			return false;
    		}
    	}
		 return true;
    }
    
    public static void main(String[] args) {
    	SudokuValidator.validate(new int[][]{
            {5,5,5,5,5,5,5,5,5},
            {5,5,5,5,5,5,5,5,5},
            {5,5,5,5,5,5,5,5,5},
            {5,5,5,5,5,5,5,5,5},
            {5,5,5,5,5,5,5,5,5},
            {5,5,5,5,5,5,5,5,5},
            {5,5,5,5,5,5,5,5,5},
            {5,5,5,5,5,5,5,5,5},
            {5,5,5,5,5,5,5,5,5}});
	}
}
