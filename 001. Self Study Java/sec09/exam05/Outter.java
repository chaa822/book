package sec09.exam05;

public class Outter {
	
	String field = "Outter-field";

	void method() {
		System.out.println("Outter-method");
	}

	class Nested {
		String field = "Nested-field";

		void method() {
			System.out.println("Nested-Method");
		}

		void print() {
			// 내부 -> Nested
			System.out.println(this.field);
			this.method();

			// 외부 -> Outter
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
