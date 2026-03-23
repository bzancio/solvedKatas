package VickyRobot;

import java.util.HashSet;
import java.util.Set;

public class Robot {

	Set<String> words;
	
	public Robot() {
		words = new HashSet<>();
		words.add("thank");
		words.add("you");
		words.add("for");
		words.add("teaching");
		words.add("me");
		words.add("already");
		words.add("know");
		words.add("the");
		words.add("word");
		words.add("i");
		words.add("do");
		words.add("not");
		words.add("understand");
		words.add("input");
	}
	
	public String learnWord(String word) {
		if (word.chars().allMatch(Character::isLetter) || !word.isEmpty() || !word.equals(null)) {
			String copy = word.toLowerCase();
			if (!words.contains(copy)) {
				words.add(copy);
				return ("Thank you for teaching me " + word);
			} else return ("I already know the word " + word);
		} else return ("I do not understand the input");
	}
	
	public static void main(String[] args) {
		Robot vicky = new Robot();
		System.out.println(vicky.learnWord("hello"));
		System.out.println(vicky.learnWord("world"));
		System.out.println(vicky.learnWord("goodbye"));
		System.out.println(vicky.learnWord("world"));
		System.out.println(vicky.learnWord("World"));
		System.out.println(vicky.learnWord("ljdsalfd="));
	}
}