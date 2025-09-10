import java.util.Scanner;
class Lab2p2{
	public static void main(String...args){
		System.out.println("Enter the value");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = x;
		System.out.println("Output is:"+ x++ + ++x);
		x = y;
		System.out.println("Output is:"+ (x++ + ++x));
		x = y;
		System.out.println(x++ + ++x +"Output is:");
	}
}
