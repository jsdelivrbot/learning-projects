package examples;

public class ArrayInit {
	public static void main(String args[]) {
		int evens[] = new int[5];
		evens[0] = 0;
		evens[1] = 2;
		evens[2] = 4;
		evens[3] = 6;
		evens[4] = 8;

		int odds[] = { 1, 3, 5, 7, 9 };

		for (int i = 0; i < evens.length; i =i+1) {
			System.out.println(evens[i]);
			System.out.println(odds[i]);
		}
	}
}
