package facefolks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Booking {
	static int c=0;
	public void book() throws IOException
	{
	Scanner in=new Scanner(System.in);
	
	int choice;
	int booking[] ;
	 booking = new int[25];
	 String str;
	int room;
	int f=1;
	
	do
	{
	//System.out.println("Menu");
	//System.out.println("1. Book");
	//System.out.println("2. Check Status");
	//System.out.println("3. Exit");
	System.out.println("Choose your option");
	choice=in.nextInt();
	switch(choice)
	{
	case 2:
		//c++;
		
		Guest gt=new Guest();
		gt.Book();
		gt.service();
		c++;
		if(f==1)
		{
			//c++;
			System.out.println("Thank you for booking. Your room number is "+ c);
			
		}
		booking[c]=1;
		break;
	case 3:
		Guest gt1=new Guest();
		System.out.println("Check Status:");
		System.out.println("Enter room number");
		room=in.nextInt();
		for(int i=1;i<=25;i++)
		{
		if(booking[room]==1)
		{
			System.out.println("Room number "+room+" is booked.");
			break;
		}
		else
		{
			System.out.println("Room number "+room+" is not booked.");
			break;
		}
		}
		break;
	case 7:
		System.exit(0);
		break;
	}
	BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Do you want to menu (yes/no)?");
	str=br2.readLine();
	if(str.equals("yes"))
	{
       f=1;
       //System.out.println(f);
	}
		}while(str.equals("yes"));
	
	
	
	}

	
	}
