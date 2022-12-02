import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Taban Sayısını Giriniz: ");
		int a = sc.nextInt();
		System.out.print("Üs Sayısını Giriniz: ");
		int b = sc.nextInt();
		int sonuc = 1;
		System.out.println("Sonuç: " + hesaplama(a, b, sonuc));
	
	}

	static int hesaplama(int a, int b, int sonuc) {
		if (b == 0 && sonuc == 1) {
			return 1;
		}
		sonuc = sonuc * a;
		b = b - 1;
		if(b > 0) {
			return hesaplama(a, b, sonuc);
		}else {
			return sonuc;
		}
	}
}
