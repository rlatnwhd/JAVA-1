/*
 * 작성일 : 2024년, 5월, 10일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 */
class Box3 {
	int width; // 멤버 변수
	int height;
	int depth;
	
	// 생성자
	// 매개 변수의 의미가 정확해짐
	public Box3(int width, int height, int depth) {
		// this 는 현재 객체 변수를 의미
		// 객체 변수 width 에 매개변수 width 값을 저장
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
public class thisTest03 {

	public static void main(String[] args) {
		Box3 mybox = new Box3(1, 2, 3);
		System.out.println(mybox.width);
	}

}
