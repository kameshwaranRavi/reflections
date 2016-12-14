/***KAMESHWARAN R
 * Sorting String
 * 12/02/2016
 */

package com.full.sortingString;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MainController {

	public static LinkedList<String> sortAndSuffle(LinkedList<String> l) {

		Collections.sort(l);

		return l;
	}

	public static void main(String[] args) {

		TestController.test();

	}

}
