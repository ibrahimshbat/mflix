package mflix;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("Ibrahim");
		test("Ibrahim", "Muhammad");
	}
	
	public static void test(String... word) {
		System.out.println(word.length);

		System.out.println(word);
	}

}
