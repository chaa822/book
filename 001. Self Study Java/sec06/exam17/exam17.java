package sec06.exam17;

public class exam17 {
	
	public static void main(String[] args) {
		// 싱글톤

		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		if( singleton1 == singleton2 ) {
			System.out.println("같은 Singleton 객체입니다.");
		}else{
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
