import java.util.Scanner;

public class Calculate {
	
	public static void main(String[] arg) {
		System.out.println(" ");
		System.out.println("Calculate starts!!! ");
		int f = Integer.valueOf(arg[0]);
	    int s = Integer.valueOf(arg[1]);
		int summ = f + s;
		System.out.println("Summ is " + summ);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		int t = sc1.nextInt();
		System.out.println("Enter Number2: ");
		int h = sc1.nextInt();
		int dif = t - h;
		System.out.println("Dif is " + dif);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Float Number 1 and 2: ");
		float j = sc2.nextFloat();
		float k = sc2.nextFloat();
		float prs = j*k;
		System.out.println("Proisvedenie is: " + prs);
		
		float del = prs - dif;
		System.out.println("Raznytcya is: " + del);
		
		System.out.println(" ");
		System.out.println("Enter to number : ");
		int ch = sc1.nextInt();
		System.out.println(" ");
		System.out.println("Enter to number stepeni: ");
		int st = sc1.nextInt();
		int m = 1;
		for (int i = 1; i <=st; i++) {
			m = m*ch;
		}
		System.out.println("Stepen is " + m);
		
		
		
		
		
		
	}
	
	
	
}