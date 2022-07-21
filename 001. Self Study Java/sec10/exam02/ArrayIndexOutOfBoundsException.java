package sec10.exam02;

public class ArrayIndexOutOfBoundsException {
	
	public static void main(String[] args) {
		// 실행예외 > ArrayIndexOutOfBoundsException
		String data1 = args[0];	//error
		String data2 = args[1];
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
	}
}
