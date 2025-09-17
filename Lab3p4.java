class Lab3p4{
	public static void main(String...args){
		Lab3p4 l = new Lab3p4();
		Lab3p4 l1 = new Lab3p4();
		Lab3p4 l2 = new Lab3p4();
		Lab3p4 l3 = new Lab3p4();
		l.show();l1.show(20);l2.show("String");l3.show(20, "String");
	}	
	Lab3p4(){
		System.out.println("Constructor without parameters");
	}	
	Lab3p4(int x){
		System.out.println("Constructor with 1 parameters");
	}
	Lab3p4(String s){
		System.out.println("Constructor with string parameters");
	}
	Lab3p4(int x, String s){
		System.out.println("Constructor with int and string parameters");
	}
}		
		
		
