/***KAMESHWARAN R
 * Sorting String
 * 12/02/2016
 */

package com.full.sortingString;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestController {

	public static void test() {
		// TODO Auto-generated method stub
		LinkedList<String> testCaseOne = new LinkedList<String>();
		testCaseOne.add("Zoho");
		testCaseOne.add("Full");
		testCaseOne.add("Bhasker");
		testCaseOne.add("Kamesh");
		testCaseOne.add("Yoco");

		Collections.shuffle(testCaseOne);

		LinkedList<String> ResultOne = MainController.sortAndSuffle(testCaseOne);
		System.out.println("Excepted Result=[Bhasker,Full,Kamesh,Yoco,Zoho]");
		System.out.println("Actual Result=" + ResultOne);
		System.out.println();
		System.out.println();

		LinkedList<String> testCaseTwo = new LinkedList<String>();
		testCaseTwo.add("Arun");
		testCaseTwo.add("Yolo");
		testCaseTwo.add("Tea");
		testCaseTwo.add("Query");
		testCaseTwo.add("Coffee");

		Collections.shuffle(testCaseTwo);

		LinkedList<String> ResultTwo = MainController.sortAndSuffle(testCaseTwo);
		System.out.println("Excepted Result=[Arun,Coffee,Query,Tea,Yolo]");
		System.out.println("Actual Result=" + ResultTwo);
		System.out.println();
		System.out.println();

		LinkedList<String> testCaseThree = new LinkedList<String>();
		testCaseThree.add("Java");
		testCaseThree.add("Html");
		testCaseThree.add("DOM");
		testCaseThree.add("Request");
		testCaseThree.add("Website");

		Collections.shuffle(testCaseThree);

		LinkedList<String> ResultThree = MainController.sortAndSuffle(testCaseThree);
		System.out.println("Excepted Result=[DOM,Html,Java,Request,Website]");
		System.out.println("Actual Result=" + ResultThree);

	}

}
