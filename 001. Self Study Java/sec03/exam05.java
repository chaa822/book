package sec03;

public class exam05 {
	
	public static void main(String[] args) {
		char c1 = 'A' + 1;  //66
		char c2 = 'A' + 2;
		// char c3 = c2 + 1;	// error: 리터럴이 아닌 변수가 연산되었으므로 c2가 int로 변경되어 연산 결과는 int
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		// System.out.println("c3 : " + c3);
	}
}
