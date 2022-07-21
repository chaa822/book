package sec10.exam01;

public class NullPointerException {

	public static void main(String[] args) {
		// 실행예외 > NullPointerException
		String data = null;
		System.out.println(data.toString());//error
	}
}