/*
 * 작성일 : 2024년, 5월, 28일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 */

class Car {
	String name; // 멤버 변수
	String color;
	int speed;
	
	public Car(String name) { // 매개 변수가 1개인 생성자
		this.name = name; // this로 이름이 같은 매개변수와 멤버변수를 구분
		System.out.println(CarPrint()); // 반환값 출력
	}
	
	public Car(String name , String color) { // 매개 변수가 2개인 생성자
		this.name = name;
		this.color = color;
		System.out.println(CarPrint());
	}
	
	public Car(String name , String color, int speed) { // 매개 변수가 3개인 생성자
		this.name = name;
		this.color = color;
		this.speed = speed;
		System.out.println(CarPrint()); 
	}
	
	public String CarPrint() { // 멤버 변수를 출력하는 메소드
		return "\n차량 이름 : " + name + "\n색깔 : " + color + "\n속도 : " + speed;
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car("제네시스", "검정", 240); // 해당 값을 가진 인스턴스 생성
		car = new Car("BMW", "빨강", 200);
	}

}
