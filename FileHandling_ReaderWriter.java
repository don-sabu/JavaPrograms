import java.io.*;
public class FileHandling_ReaderWriter
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		String path = "D:\\Don\\Lab Programs\\Files\\";
		System.out.print("Enter the filename: ");
		String name = in.readLine();
		path +=name;
		File file = new File(path);
		if(file.createNewFile())
			System.out.println("New File Created: "+file.getName());
		else
			System.out.println("File already exists: "+file.getName());
		FileWriter fw = new FileWriter(name);
		System.out.println("Enter a string to add into file");
		String s = in.readLine();
		fw.write(s);
		fw.flush();
		fw.close();
		System.out.println("File Written...");
		System.out.println("Reading From File:");
		FileReader fr = new FileReader(name);
		char[] ch = new char[50];
		fr.read(ch);
		System.out.println(ch);
		System.out.println("File Read...");
		fr.close();
	}
}
