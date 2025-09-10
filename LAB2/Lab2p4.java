import java.util.Scanner;
class Lab2p4{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		String op = s.next();
		System.out.println((a&b)+ ","+(a|b)+","+(a^b));
	} 
}
