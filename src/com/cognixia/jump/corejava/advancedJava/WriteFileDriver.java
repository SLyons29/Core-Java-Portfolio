package com.cognixia.jump.corejava.advancedJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileDriver {

	public static void main(String[] args) {
		// we'll use a few different try / catch / finally blocks this time
		// we'll some support / static methods listed below the main()
		
		// make our file object and file writer
		File file = null;
		FileWriter fileWriter = null;
		BufferedWriter buffWriter = null;
		PrintWriter printWriter = null;
		
		// create and write
		try {
			file = new File("resources/hello.txt");
			
			if(file.createNewFile()) {
				System.out.println("File created");
			}
			
			fileWriter = new FileWriter(file, true);
			buffWriter = new BufferedWriter(fileWriter);
			printWriter = new PrintWriter(buffWriter);
			
			writeToFile(buffWriter, "Hello"); // will overwrite everything
			//appendToFile(buffWriter, "Hi"); // will append to end of file (eof)
			//writeUsingPrintWriter(printWriter, "Hello World");
			System.out.println("Wrote to the file");
			
			
		} catch(IOException e){
			e.printStackTrace();
		}finally {
			// TODO: handle finally clause
			if(buffWriter != null) {
				try {
					buffWriter.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			// close the printer
			if(printWriter != null) {
				printWriter.close();
			}
		}
		
		// close
		

	}
	
	// write() will overwrite if things are there already
	public static void writeToFile(BufferedWriter writer, String str) throws IOException {
		
		for(int i = 0; i < 3; i++) {
			writer.write(str);
		}
		
	}
	
	// append() will append to existing contents
	public static void appendToFile(BufferedWriter writer, String str) throws IOException {
		for(int i = 0; i < 3; i++) {
			writer.append(str);
		}
	}
	
	// writeUsingPrintWriter - just easier ways to write files
	public static void writeUsingPrintWriter(PrintWriter writer, String str) {
		writer.println();
		writer.print(str);
		writer.println(str);
		writer.println(str);
		
	}

}
