package com.popquiz;

public abstract class Vehicle
{
	private int fuelCapacity = 0;
	private boolean canCarryPassengers = false;
	public Vehicle(int fuelCapacity, boolean canCarryPassengers)
	{
		this.fuelCapacity = fuelCapacity;
		this.canCarryPassengers = canCarryPassengers;
	}
	
	public int getFuelCapacity()
	{
		return fuelCapacity;
	}


	public void setFuelCapacity(int fuelCapacity)
	{
		this.fuelCapacity = fuelCapacity;
	}


	public boolean isCanCarryPassengers()
	{
		return canCarryPassengers;
	}


	public void setCanCarryPassengers(boolean canCarryPassengers)
	{
		this.canCarryPassengers = canCarryPassengers;
	}
	
	public Vehicle()
	{
	}
	
	public abstract void starts();
	
	public abstract void stops();
	



	
	
	
}
