package sec09.exam04;

public class Outter {
	
	public void method1(final int arg){
		final int localVariable = 1;
		//arg = 1;
		//localVariable = 100;

		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

	public void method2(int arg){
		int localVariable = 1;
		//arg = 1;
		//localVariable = 100;

		class Inner {
			public void method() {
				int result = arg + localVariable;	// final 취급
			}
		}
	}
}