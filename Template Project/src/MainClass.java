
public class MainClass {

	public static void main(String[] args) {

		String fizz = "Fizz";
		String buzz = "Buzz";
		int loop = 0;
		int test = 0;
		PassStuff a = new PassStuff(fizz, buzz);
		System.out.println(test);

		while (loop <= 2) {
			System.out.println(fizz);
			System.out.println(buzz);
			loop += 1;
		}

		for (int x = 0; x <= 5; x++) {
			
		}

		System.out.println(fizz + " " + buzz);
		System.out.println(a.concatenate());

	}

}
