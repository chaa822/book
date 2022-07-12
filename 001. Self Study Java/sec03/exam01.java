package sec03;

public class exam01 {
	
	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);

		byte b = 100;
		// byte result3 = -b;  //리터럴이 아닌 변수를 연산 시 int로 타입이 변경되므로 error
		int result3 = -b;
		System.out.println("resul3 = " + result3);
	}
}
