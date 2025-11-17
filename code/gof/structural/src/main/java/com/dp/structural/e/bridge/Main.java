package com.dp.structural.e.bridge;
//Implemenation Layer
interface TV {
	void on();

	void off();

	void setChannel(int channel);
}

class SonyTV implements TV {
	public void on() {
		System.out.println("Sony TV turned ON");
	}

	public void off() {
		System.out.println("Sony TV turned OFF");
	}

	public void setChannel(int channel) {
		System.out.println("Sony TV: channel set to " + channel);
	}
}

//Abstraction Layer
abstract class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public void turnOn() { tv.on(); }
    public void turnOff() { tv.off(); }
    public abstract void setChannel(int channel);
}

public class Main {

	public static void main(String[] args) {

	}

}
