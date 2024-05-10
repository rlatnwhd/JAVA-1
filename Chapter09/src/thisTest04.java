/*
 * 작성일 : 2024년, 5월, 10일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 */
class Box4 {
	int width; // 멤버 변수
	int height;
	int depth;
	
	public Box4() {
		// this의 다른 의미는 다른 생성자를 호출
		// 반드시 첫 번째 라인에 위치해야 함
		this(1, 1, 1);
		System.out.println("매개 변수가 없는 생성자 수행");
	}
	
	public Box4(int width, int height, int depth) {
		System.out.println("매개 변수 3개 생성자 수행");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
public class thisTest04 {

	public static void main(String[] args) {
		Box4 mybox1 = new Box4();
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개 변수 없음) : " + vol);
		
		mybox1 = new Box4(10, 20, 30);
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개 변수 3개) : " + vol);
	}

}
