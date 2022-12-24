package _03_Intro_to_Enums;

import java.util.Random;

public enum StatesOfMatter {
	SOLID(0), LIQUID(25.55), GAS(100);
	double celsiusTemp;
	
	private StatesOfMatter(double celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}
	public static double convertToFahrenheit(double celsiusTemp) {
		double FTemp = (celsiusTemp * 9/5) + 32;
		return FTemp;
		
	}
	static StatesOfMatter getRandomState() {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int num = ran.nextInt(2);
		
		return values()[num];
	}
}
