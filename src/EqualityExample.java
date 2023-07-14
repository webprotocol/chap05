

public class EqualityExample {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;
		System.out.println(num1==num2);
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 + str2);
//		System.out.println(str1 - str2); // (X)
//		System.out.println(str2 * str2); // (X)
		System.out.println(str1==str2); // 참조비교
		System.out.println(str1.equals(str2));
		
		

	}

}
