import java.util.Scanner;

public class ObebOkekHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int obeb = 1;
		int okek = 1;

		System.out.print("OBEB/OKEK hesaplanacak iki sayý girin : ");
		int deger1 = input.nextInt();
		int deger2 = input.nextInt();
		System.out.print(deger1 + "\t" + deger2 + "\t" + "|" + "\t");
		
		for (int i = 2; i <= deger1 || i <= deger2;) {
			if (deger1 % i == 0 || deger2 % i == 0) {
				System.out.print(i);
				okek =okek* i;
				if (deger1 % i == 0 && deger2 % i == 0) {
					System.out.println("*");
					obeb = obeb* i;
					
				} else
					System.out.println("");

				if (deger1 % i == 0) 
					deger1 = deger1 / i;
					System.out.print(deger1 + "\t");
				
				if (deger2 % i == 0) 
					deger2 = deger2 / i;
					System.out.print(deger2 + "\t" + "|" + "\t");
					
			}
			if (deger1 % i != 0 && deger2 % i != 0)
				i++;

		}
		System.out.println("");
		System.out.println("OBEB : " +obeb);
		System.out.println("OKEK : " +okek);
	}

	}
	
