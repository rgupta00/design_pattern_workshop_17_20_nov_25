package com.dp.behavioural.e.template_dp1;

abstract class OnlineExam {
	// Template Method
	public final void conductExam() {
		startTest();
		presentQuestions(); // customizable step
		evaluate();
		showResult();
	}

	private void startTest() {
		System.out.println("Test started. Timer is running...");
	}

	protected abstract void presentQuestions(); // variation point

	private void evaluate() {
		System.out.println("Evaluating answers...");
	}

	private void showResult() {
		System.out.println("Displaying result to the student.");
	}
}

class JavaExam {
	
}
class MathsExam{
	
}
public class Main {

	public static void main(String[] args) {
//		OnlineExam exam1 = new JavaExam();
//		exam1.conductExam();
//
//		System.out.println("-----");
//
//		OnlineExam exam2 = new MathsExam();
//		exam2.conductExam();

	}
}
