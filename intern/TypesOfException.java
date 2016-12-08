package intern;

import java.util.ArrayList;

public class TypesOfException {
	public void arithmetic() {
		int a = 0, b = 5, c;
		try {
			c = b / a;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

	public void arrayIndexOutOfBound() {
		int[] a = new int[2];
		try {
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);

		}
	}

	public void indexOutOfBound() {
		ArrayList<Character> a = new ArrayList<Character>();
		try {
			a.add('a');
			a.add('b');
			a.remove('a');
			System.out.println(a);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

	public void negativeArraySize() {
		try {
			int[] a = new int[-2];

			a[0] = 1;
		} catch (NegativeArraySizeException e) {
			System.out.println(e);
		}
	}

	public void stringIndexOutOfBound() {
		String s = "this is exception";
		try {
			s.charAt(50);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		TypesOfException err = new TypesOfException();
		err.arithmetic();
		err.arrayIndexOutOfBound();
		err.indexOutOfBound();
		err.negativeArraySize();
		err.stringIndexOutOfBound();

	}

}
