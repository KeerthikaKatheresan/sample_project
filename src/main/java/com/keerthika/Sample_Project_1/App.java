package com.keerthika.Sample_Project_1;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data)
	{
		System.out.print("Data"+data);
		
		if(data.equals("Keerthika"))
		{
			System.out.println("Welcome");
		}
		else if(data.equals("Kavinthra"))
		{
			System.out.println("Hi Kavinthra");
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
