package sec08.exam11;

public class Main {
	
	public static void main(String[] args) {
		
		ImplementationC implementationC = new ImplementationC();

		InterfaceA interfaceA = implementationC;
		interfaceA.methodA();
		//interfaceA.methodB();	//error
		//interfaceA.methodC();	//error
		System.out.println();
		
		InterfaceB interfaceB = implementationC;
		//interfaceB.methodA();	//error
		interfaceB.methodB();
		//interfaceB.methodC();	//error
		System.out.println();

		InterfaceC interfaceC = implementationC;
		interfaceC.methodA();
		interfaceC.methodB();
		interfaceC.methodC();
	}
}
