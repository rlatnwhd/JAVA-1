/*
 * 작성일 : 2024년, 5월, 10일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 */
class Box2 {
	int width; // 멤버 변수
	int height;
	int depth;
	
	// 생성자
	// 매개 변수의 의미가 정확해짐
	// 객체변수와 매개변수의 이름이 같음 => 문제발생
	public Box2(int width, int height, int depth) {
		// 자신의 변수에 자신의 값을 저장
		// 생성자 메소드 내의 변수로만 취급
		width = width;
		height = height;
		depth = depth;
	}
}
public class thisTest02 {

	public static void main(String[] args) {
		Box2 mybox = new Box2(1, 2, 3);
		System.out.println(mybox.width);
		// 묵시적 0이 출력됨
	}

}
