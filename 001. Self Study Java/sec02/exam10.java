package sec02;

public class exam10 {
	
	public static void main(String[] args) {
		//강제 타입변환
		// 값의 허용 범위가 큰 타입을 허용 범위가 작은 타입으로 쪼개서 저장
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);

		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);

		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}
