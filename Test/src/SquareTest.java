/*
 * 작성일 : 2024년, 6월, 4일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : Rectangle 클래스를 작성하고 이를 상속받는 Square 클래스를 작성하세요.
 * 		 Rectangle 클래스에는 double width와 double height 속성을 추가하고,이를 설정하는 생성자를 작성합니다.
 * 		 Square 클래스는 Rectangle 클래스를 상속받고. 변의 길이를 설정하는 생성자를 작성합니다.
 *  	 Square 클래스에 면적과 둘레를 계산하는 메소드를 추가합니다.
 * 		 사용자로부터 직사각형의 변의 길이를 입력받아, 해당 직사각형의 정보를 출력하는 프로그램을 작성하세요.
 */

import java.util.Scanner;

class Rectangle {
	public double width;
	public double height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
}

class Square extends Rectangle {
	public Square(double side1, double side2) {
		super(side1, side2);
		Area();
	}
	
	public void Area() {
		System.out.println("\n사각형의 넓이 : " + (width * height));
		System.out.println("사각형의 둘레 : " + (width * 2 + height * 2));
	}
}

public class SquareTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("도형의 길이를 입력하세요(입력 종료는 enter) : ");
		double side1 = stdIn.nextDouble();
		double side2 = stdIn.nextDouble();
		
		Square sq = new Square(side1, side2);
	}

}
