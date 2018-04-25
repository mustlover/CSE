//************************************************************
//Name: Suzanne Kaufman
//Title: TempConverter.java
//Description: Computes the Farenheit equivalent of a specific Celsius Value
//Time Spent: 10 minutes
//Date: 1/10/18
//*************************************************************
//Chapter 2 Primitive data types and Variables example


public class TempConverter
{
	public static void main(String[] args)
	{
		final int BASE = 32;
		final double CONVERSION_FACTOR = 9.0/5.0;

		double farenheitTemp;
		int celciusTemp = 24; //value to convert

		farenheitTemp = celciusTemp * CONVERSION_FACTOR + BASE;

		System.out.println("Celcius Temperature: " + celciusTemp);
		System.out.println("Farenheit Temperature: " + farenheitTemp);

	}



}