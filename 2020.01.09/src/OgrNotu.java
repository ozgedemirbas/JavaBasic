
import java.util.Scanner;
import java.math.*;

public class OgrNotu {
	static int j = 0;
	static int i;
	static int sayi;
	static int sum;
	static int ort;
	static String[] ad;
	static String[] soyad;
	static int[] not;
	static int max;
	static int ortustog;

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);

		System.out.print("Kaç öðrenci için istatistik hesaplanacak :");
		sayi = input.nextInt();

		ad = new String[sayi];
		soyad = new String[sayi];
		not = new int[sayi];

		for (i = 0; i < sayi; i++) {
			System.out.print("Öðrenci Adi Soyadý Notu Giriniz : ");

			ad[i] = input.next();
			soyad[i] = input.next();
			not[i] = input.nextInt();

		}
		toplam();
		ortalama();
		max();
		min();
		ortustog();
		ortaltog();
	}

	public static int toplam()

	{
		sum = 0;
		for (int x = 0; x < not.length; x++) {
			sum += not[x];

		}
		System.out.println("Toplam :" + sum);
		return sum;
	}

	public static int ortalama() {
		ort = sum / not.length;
		System.out.println("Ortalama :" + ort);
		return ort;

	}

	public static void min()
	{
		int kucuk = 100;
		String ad2 = "";
		String soyad2="";
		for (i = 0; i < not.length; i++) {
			if (kucuk > not[i]) {

				kucuk = not[i];
				ad2=ad[i];
				soyad2=soyad[i];	
			}
		}
		System.out.println("MÝNÝMUM " + ad2 + " " + soyad2 + " " + kucuk);
		
	}
	
	public static void ortustog()
	{
		
		ort = sum / not.length;
		System.out.println("Ortalamam Üstü Öðrenciler :");
		for(i=0; i<not.length; i++)
		{
			if (not [i] > ort)
			{
				System.out.println( ad[i] + " " + soyad[i] + " " + not[i]);
			}
			
			
		}
		
	}

	public static void max() {

		int buyuk = 0;
		String ad1 = "";
		String soyad1="";
		for (i = 0; i < not.length; i++) {
			if (buyuk < not[i]) {

				buyuk = not[i];
				ad1=ad[i];
				soyad1=soyad[i];
			
			}

		}
		System.out.println("MAXÝMUM " + ad1 + " " + soyad1 + " " + buyuk);
		/*
		 * for (i=0; i<sayi; i++) {
		 * 
		 * System.out.println(ad[i] + soyad[i] + not[i]); }
		 * 
		 */
	}
	
	public static void ortaltog() 
	{
		ort = sum / not.length;
		System.out.println("Ortalamam Altý Öðrenciler :");
		for(i=0; i<not.length; i++)
		{
	
	if (not [i] < ort)
			{
				System.out.println( ad[i] + " " + soyad[i] + " " + not[i]);
			}
			
			
		}
		
	}
	
	
	
}
