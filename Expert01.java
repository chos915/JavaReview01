package expert;

// 클래스 선언
public class Expert01 {
	
	// 메소드 선언
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a :" + a);
		{ 
			int b = 20;
			System.out.println("a2 :" + a);
		}
//		System.out.println("b :" + b);
		{
//			int a = 30; // 맨 위에서 int a = 10;으로 선언하였으므로 에러 발생
			int b = 50; // 위에서 {}밖에서 int b = 50;으로 선언하였으므로 변수 선언이 가능하다.
		}
		System.out.println("Hello World!");

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "="+(i*j));
			}
		
		}
		
	}

}
