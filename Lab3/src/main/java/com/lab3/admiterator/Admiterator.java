package com.lab3.admiterator;

public class Admiterator {
	
	public static boolean admit(int speed, int accuracy) {
		
		if(speed >= 50 && speed <= 70) {
			if(accuracy >= 75 && accuracy <= 100) {
				if(checkRatio(speed, accuracy)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	private static boolean checkRatio(int speed, int accuracy) {
		
		double ratio = 1.25*speed + accuracy;
		
		return ratio >= 162.5;
		
	}

}
