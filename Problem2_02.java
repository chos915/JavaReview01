package expert;

import java.util.Scanner;

public class Problem2_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = 10;
		int x2 = 90;
		int y1 = 20;
		int y2 = 100;
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		boolean z = true;
		
		if(x1 < x3 && x3 < x2) {
			if(y1 < y3 && y3 < y2) {
			System.out.println(z);
			}
			else {
				z = false;
				System.out.println(z);
			}
		}
		else {
			z = false;
			System.out.println(z);
		}
		
	}
}

