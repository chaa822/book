package sec09.exam07;

public class Anonymous {
	
	// 익명 자식 객체
	Person field = new Person() {
		
		void work() {
			System.out.println("출근 합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};

	void method1() {
		Person localVar = new Person() {

			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				super.wake();	// 7시에 일어납니다.
				walk();
			}
		};
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}
