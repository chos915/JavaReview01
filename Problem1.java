package expert;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean c = true;
		
		if(a > b) 
			c = true;
		else if(a < b)
			c = false;
		
		System.out.print(a + ">"+ b +"의 결과는"+ c + "입니다.");
	}
}
