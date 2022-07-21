package sec10.exam05;

public class ClassCastException {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		
		// if문이 없을 경우 ClassCastException 발생
		//Dog dog = (Dog) animal;
		
		if( animal instanceof Dog ){
			Dog dog = (Dog) animal;
			System.out.println("변환 성공");
		}else{
			System.out.println("변환 실패");
		}
	}
}
