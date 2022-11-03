import java.util.Scanner;
class employeee
{
	String name,phno,address;
	int age,salary;
	employeee(String n, int a, String p, String ad, int s)
	{
		name =n;
		phno = p;
		address = ad;
		age = a;
		salary = s;
	}
	
	void printSalary()
	{
		System.out.println("Salary: "+salary);
	}
}
class Officer extends employeee
{
	String spcl;
	Officer(String n, int a, String p, String ad, int s,String sp)
	{
		super(n,a,p,ad,s);
		spcl = sp;
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
class Manager extends employeee
{
	String dprt;
	Manager(String n, int a, String p, String ad, int s,String dp)
	{
		super(n,a,p,ad,s);
		dprt = dp;
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
public class details {
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
		String of_spcl = in.next();

		System.out.println("\nEnter Manager details\n");
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
		String ma_dprt = in.next();

		Officer of = new Officer(of_name,of_age,of_phno,of_addr,of_sal,of_spcl);
		Manager ma = new Manager(ma_name,ma_age,ma_phno,ma_addr,ma_sal,ma_dprt);
		
		System.out.println("\nOfficer details");
		of.display();
		System.out.println("\nManager details");
		ma.display();
	}
}
