import java.util.Scanner;

public class AsallariBul {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Limiti Giriniz : ");
		int sayi = input.nextInt();
		int kontrol = 0; 
		int a = 0;
		System.out.println("Asal Sayilar : ");
		
		for (int i = 2; i <= sayi; i++) {

			for (int j = 2; j < i; j++) { 

				if (i % j == 0) { 
					kontrol = 1; 
				}
			}

			if (kontrol == 0) 
			{  
				System.out.println(i);  
				a++; 

			} else {
				kontrol = 0;
			}
		}
	
		System.out.println("-----------------------------------");
		System.out.println("Toplam " + a + " adet asal sayi bulundu. :) "); // toplam a çýktýda yazýlýyor.
	}
		}
	


