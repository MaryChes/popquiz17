package com.popquiz;

public class Car extends Vehicle
{
	public int numberofWheels = 0;
	public int numberOfSeats = 0;
	public String color = null;
	public String make = null;
	public String model = null;
	
	public Car(int fuelCapacity, boolean canCarryPassengers, int numberofWheels, int numberOfSeats, String color,
			String make, String model)
	{
		super(fuelCapacity, canCarryPassengers);
		this.numberofWheels = numberofWheels;
		this.numberOfSeats = numberOfSeats;
		this.color = color;
		this.make = make;
		this.model = model;
	}

	public Car()
	{
	}

	public int getNumberofWheels()
	{
		return numberofWheels;
	}

	public void setNumberofWheels(int numberofWheels)
	{
		this.numberofWheels = numberofWheels;
	}

	public int getNumberOfSeats()
	{
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats)
	{
		this.numberOfSeats = numberOfSeats;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getMake()
	{
		return make;
	}

	public void setMake(String make)
	{
		this.make = make;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}
	
	public static void movesForward()
	{
		return;
	}
	
	public static void movesInReverse()
	{
		return;
	}
	
	@Override
	public void starts()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stops()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString()
	{
		return " in the parking lot. It had " + numberofWheels + " wheels and " + numberOfSeats + "seats. The car was " + color
				+ ". It was a " + make + " " + model + ". Upon further research we found out that the car has a fuel capacity of " + getFuelCapacity()
				+ " gallons. It is " + isCanCarryPassengers() + " that the car can carry passengers."; 			
	}
	
	
}
