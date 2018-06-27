package org.learn.java.observer;



/**
 * @author vamshi krishna
 * 
 * We are implementing observable PUSHes update, observer PULLs data
 *
 */
public class ClientProgram {

	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();
		// ideally initializing weather station is not client's job
		// another variation does not not need station to be part of observer, refer PhoneDisplay
		// commented out update()
		PhoneDisplay phoneDisplay = new PhoneDisplay(station);
		station.add(phoneDisplay);
		// u can add as many displays as u want
		

		// Side note - ideally following single responsibility principle a weather station should not be 
		// responsible for setting temperature and getting temperature
		station.setTemperature(20);
		// ideally notifying is not client's job, its weather station's job
		station.notify1();
		
		System.out.println(phoneDisplay.display());
		
		
		
		
	}

}
