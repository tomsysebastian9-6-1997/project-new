package HierarchicalPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//Booking book=new Booking();
		PeakSeason ps=new PeakSeason();
		LeakSeason ls=new LeakSeason();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int persons;
		int total_Days;
		double tariff;
		String roomType;
		int month;
		int peakCharges;
		int discount;
		System.out.println("*******Booking********");
		System.out.println("Enter the number of persons");
		persons=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of days");
		total_Days=Integer.parseInt(br.readLine());
		System.out.println("Enter the room type");
		roomType=br.readLine();
		System.out.println("Enter the month");
		month=Integer.parseInt(br.readLine());
		if((month==4)||(month==5)||(month==6)||(month==9)||(month==11)||(month==12))
		{
		System.out.println("Enter the peakCharge");
		 peakCharges=Integer.parseInt(br.readLine());
		System.out.println("Enter the tariff for single person");
		tariff=Integer.parseInt(br.readLine());
		double d=ps.roomBooking(persons, total_Days, tariff, roomType, month, peakCharges);
		System.out.println(d);
		}
		if((month==1)||(month==2)||(month==3)||(month==7)||(month==8)||(month==9)||(month==10))
		{
			System.out.println("Enter the discount");
			discount=Integer.parseInt(br.readLine());
			System.out.println("Enter the tariff for single person");
			tariff=Integer.parseInt(br.readLine());
			double t=ls.roomBooking(persons, total_Days, tariff, roomType, discount);
			System.out.println(t);
		}
	}

	

}
