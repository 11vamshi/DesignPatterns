package org.learn.java.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{

	List<IObserver> observers = new ArrayList<IObserver>(); 
	Integer temperature = null;
	
	public void add(IObserver observer) {
		observers.add(observer);
	}

	public void remove(IObserver observer) {
		observers.remove(observer);
	}

	public void notify1() {
		for(IObserver observer:observers) {
			// should send temperature below
			// below line works for variation 2
			// observer.update(this.temperature);
			observer.update();
		}
	}
	
	int getTemperature(){
		return this.temperature;
	}
	
	void setTemperature(Integer temp){
		this.temperature = temp;
	}

	
	
	
}
