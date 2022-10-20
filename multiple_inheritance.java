import java.util.Scanner;
class Employee
{
	String name,phno,address;
	int age,salary;
	void printSalary()
	{
		System.out.println("Salary: "+salary);
	}
}
class Officer extends Employee
{
	String spcl;
	Manager(String n, int a, String p, Sring ad, int s,string s)
	{
		name =n;
		phno = p;
		address = ad;
		age = a;
		salary = s;
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phno);
		System.out.println("Address: "+address);
		super.printSalary();
		System.out.println("Specialisation: "+spcl);
	}
}
class Manager extends Employee
{
	String dprt;
	Manager(String n, int a, String p, Sring ad, int s,string d)
	{
		name =n;
		phno = p;
		address = ad;
		age = a;
		salary = s;
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phno);
		System.out.println("Address: "+address);
		super.printSalary();
		System.out.println("Department: "+dprt);
	}
}
public class multiple_inheritance
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Officer details\n");
		System.out.print("Enter name: ");
		String of_name = in.next();
		System.out.print("Enter age: ");
		int of_age = in.nextInt();
		System.out.print("Enter phone number: ");
		String of_phno = in.next();
		System.out.print("Enter address: ");
		String of_addr = in.next();
		System.out.print("Enter salary: ");
		int of_sal = in.nextInt();
		System.out.print("Enter specialization: ");
		String of_spcl = in.nextLine();
		
		
		
		System.out.println("\nEnter Officer details\n");
		System.out.print("Enter name: ");
		String ma_name = in.next();
		System.out.print("Enter age: ");
		int ma_age = in.nextInt();
		System.out.print("Enter phone number: ");
		String ma_phno = in.next();
		System.out.print("Enter address: ");
		String ma_addr = in.next();
		System.out.print("Enter salary: ");
		int ma_sal = in.nextInt();
		System.out.print("Enter Department: ");
		String ma_dprt = in.nextLine();
		
		Officer of = new Officer(of_name,of_age,of_phno,of_addr,of_sal,of_spcl);
		Manager ma = new Manager(ma_name,ma_age,ma_phno,ma_addr,ma_sal,ma_dprt)
	}
}