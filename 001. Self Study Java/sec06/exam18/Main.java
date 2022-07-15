package sec06.exam18;

public class Main {
	
	public static void main(String[] args) {
		
		Person p = new Person("123456-1234567", "홍길동");

		System.out.println(p.nation);
		System.out.println(p.ssn);
		System.out.println(p.name);

		//p.nation = "usa";			// error
		//p.ssn = "654321-7654321";	// error
		p.name = "홍삼원";
	}
}