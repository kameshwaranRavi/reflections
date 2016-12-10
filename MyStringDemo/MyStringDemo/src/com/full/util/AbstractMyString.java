package com.full.util;

import static java.lang.System.out;

/**
 * 
 * @author James Mortensen
 * @category Assignment #1 - MyString Demo
 *
 */
public abstract class AbstractMyString {

	protected String theString = "";

	public AbstractMyString() {
	}

	public AbstractMyString(String a) {
		theString = a;
	}

	@Override
	public String toString() {
		return theString;
	}

	/*
	 * Reverses the string and stores the reversed result, and it returns the
	 * reversed string.
	 */
	public abstract String reverse(String s);

	/*
	 * Get the number of vowels in the String and return the count.
	 */
	public abstract int getVowelsCount(String s);

	/*
	 * Get the number of consonants in the String and return the count.
	 */
	public abstract int getConsonantCount(String s);

	/*
	 * Get the number of Capital Letters in the string and return the count.
	 */
	public abstract int getNumCapitalLetters(String s);

	/*
	 * Get and return the length of the string.
	 */
	public abstract int getLength(String s);

	/*
	 * Counts the sum of all the letters where the value of each letter is based
	 * on its position in the alphabet. For instance, a=1, b=2, h=8, and z=26.
	 * Thus, the string "hello" would sum to 8+5+12+12+15 = 52
	 */
	public abstract int getSumOfAllCharacters(String s);

}
