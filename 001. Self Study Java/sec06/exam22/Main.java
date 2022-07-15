package sec06.exam22;

import sec06.exam22.package1.A;

public class Main {

	public static void main(String[] args) {
		
		A a1 = new A(true);
		//A a2 = new A(1);			// error -> default는 다른 패키지에서는 사용 불가
		//A a3 = new A("문자열");	// erorr -> private도 사용 불가
	}
}