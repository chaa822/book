package sec07.exam09;

public class Main {
	
	public static void main(String[] args) {
		
		Child child = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3();	// error
	}
}
