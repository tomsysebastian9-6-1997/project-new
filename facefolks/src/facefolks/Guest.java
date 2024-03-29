package facefolks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;

public class Guest {
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	static int total=0;
	int date;
	//int booking[];
	//booking=new int[25];
	
	public void Book() throws IOException
	{
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\t\tBooking:");
		System.out.println("Please choose the services required.");
		System.out.println("AC/non-AC(AC/nAC)");
		ac=br1.readLine();
		if(ac.equalsIgnoreCase("AC"))
		{
			total=1000;
		}
		else
		{
			total=750;
		}
		System.out.println("Cot(Single/Double)");
		cot=br1.readLine();
		if(cot.equalsIgnoreCase("Double"))
		{
			total=total+350;
		}
		else
		{
			total=total+0;
		}
		System.out.println("With cable connection/without cable connection(C/nC)");
		cable=br1.readLine();
		if(cable.equalsIgnoreCase("C"))
		{
			total=total+50;
		}
		else
		{
			total=total+0;
		}
		System.out.println("Wi-Fi needed or not(W/nW)");
		wifi=br1.readLine();
		if(wifi.equalsIgnoreCase("W"))
		{
			total=total+200;
		}
		else
		{
			total=total+0;
		}
		System.out.println("Laundry service needed or not(L/nL)");
		laundry=br1.readLine();
		if(laundry.equalsIgnoreCase("L"))
		{
			total=total+100;
		}
		else
		{
			total=total+0;
		}
		System.out.println("Enter the date of booking");
		date=Integer.parseInt(br1.readLine());
		System.out.println("The total charge is "+total);
	}
	public void service() throws IOException
	{
		System.out.println("The services chosen are");
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
