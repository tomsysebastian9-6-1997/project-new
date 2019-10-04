package Booking;

import java.io.IOException;
import java.util.LinkedList;

public class BookingClass {


	int days;
	String roomtype;
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	static int total=0;
	static int c=1;
	int date;
	public static LinkedList<Integer> Room= new LinkedList<Integer>();
	public void Book(String ac, String cot, String cable, String wifi, String laundry) {
		// TODO Auto-generated method stub
		if(ac.equalsIgnoreCase("AC"))
		{
			total=1000;
		}
		else
		{
			total=750;
		}
		if(cot.equalsIgnoreCase("Double"))
		{
			total=total+350;
		}
		else
		{
			total=total+0;
		}
		if(cable.equalsIgnoreCase("C"))
		{
			total=total+50;
		}
		else
		{
			total=total+0;
		}
		if(wifi.equalsIgnoreCase("W"))
		{
			total=total+200;
		}
		else
		{
			total=total+0;
		}
		if(laundry.equalsIgnoreCase("L"))
		{
			total=total+100;
		}
		else
		{
			total=total+0;
		}
		
	}
	public void service(String ac, String cot, String cable, String wifi, String laundry) throws IOException
	{
		System.out.println("\n\t\t*****The services chosen are*****\n");
		System.out.println("\tThe total charge is "+total);
		if(ac.equalsIgnoreCase("AC")&&cot.equalsIgnoreCase("Single"))
		{
			System.out.println("\tSingle cot AC room");
		}
		if(ac.equalsIgnoreCase("nAC")&&cot.equalsIgnoreCase("Single"))
		{
			System.out.println("\tSingle cot non-AC room");
		}
		if(ac.equalsIgnoreCase("AC")&&cot.equalsIgnoreCase("Double"))
		{
			System.out.println("\tDouble cot AC room");
		}
		if(ac.equalsIgnoreCase("nAC")&&cot.equalsIgnoreCase("Double"))
		{
			System.out.println("\tDouble cot non-AC room");
		}
		if(cable.equalsIgnoreCase("C"))
		{
			System.out.println("\tCable connection enabled");
		}
		else
		{
			System.out.println("\tCable connection disabled");
		}
		if(wifi.equalsIgnoreCase("W"))
		{
			System.out.println("\tWi-Fi enabled");
		}
		else
		{
			System.out.println("\tWi-Fi disabled");
		}
		if(laundry.equalsIgnoreCase("L"))
		{
			System.out.println("\twith laundry service");
		}
		else
		{
			System.out.println("\twithout laundry service");
		}
		
		System.out.println("\tThank you for Room Booking. Your room number is "+ c);
		Room.add(c);
		
		c++;
	}

}
