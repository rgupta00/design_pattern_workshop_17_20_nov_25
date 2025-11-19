package com.dp.creational.d.factory_method;

import java.io.File;
import java.util.List;

import javax.swing.plaf.basic.BasicTableHeaderUI;

/*
 * Defind an interface for creating an object, but let subclass decide which 
		object to instantiate, Factory method let a class defer instantiation to subclass using 
		inheritance.
 */
class Record {
}

abstract class AbstractBatchProcessor {
	public void processBatch(String fileName) {
		File file = openFile();
		Parser parser = createParser(fileName);
		List<Record> records = parser.parse();
		processorRecords(records);
		writeSummray();
		closeFile();
	}

	public abstract Parser createParser(String fileName);

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

interface Parser {
	public List<Record> parse();
}

class TextParser implements Parser {
	public TextParser(String fileName) {
		System.out.println("creating text parser...");
	}

	public List<Record> parse() {
		System.out.println("creating record list using text parser...");
		return null;
	}
}

class CsvParser implements Parser {
	public CsvParser(String fileName) {
		System.out.println("creating csv parser...");
	}

	public List<Record> parse() {
		System.out.println("creating record list using csv parser...");
		return null;
	}
}

class TextBatchProcessor extends AbstractBatchProcessor {

	private String fileName;

	public TextBatchProcessor(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public Parser createParser(String fileName) {
		return new TextParser(fileName);
	}
}

class CsvBatchProcessor extends AbstractBatchProcessor {
	@Override
	public Parser createParser(String fileName) {
		return new CsvParser(fileName);
	}
}

public class DemoFactoryMethod {

	public static void main(String[] args) {

		AbstractBatchProcessor batchProcessor = new TextBatchProcessor("foo.txt");

	}

}
