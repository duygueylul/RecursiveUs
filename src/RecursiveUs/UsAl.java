package RecursiveUs;
import java.util.Scanner;

public class UsAl {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Taban Sayısını Giriniz: ");
		int taban = scan.nextInt();
		System.out.println("Üs Sayısını Giriniz: ");
		int üs = scan.nextInt();
		
		System.out.println(UsAl(taban, üs));
		

	}
	
	
	
	public static int UsAl(int x, int y) {
		
		if(y == 0) {
			return 1;
		}
		else {
			return x * UsAl(x, y - 1);
		}
		
	}
	
	
	
	
	
	

}
