import java.io.*;
class FileWriterDemo1
{
	public static void main (String[] args) throws IOException
	{
		PrintWriter pw = new PrintWriter("file3.txt");
		BufferedReader br = new BufferedReader(new FileReader("File1.txt"));
		String line = br.readLine();
		while(line !=null)
		{
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}
}