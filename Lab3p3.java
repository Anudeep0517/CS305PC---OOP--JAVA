class Lab3p3{
	public static void main(String...args){
		Lab3p3 l = new Lab3p3();
		l.show();l.show(20);l.show("String");l.show(20, "String");
	}
	public void show(){
		System.out.println("Method without parameters");	
	}
	public void show(int x){
			System.out.println("Method with int parameters:" + x);
	}
	public void show(String s){
		System.out.println("Method with String parameters: "+s);
	}
	public void show(int x, String s){
 		System.out.println("Method with two parameters int and String: "+ x +""+s);	
	}
}

