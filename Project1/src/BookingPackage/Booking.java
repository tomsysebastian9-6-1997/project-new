package BookingPackage;

import java.io.IOException;

public class Booking {
	int no_of_person;
	double tariff;
	int days;
	String roomtype;
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	static int total=0;
	int date;
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
		System.out.println("\t\t*****The services chosen are*****");
		System.out.println("\tThe total charge is "+total);
		if(ac.equalsIgnoreCase("AC")&&cot.equalsIgnoreCase("Single"))
		{
			System.out.println("Single cot AC room");
		}
		if(ac.equalsIgnoreCase("nAC")&&cot.equalsIgnoreCase("Single"))
		{
			System.out.println("Single cot non-AC room");
		}
		if(ac.equalsIgnoreCase("AC")&&cot.equalsIgnoreCase("Double"))
		{
			System.out.println("Double cot AC room");
		}
		if(ac.equalsIgnoreCase("nAC")&&cot.equalsIgnoreCase("Double"))
		{
			System.out.println("Double cot non-AC room");
		}
		if(cable.equalsIgnoreCase("C"))
		{
			System.out.println("Cable connection enabled");
		}
		else
		{
			System.out.println("Cable connection disabled");
		}
		if(wifi.equalsIgnoreCase("W"))
		{
			System.out.println("Wi-Fi enabled");
		}
		else
		{
			System.out.println("Wi-Fi disabled");
		}
		if(laundry.equalsIgnoreCase("L"))
		{
			System.out.println("with laundry service");
		}
		else
		{
			System.out.println("without laundry service");
		}
		
	}
}