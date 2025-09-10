import java.util.Scanner;
class Lab2p5{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int count = 0;
		
		int i = 2;
		while(i<a){
	 		if(i%1==0)
	 		System.out.println("Number is not prime");
	 		else 
	 		System.out.println("prime");
		}
	}
}
