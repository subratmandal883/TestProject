package printClass;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileWriterPrintWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw=new FileWriter("fileWriter.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.print("my name is subrat mandal, this is my first printWriter and fileWriter file.");
		pw.close();
		fw.close();
		System.out.println("task is completed");
		
			
		
	}

}
