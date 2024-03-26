import java.util.Scanner;
class Employee
{
	int Empid,Salary;
	String Name,Address;
	Employee(int Empid,String Name,String Address,int Salary)
	{
		this.Empid=Empid;
		this.Name=Name;
		this.Address=Address;
		this.Salary=Salary;
	}
	Employee()
	{}
	}
	class Teacher extends Employee
	{
		String Department,Subjects;
		Teacher(int Empid,String Name,String Address,int Salary,String Department,String Subjects){
		super(Empid,Name,Address,Salary);
		this.Department=Department;
		this.Subjects=Subjects;
	}
	Teacher()
	{ 
		super(); 
	} 
	
//function to display all teachers

void displayTeachers(Teacher[] teachers){
String format="%-10s %-20s %-20s %-10s %-20s %-20s";
System.out.format(format,"Empid","Name","Address","Salary","Department","Subjects");
System.out.println();
System.out.format(format,"-----","----","-------","------","----------","--------");
System.out.println();
for(Teacher t: teachers)
{
	System.out.format(format,Empid,t.Name,t.Address,t.Salary,t.Department,t.Subjects);
	System.out.println();
}
}
}

//main class

class Employees
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of Employees:");
	int eCount=sc.nextInt();
	Teacher[] teachers=new Teacher[eCount];
	for(int i=0;i<eCount;i++)
	{
		System.out.println("Enter Empid:");
		int Empid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name:");
		String Name=sc.nextLine();
	
		System.out.println("Enter Address:");
		String Address=sc.nextLine();
	
		System.out.println("Enter Salary:");
		int Salary=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Department:");
		String Dep=sc.nextLine();
		
		System.out.println("Enter Subjects:");
		String Sub=sc.nextLine();
	
		teachers[i]=new Teacher(Empid,Name,Address,Salary,Dep,Sub);
	}
Teacher t1=new Teacher();
t1.displayTeachers(teachers);
}
}

















	
