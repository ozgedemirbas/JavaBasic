import java.util.Scanner;

public class TopCikBolCarp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String islem;
		int x, y;
		int sonuc = 0;
		Scanner input = new Scanner(System.in);

		// System.out.print("x ve y de�erlerini giriniz : ");

		System.out.println("i�lemi giriniz :");
		x = input.nextInt();

		islem = input.next();

		y = input.nextInt();

				
	if (islem.equals("+"))
	{
		sonuc=x+y; 
	}
	else if (islem.equals("-"))
	{
		sonuc = x-y; 
	}
	
	else if (islem.equals("*"))
	{
		sonuc=x*y;
	}
	else if (islem.equals("/"))
	{
		sonuc=x/y;
	}
	else 
		System.out.println("ge�ersiz giri�.. ");
	
	
	System.out.println(x + " " + islem + " " + y + " "  + "=" +  " " + sonuc );
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
