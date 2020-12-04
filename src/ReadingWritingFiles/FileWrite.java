package ReadingWritingFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
	/*
	 * Stream - process sequence from which you can read or write
	 * - channel through which bytes flows from a program to destination file and vice versa
	 * 
	 * 2 types
	 * 1. Input Stream - read characters from file
	 * 2. Output Stream - read characters to file
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\ezhil\\Desktop\\FrontEndNanodegree\\Udemy - Selenium\\FileOperations\\writeFile.txt");
		FileWriter fw1 = new FileWriter(file); //creates new file everytime doesnt append
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		// CAN WRITE USING BW TOO bw.write() and bw.newLine()
		PrintWriter pr = new PrintWriter(bw);
		pr.println("hello");
		//for csv -> "hello,"
		//for normal files as we wish,
		//for html files -> "<html><body><h2>HI</h2></body></html>"
		pr.println("how are you");
		pr.close(); //sufficient to close last opened stream , following lines of code is not mandatory
		// closing the last opened stream automatically closes any linked streams.
		bw.close();
		fw.close();
		

	}

}
