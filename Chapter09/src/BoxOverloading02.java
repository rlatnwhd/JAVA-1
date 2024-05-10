/*
 * 작성일 : 2024년, 5월, 10일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 */
class Box6 {
	int width;
	int height;
	int depth;
	
	double dwidth;
	double dheight;
	double ddepth;
	
	// 정수형 매개 변수가 3개인 생성자
	public Box6(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// 실수형 매개 변수가 3개인 생성자
	public Box6(double w, double h, double d) {
		dwidth = w;
		dheight = h;
		ddepth = d;
	}
}
public class BoxOverloading02 {

	public static void main(String[] args) {
		// 정수형 매개변수가 3개인 생성자 호출 -> 없음
		Box6 mybox = new Box6(10, 20, 30);
		int vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("박스의 부피(정수 매개 변수) : " + vol);
		
		// 실수형 매개변수가 3개인 생성자 호출 -> 없음
		mybox = new Box6(10.5, 20.5, 30.5);
		double dvol = mybox.dwidth * mybox.dheight * mybox.ddepth;
		System.out.println("박스의 부피(실수 매개 변수) : " + dvol);
		
		// 정수형, 실수형 매개변수가 3개인 생성자 호출 -> 없음
		// 혼합되어 있는 경우 자동으로 자료형의 확대형으로 변환되어 수행
		mybox = new Box6(10, 20, 30.5);
		dvol = mybox.dwidth * mybox.dheight * mybox.ddepth;
		System.out.println("박스의 부피(실수 매개 변수) : " + dvol);

	}

}
