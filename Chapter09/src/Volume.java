/*
 * 작성일 : 2024년, 5월, 10일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 */
import java.util.Scanner;

class Box {
	int width; // 멤버 변수 - 객체 변수
	int height; // 클래스 전역에서 사용 가능
	int depth;
	
	// 생성자, 매개 변수가 3개인 생성자
	// 3개의 값을 전달 받아 각 변수에 저장
	// 생성자 Overloading(오버로딩)
	public Box(int w, int h, int d) { // 명시적인 생성자(매개변수 O)
		width = w; // 매개 변수 값을 객체 변수에 저장
		height = h;
		depth = d;
	}
	
	// 생성자 Overloading(오버로딩) - 같은 이름의 생성자가 여려 개 있음
	public Box() { // 묵시적인 생성자(매개변수 X)
		width = 10;
		height = 20;
		depth = 30;
	}
}
public class Volume {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("가로 길이 입력 : ");
		int w = stdIn.nextInt();
		System.out.print("높이 길이 입력 : ");
		int h = stdIn.nextInt();
		System.out.print("깊이 길이 입력 : ");
		int d = stdIn.nextInt();
		
		// 매개 변수가 3개인 생성자 호출
		// 생성자가 있는 클래스로 부터 객체를 생성하는 경우는
		// 반드시 생성자의 매개변수 형과 개수가 일치해야 함
		Box mybox1 = new Box(w, h, d);
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("입력 받은 값의 박스 부피 : " + vol);
		
		// 매개 변수가 없는 생성자 호출
		Box mybox2 = new Box();
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("정해진 값의 박스 부피 : " + vol);
	}

}
