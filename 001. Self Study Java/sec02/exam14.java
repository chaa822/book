package sec02;

public class exam14 {
	
	public static void main(String[] args) {
		
		int value = 10 + 2 + 8;
		System.out.println("value : " + value);
		
		// 문자열 결합 연산
		// 문자열과 연산을 하면 다른 피연산자로 문자열로 변환되어 문자열 결합이 일어난다
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3);

		String str4 = "10" + (2 + 8);
		System.out.println("str4 : " + str4);
	}
}
