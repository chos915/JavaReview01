package expert;

import java.util.Scanner;

public class Problem1_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean d = true;
		
		if(a > b) {
			if(a > c && c > b) {
				System.out.println(d);
			}
			else {
				d = false;
				System.out.println(d);
			}
		}
		else if (a < b) {
			if(a < c && c < b) {
				System.out.println(d);
			}
			else {
				d = false;
				System.out.println(d);
			}
		}
		else 
			System.out.println("a와 b는 같습니다.");		
	}
}
