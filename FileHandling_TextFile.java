import java.io.*;
public class FileHandling_TextFile
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		String path = "D:\\Don\\Lab Programs\\Files\\";
		System.out.print("Enter the filename: ");
		String name = in.readLine();
		File file1 = new File(path+name);
		if(file1.createNewFile())
			System.out.println("New File Created: "+file1.getName());
		else
			System.out.println("File already exists: "+file1.getName());
		FileOutputStream fout1 = new FileOutputStream(file1);
		System.out.println("Enter a string to add into file");
		String s = in.readLine();
		byte[] barray = s.getBytes();
		fout1.write(barray);
		fout1.flush();
		fout1.close();
		System.out.println("File Written...\n");
		System.out.println("Reading From File:");
		FileInputStream fin1 = new FileInputStream(file1);
		int i;
		while((i=fin1.read())!=-1)
			System.out.print((char)i);
		System.out.println();
		System.out.println("File Read...");
		fin1.close();
		System.out.print("Enter the filename of new file: ");
		name = in.readLine();
		File file2 = new File(path+name);
		if(file1.createNewFile())
			System.out.println("New File Created: "+file2.getName());
		else
			System.out.println("File already exists: "+file2.getName());
		FileInputStream fin2 = new FileInputStream(file1);
		FileOutputStream fout2 = new FileOutputStream(file2);
		barray = fin2.readAllBytes();
		fout2.write(barray);
		System.out.println("Wrote to second file.");
		fout2.flush();
		fout2.close();
		fin2.close();
	}
}
