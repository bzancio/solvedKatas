package PeteBaker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class PeteBaker {
	public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
		ArrayList<Integer> vals = new ArrayList<>();
	    recipe.forEach((keyRecipe, valueRecipe) -> {
	    	if (available.containsKey(keyRecipe)) {
	    		vals.add((Integer)(available.get(keyRecipe) / valueRecipe));
	    	} else vals.add(0);
	    });
	    System.out.println(Collections.min(vals));
	    return Collections.min(vals);
	}
	public static void main(String[] args) {
		Map<String, Integer> recipe = Map.of(
	            "flour", 500,
	            "sugar", 200,
	            "eggs", 1,
	            "milk", 1);
	    Map<String, Integer> available = Map.of(
	            "flour", 1200,
	            "sugar", 1200,
	            "eggs", 5);
	    PeteBaker.cakes(recipe, available);
	}
}
