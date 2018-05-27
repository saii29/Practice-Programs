package com.search.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static List<String> results = new ArrayList<String>();

	public static List<File> listFiles(String directoryName) {
		File directory = new File(directoryName);

		List<File> resultList = new ArrayList<File>();

		// get all the files from a directory
		File[] fList = directory.listFiles();
		resultList.addAll(Arrays.asList(fList));
		for (File file : fList) {
			if (file.isFile()) {
				System.out.println(file.getAbsolutePath());
			} else if (file.isDirectory()) {
				resultList.addAll(listFiles(file.getAbsolutePath()));
			}
		}
		// System.out.println(fList);
		return resultList;
	}

	public static void main(String[] args) throws FileNotFoundException {

		

		// File[] files = new
		// File("E:\\Projects\\WorkspaceMars\\RestEasy-Example\\src").listFiles();
		String path = "E:\\Projects\\WorkspaceMars\\RestEasy-Example";
		List<File> files = listFiles(path);
		String name = "packageName";
		searchFiles(files, name);

		System.out.println(results);

	}

	public static void searchFiles(List<File> files, String name) throws FileNotFoundException {
		for (File file : files) {
			if (file.isFile() && file.getName().endsWith(".java")) {
				results.add(file.getName());
				Scanner scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					final String lineFromFile = scanner.nextLine();
					if (lineFromFile.contains(name) && !file.getName().startsWith(name)) {
						// a match!
						System.out.println("I found " + lineFromFile + " in file " + file.getName() + " and " +file.getName().split ("\\.")[0]);
						searchFiles(files, file.getName().split ("\\.")[0]);
						break;
					}
				}

			}
		}
	}
}
