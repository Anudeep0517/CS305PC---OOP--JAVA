package Student;

class Student extends Person{
	private String id, name, branch, password;
	Student(String n){
		super(n);     //parent class constructor
		this.name = name;	
	}
	//Getter methods of encapsulation
	public void getId(String id){
		this.id = id;
	}
	public void getName(String branch){
		this.branch = branch;
	}
	public void getPassword(String password){
		this.password = password;
	}
	//Dynamic polymorphism(i.e method overriding)
	//@Override
	public String getDetails(){
		return(id+","+name+","+branch+","+password);
	}
}
