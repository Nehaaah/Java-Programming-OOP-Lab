import java.util.Scanner;
class Employee{
	int empId;
	String name;
	double salary;
	String address;

	Employee(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the empId:");
		empId=sc.nextInt();
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the salary:");
		salary=sc.nextInt();
		System.out.println("Enter the address:");
		address=sc.next();
	}
	
}
class Teacher extends Employee{
	String department;
	String subject;

	Teacher(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the department:");
		department=sc.next();
		System.out.println("Enter the subject taught:");
		subject=sc.next();
		System.out.println();
		}
	void display(){
			System.out.println("empId:"+empId);
			System.out.println("name:"+name);
			System.out.println("salary:"+salary);
			System.out.println("address:"+address);
			System.out.println("department:"+department);
			System.out.println("subject:"+subject);
			System.out.println();
		}
	
}
class Inheritance{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of teachers:");
		int n=sc.nextInt();
		Teacher[] teacher=new Teacher[n];
		for(int i=0;i<n;i++)
		teacher[i]=new Teacher();
		System.out.println("Details of teachers");
		for(int i=0;i<n;i++){
			System.out.println();
			teacher[i].display();
		}
	
	}
}
