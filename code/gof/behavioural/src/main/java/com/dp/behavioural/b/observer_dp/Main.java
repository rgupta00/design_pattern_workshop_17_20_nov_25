package com.dp.behavioural.b.observer_dp;

import java.util.Observable;
import java.util.Observer;
//NewsAgency---> EmailSubscriber, SmsSubscriber

//Observable using  Built-in  Observable class
class NewsAgency {

	private String news;

	public void setNews(String news) {
		this.news = news;
		System.out.println("Agency: " + news);
		// Mark as changed before notifying
		// Notify all observers with message
	}
}

//Concrete Observers using Built-in Observer interface
class EmailSubscriber {

}

class SMSSubscriber {

}

public class Main {

	public static void main(String[] args) {
		NewsAgency agency = new NewsAgency();

//		Observer email = new EmailSubscriber();
//		Observer sms = new SMSSubscriber();
//		// Attach observers
//		agency.addObserver(email);
//		agency.addObserver(sms);

		// Change news and notify all observers
		agency.setNews("Java 25 Released!");
		agency.setNews("Spring Boot 4.x  Announced!");
	}
}
