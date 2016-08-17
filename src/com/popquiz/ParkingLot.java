package com.popquiz;

import java.util.ArrayList;

public class ParkingLot
{

	public static void main(String[] args)
	{
		ArrayList<Car>parkingLot = new ArrayList<>(); 
		
		Car carA = new Car(25, true, 8, 8, "blue", "Honda", "Odessey");
		Car carB = new Car(12, true, 4, 6, "red", "Dodge", "Charger");
		
		parkingLot.add(carA);
		parkingLot.add(carB);
		
		System.out.println("Today we saw a car" + parkingLot.get(0));
		System.out.println("Today we saw a car" + parkingLot.get(1));
		
		
	}

}
