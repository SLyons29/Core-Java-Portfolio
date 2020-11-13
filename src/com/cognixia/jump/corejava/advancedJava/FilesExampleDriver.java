package com.cognixia.jump.corejava.advancedJava;

import java.io.File;
import java.io.IOException;

public class FilesExampleDriver {

	public static void main(String[] args) throws IOException {
		
		// first create resources folder with the file temp.txt
		// relative path - this is the file we'll actually use
		File file = new File("resources/temp.txt");
		
		// Example of absolute path and double checkin the / vs \
		File other = new File("C:/Java Workspace/CoreJava/src/com"
				+ "/cognixia/jump/corejava/Loops.java");
		// check if the file is there
		System.out.println("Does file exist? " + file.exists());
		
		// delete the file
		
		// check if the file exists, if not we create
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("Created File");
		}
		
		System.out.println("Does file exist? " + file.exists());
		
		// extract some info about the file itself
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Filename: " + file.getName());
		System.out.println("Last Modified: " + file.lastModified());
		
		// create directories (folders)
		File dir = new File("resources/dir1");
		
		// java team could have made this method return void, but 
		// returning a value is often better practice
		boolean created = dir.mkdir();
		
		if(created) {
			System.out.println(dir.getName() + " created");
		}else {
			System.out.println(dir.getName() + " not created");
		}
		
		// create new file in new created directory
		File fileWithDir = new File("resources/dir1/newFile.txt");
		fileWithDir.createNewFile();
		if(fileWithDir.exists()) {
			System.out.println(fileWithDir.getName() + " created at " 
		+ fileWithDir.lastModified());
		}else {
			System.out.println(fileWithDir.getName() + " not created");
		}
		
	}

}