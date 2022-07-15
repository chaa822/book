package sec06.exam20;

import sec06.exam20.hankook.*;
import sec06.exam20.kumho.*;
import sec06.exam20.hyundai.*;

public class Main {
	
	public static void main(String[] args) {
		
		Engine engine = new Engine();
		SnowTire tire1 = new SnowTire();
		BigWidthTire tire2 = new BigWidthTire();

		// Tire 클래스는 hankuk과 kumho 모두에 있기 때문에 패키지를 같이 기술해야 한다.
		sec06.exam20.hankook.Tire tire3 = new sec06.exam20.hankook.Tire();
		sec06.exam20.kumho.Tire tire4 = new sec06.exam20.kumho.Tire();
	}
}