class Employee{
	String Name,Phone_number,Address;
	int Age;
	double salary;
	void printSalary(){
		System.out.println("The Salary is "+salary);
	}
	void print_info(){
		System.out.println("Name:"+Name+"\nAge:"+Age+"\nphone number:"+Phone_number+"\nAddress:"+Address);
	}
	public static void main(String[] args){
		System.out.println("LA Company Employee list");
		Officer officer1=new Officer("Amal Nath","Mangootil House Kannur","8929745293",18,200003.1,"HR");
		Manager manager1=new Manager("Sam Raj",19,"9873957395",1000000.2,"Rennugeetham House Palakad","Design");
		officer1.print_info();
		officer1.printSalary();
		officer1.printSpec();
		manager1.print_info();
		manager1.printSalary();
		manager1.printDep();
	}
}
class Officer extends Employee{
	String spec;
	Officer(String Name,String Address,String Phone_number,int Age,double salary,String spec){
		this.Name=Name;
		this.Age=Age;
		this.Address=Address;
		this.salary=salary;
		this.Phone_number=Phone_number;
		this.spec=spec;
	}
	void printSpec(){
		System.out.println("The Specialization of ofiicer is "+spec);
	}
}
class Manager extends Employee{
	String Dep;
	Manager(String Name,int Age,String Phone_number,double salary,String Address,String Dep){
		this.Name=Name;
		this.Age=Age;
		this.Address=Address;
		this.salary=salary;
		this.Phone_number=Phone_number;
		this.Dep=Dep;
	}
	void printDep(){
		System.out.println("The Department of manager is "+Dep);
	}
}
