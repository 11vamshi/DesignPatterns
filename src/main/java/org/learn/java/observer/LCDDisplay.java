package org.learn.java.observer;

public class LCDDisplay implements IObserver, IDisplay {

	WeatherStation station = null;
	Integer temperature = null;

	public LCDDisplay(WeatherStation station) {
		super();
		this.station = station;
	}

	public void update() {
		this.temperature = station.getTemperature();
	}

	// variation 2 is below which does not need concreteObservable to be part of
	// concreteObserver
	/*
	 * public void update(Integer temperature) { this.temperature = temperature; }
	 */

	public int display() {
		return this.temperature;

	}

}
