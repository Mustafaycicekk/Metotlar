import java.util.Scanner;

public class main {

	static void toplama(double sayi1, double sayi2) {
		System.out.println("Sonuç: " + (sayi1 + sayi2) + "\n----------------");
	}

	static void cikarma(double sayi1, double sayi2) {
		System.out.println("Sonuç: " + (sayi1 - sayi2) + "\n----------------");
	}

	static void carpma(double sayi1, double sayi2) {
		System.out.println("Sonuç: " + (sayi1 * sayi2) + "\n----------------");
	}

	static void bolme(double sayi1, double sayi2) {
		System.out.println("Sonuç: " + (sayi1 / sayi2) + "\n----------------");
	}

	static void usAlma(double sayi1, double sayi2) {
		double sonuc = 1;
		for (int i = 0; i < sayi2; i++) {
			sonuc = sonuc * sayi1;
		}
		System.out.println("Sonuç: " + sonuc + "\n----------------");
	}

	static void fak(double sayi) {
		double sonuc = 1;
		for (int i = 1; i <= sayi; i++) {
			sonuc = sonuc * i;
		}
		System.out.println("Sonuç: " + sonuc + "\n----------------");
	}

	static void mod(double sayi1, double sayi2) {
		System.out.println("Sonuç: " + (sayi1 % sayi2) + "\n----------------");
	}

	static void dikAlan(double sayi1, double sayi2) {
		System.out.println("Sonuç: " + (sayi1 * sayi2) + "\n----------------");
	}

	static void dikCevre(double sayi1, double sayi2) {
		System.out.println("Sonuç: " + 2 * (sayi1 + sayi2) + "\n----------------");
	}

	public static void main(String[] args) {
		int secim;
		double sayi1;
		double sayi2;

		do {
			System.out.println("\n--------------------" + "\nSeçiminiz: " + "\n1- Toplama" + "\n2- Çıkarma"
					+ "\n3- Çarpma" + "\n4- Bölme" + "\n5- Üs Alma" + "\n6- Faktöriyel Hesaplama" + "\n7- Mod Alma"
					+ "\n8- Dikdörtgen Alanı Bulma" + "\n9- Dikdörtgen Çevresi Bulma" + "\n10- Çıkış Yap"
					+ "\n--------------------");
			Scanner sc = new Scanner(System.in);
			System.out.print("> ");
			secim = sc.nextInt();

			switch (secim) {
			case 1:
				System.out.println("\n--- Toplama İşlemi ---");
				System.out.print("--> ");
				sayi1 = sc.nextDouble();
				System.out.print("--> ");
				sayi2 = sc.nextDouble();
				toplama(sayi1, sayi2);
				break;
			case 2:
				System.out.println("\n--- Çıkarma İşlemi ---");
				System.out.print("--> ");
				sayi1 = sc.nextDouble();
				System.out.print("--> ");
				sayi2 = sc.nextDouble();
				cikarma(sayi1, sayi2);
				break;
			case 3:
				System.out.println("\n--- Çarpma İşlemi ---");
				System.out.print("--> ");
				sayi1 = sc.nextDouble();
				System.out.print("--> ");
				sayi2 = sc.nextDouble();
				carpma(sayi1, sayi2);
				break;
			case 4:
				System.out.println("\n--- Bölme İşlemi ---");
				System.out.print("--> ");
				sayi1 = sc.nextDouble();
				System.out.print("--> ");
				sayi2 = sc.nextDouble();
				bolme(sayi1, sayi2);
				break;
			case 5:
				System.out.println("\n--- Üs Alma İşlemi ---");
				System.out.print("--> ");
				sayi1 = sc.nextDouble();
				System.out.print("--> ");
				sayi2 = sc.nextDouble();
				usAlma(sayi1, sayi2);
			case 6:
				System.out.println("\n--- Faktöriyel İşlemi ---");
				System.out.print("--> ");
				sayi1 = sc.nextDouble();
				fak(sayi1);
				break;
			case 7:
				System.out.println("\n--- Mod Alma İşlemi ---");
				System.out.print("--> ");
				sayi1 = sc.nextDouble();
				System.out.print("--> ");
				sayi2 = sc.nextDouble();
				mod(sayi1, sayi2);
				break;
			case 8:
				System.out.println("\n--- Dikdörtgen Alanı Hesaplama İşlemi ---");
				System.out.print("--> ");
				sayi1 = sc.nextDouble();
				System.out.print("--> ");
				sayi2 = sc.nextDouble();
				dikAlan(sayi1, sayi2);
				break;
			case 9:
				System.out.println("\n--- Dikdörtgen Çevresi Hesaplama İşlemi ---");
				System.out.print("--> ");
				sayi1 = sc.nextDouble();
				System.out.print("--> ");
				sayi2 = sc.nextDouble();
				dikCevre(sayi1, sayi2);
				break;
			case 10:
				System.out.println("\n--- Programdan Çıkış Yapıldı ---");
				break;
			default:
				System.out.println("\n--- Girilen İşlem Geçersiz! ");
			}
		} while (secim != 10);

	}
}