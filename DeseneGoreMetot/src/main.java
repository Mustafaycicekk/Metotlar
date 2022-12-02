import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, count;
		do {
			count = 0;
			System.out.println("Sayı Giriniz:");
			number = sc.nextInt();
			if (number <= 0) {
				break;
			} else {
				yap(number, false, count);
			}
			System.out.println();
		} while (true);
	}
	static void yap(int a, boolean increase, int count) {
		if(a > 0 && !increase) {
			System.out.print(a + " ");
			yap(a - 5, (a - 5) > 0? false: true, ++count);
		}
		else if(increase && count >= 0) {
			System.out.print(a + " ");
			yap(a + 5, true, (--count));
		}
	}

}
