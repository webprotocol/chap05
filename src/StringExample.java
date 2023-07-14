import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		int num = 10;
		String str1 = "Hello";
		String str2 = "Hello";
		String xxxx = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		str1 = "Hi";
		str2 = "World";
		
		num = 200;
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
		System.out.println(str1.equals(str1));
		
		Scanner scan = new Scanner(System.in);
	}

}
