/*
 * 작성일 : 2024년, 5월, 10일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 */
class Box1 {
	int width; // 멤버 변수
	int height;
	int depth;
	
	// 생성자
	// 매개 변수로 지정된 w, h, d 는 의미를 알기 어려움
	public Box1(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
}
public class thisTest01 {

	public static void main(String[] args) {
		Box1 mybox = new Box1(1, 2, 3);
		System.out.println(mybox.width);
	}

}

