import java.util.Scanner;

public class ElektrikliCihazApp {

	static Scanner input = new Scanner(System.in);
	static ElektrikliCihaz[] cihazlarim; 
	static int cihazcount=0;
	
	
	public static void main(String[] args) {


		ElektrikliCihaz tv;
		tv = new ElektrikliCihaz();
		

		 // array açtým tipide elektrikli cihaz tipinde
		cihazlarim = new ElektrikliCihaz[50];
		
		cihazekleOtomatik("Elektronik " , "tv" , "C" , 1200);
		cihazekleOtomatik( "Elektronik " , "tv" , "B" , 1200);
		cihazekleOtomatik("BeyazEsya", "buzdolabi" , "A" , 1200);
	
		
		
		int islem=0;

		while (islem != 4) {

			islem = menu();
			System.out.println("islem " + islem);

			switch (islem) {
			case 1:
				System.out.println("Cihaz Ekleyeceðiz : ");
				
				cihazekle();
			
				break;
			case 2:
				System.out.println("cihaz listele ");
				cihazlistele();
			
				break;
				
			case 3 :
				// System.out.println("bazýlarýný listele ");
				System.out.print("Hangi Cihaz Tipi :");
				input.nextLine();
				String cihaztipi=input.nextLine();
				cihazListeleFiltreli(cihaztipi);
				
				break;
			case 4:
				System.out.println("güle güle ");
				break;

			}
		}

	}
	
	private static void cihazListeleFiltreli(String cihaztipi) {
	
		System.out.println(cihaztipi + " cihaz tipindeki cihazlar ");
		for ( int i=0; i<cihazcount; i++)
		{
			if ( cihazlarim[i].getCihazTipi().equals(cihaztipi))
			System.out.println(i + ". cihaz : " +cihazlarim[i]);
		}
		
		
	}

	private static void cihazlistele() {
		for (int i=0; i<cihazcount; i++)
		{
			System.out.println(i+". cihaz : " +cihazlarim [i]);
			
			
			
		}
	}

	private static void cihazekleOtomatik(String sinif, String cihazTipi, String enerjiSinifi, int guc) {
		ElektrikliCihaz cihaz = new ElektrikliCihaz();
		if (sinif.equals("BeyazEsya"))
			cihaz=new BeyazEsya("beyaz", cihazTipi, enerjiSinifi, guc);
		else // (sinif.equals("Elektronik "))
		cihaz = new Elektronik("hd", 2.6, 16, cihazTipi, enerjiSinifi, guc);
		
	
		cihaz.setCihazTipi(cihazTipi);
		
	
		cihaz.setEnerjiSinifi(enerjiSinifi);
		

		cihaz.setGucWatt(guc);
		
		cihazlarim[cihazcount++] = cihaz;
	
	
	}

	private static void cihazekle() {
		ElektrikliCihaz cihaz = null; 
														 
		input.nextLine();											 
									
		
		
		
		System.out.println("Cihaz Tipi :");
	
		String CihazTipi= input.nextLine();
		
		System.out.println("Enerji Sýnýfý (A, A+ B, B+, C C+) :");
		String EnerjiSinifi=input.nextLine();
		
		System.out.println("Gücü (Watt) :");
		int GucWatt=input.nextInt();
		
		System.out.println("Sinifi : ");
		String sinif = input.next();
		
		if (sinif.equals("BeyazEsya")) {
			System.out.println("Renk");
			String renk =input.next();
			int guc;
			cihaz=new BeyazEsya(renk, CihazTipi, EnerjiSinifi, GucWatt);
		}
		else //if (sinif.equals("Elektronik"))
		{
			System.out.println("EkranBoyutu");
			String ekranBoyutu = input.next();
			
			System.out.println("CPU (GHz) :");
			double cpuGHz = input.nextDouble();
			
			System.out.println("RAM (GB)");
			int ramGB = input.nextInt();
			
			cihaz = new Elektronik(ekranBoyutu, cpuGHz, ramGB, CihazTipi, EnerjiSinifi, GucWatt);
			
			
			
		}
	
		
		
		cihazlarim[cihazcount++] = cihaz; //her yeni nesneyi cihazlarým arayine atýyorum. 
		
	}

	static int menu() {

		System.out.println("1- Cihaz Ekle ");
		System.out.println("2- Listele ");
		System.out.println("3- Filtreli listele ");
		System.out.println("4- Çýkýþ ");
		System.out.println("Seçiminiz : ");
		int secim = input.nextInt();
		return secim;

	}

}

