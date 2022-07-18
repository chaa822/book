package sec07.exam12;

public class Main {
	
	public static void main(String[] args) {
		
		// 자동 타입 변환
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		//error
		//parent.filed2 = "data2";
		//parent.method3();

		// 강제 타입 변환
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
	}
}