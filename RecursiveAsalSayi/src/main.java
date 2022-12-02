import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int deger;
		do {
			System.out.print("Pozitif Bir Değer Giriniz: ");
			deger = sc.nextInt();

		} while (deger <= 0);
		if (asalMi(deger, 2)) {
			System.out.println(deger + " Asal Sayıdır");
		} else {
			System.out.println(deger + " Asal Sayı Değildir");
		}
	}

	static boolean asalMi(int a, int b) {
		if (a == b) {
			return true;
		} else if (a % b == 0) {
			return false;
		} else {
			return asalMi(a, b + 1);
		}
	}
}
