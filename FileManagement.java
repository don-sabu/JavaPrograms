import java.io.*;
import java.util.Scanner;
public class FileManagement
{
	public static void main(String[] args)throws IOException
	{
		Scanner in = new Scanner(System.in);
		String path = "D:\\Don\\Lab Programs\\Files\\";
		System.out.print("Enter the filename: ");
		String name = in.next();
		path +=name;
		File file = new File(path);
		if(file.createNewFile())
			System.out.println("New File Created: "+file.getName());
		else
			System.out.println("File already exists: "+file.getName());
		FileOutputStream fout = new FileOutputStream(name);
		System.out.print("Enter the number of elements: ");
		int n = in.nextInt();
		System.out.println("Enter the numbers to be written in the file");
		for(int i=0;i<n;i++)
			fout.write(in.nextInt());
		fout.flush();
		fout.close();
		System.out.println("File Written...");
		System.out.println("Reading From File:");
		FileInputStream fin = new FileInputStream(name);
		int i;
		while((i=fin.read())!=-1)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Read from file");
		fin.close();
	}
}