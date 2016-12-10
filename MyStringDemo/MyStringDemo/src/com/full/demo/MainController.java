package com.full.demo;

import static java.lang.System.out;

import java.util.Scanner;

import com.full.util.*;

/**
 * 
 * @author Kameshwaran R
 * @category Assignment #1 - MyString Demo
 *
 */
public class MainController {

	public static void main(String args[]) {
		Democlass d = new Democlass();
		System.out.println("enter the string");
		Scanner s = new Scanner(System.in);
		String obj = s.nextLine();
		System.out.println("the reverse string is  " + d.reverse(obj));
		System.out.println("the no of volwes are  " + d.getVowelsCount(obj));
		System.out.println("the no of consonants are  " + d.getConsonantCount(obj));
		System.out.println("the no of capital letters are  " + d.getNumCapitalLetters(obj));
		System.out.println("the length of the string is   " + d.getLength(obj));
		System.out.println("the sum of the string is   " + d.getSumOfAllCharacters(obj));

	}
}