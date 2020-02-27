import java.util.Scanner;

public class MainClass {

	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		String fizz = "";
		String buzz = "";
		int loop = 0;
		
		System.out.print("Enter line 1: ");
		fizz = sc.nextLine();
		
		System.out.print("Enter line 2: ");
		buzz = sc.nextLine();
		
		PassStuff a = new PassStuff(fizz, buzz);
		
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
