package sec02;

import java.util.*;

public class exam20 {
	
	public static void main(String[] args) throws Exception {
		
		String inputData;
		Scanner scanner = new Scanner(System.in);

		while( true ){
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : \"" + inputData + "\"");

			if( inputData.equals("q") ){
				break;
			}
		}
		scanner.close();
		System.out.println("종료");
	}
}
