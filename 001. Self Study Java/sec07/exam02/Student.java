package sec07.exam02;

public class Student extends People {
	
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		// People 클래스는 기본 생성자가 없고 name과 ssn을 받아 객체를 생성 시키는 생성자만 있으므로
		// Student 생성자에서 People의 생성자를 명시적으로 호출해야 한다.
		super(name, ssn);
		this.studentNo = studentNo;
	}
}