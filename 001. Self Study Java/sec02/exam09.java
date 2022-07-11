package sec02;

public class exam09 {
	
	public static void main(String[] args) {
		//자동 타입 변환
		// 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 저장될 때 발생
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : " + intValue);

		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);

		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);

		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
	}
}