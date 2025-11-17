package com.dp.creational.d.factory_method;

import java.io.File;
import java.util.List;
/*
 * Defind an interface for creating an object, but let subclass decide which 
		object to instantiate, Factory method let a class defer instantiation to subclass using 
		inheritance.
 */
class Record {}

class BatchProcessor {
	public void processBatch(String fileName) {
		File file = openFile();
		TextParser parser = new TextParser(file);
		List<Record> records = parser.parse();
		processorRecords(records);
		writeSummray();
		closeFile();
	}

	private void processorRecords(List<Record> records) {
		System.out.println("processing each record to db");
	}

	private void writeSummray() {
		System.out.println("writing summery report");
	}

	private void closeFile() {
		System.out.println("closing the file...");
	}

	private File openFile() {
		System.out.println("open the file...");
		return null;
	}
}

class TextParser {
	public TextParser(File file) {
		System.out.println("creating text parser...");
	}

	public List<Record> parse() {
		System.out.println("creating record list using text parser...");
		return null;
	}
}

public class DemoFactoryMethod {

	public static void main(String[] args) {

		BatchProcessor batchProcessor = new BatchProcessor();
		batchProcessor.processBatch("foo");
	}

}
