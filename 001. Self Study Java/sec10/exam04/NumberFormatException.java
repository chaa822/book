package sec10.exam04;

public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";

		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);	//error

		System.out.println(data1 + " + " + data2 + " = " + (value1 + value2));
	}
}