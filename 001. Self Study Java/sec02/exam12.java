package sec02;

public class exam12 {

	public static void main(String[] args) {
		// int 타입보다 허용 범위가 더 큰 long 타입이 피연산자로 사용되면 다른 피연산자는
		// 무조건 long타입
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);
	}
}