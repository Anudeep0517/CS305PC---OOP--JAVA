import java.util.Scanner;
class Lab2p1{
	public static void main(String...args){
	        System.out.println("Enter the value");
	        Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String op = s.next();
		switch(op){
			
			case "++":
				  System.out.println("Post: "+(a++));
				  System.out.println("Pre:"+(++a));
				  break;
			case "--":
				  System.out.println("Post: "+(a--));
				  System.out.println("Pre: "+(--a));
				  break;
			case "+":
				  a =+a;
				  System.out.println("Unary +:"+(a));
				  break;
			case "-": 
			  	  a =-a;
				  System.out.println("Unary +:"+(a));
				  break;	  
		}
		
	}
}
