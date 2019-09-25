package CustomerPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		RoomBooking sb=new RoomBooking();
		double c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("******Booking********");
		System.out.println("Enter the number of persons");
		sb.setPersons(Integer.parseInt(br.readLine()));
		System.out.println("Enter the number of days");
		sb.setTotal_Days(Integer.parseInt(br.readLine()));
		System.out.println("Enter the room type");
		sb.setRoomType(br.readLine());
		System.out.println("Enter the month");
		sb.setMonth(Integer.parseInt(br.readLine()));
		
		
		System.out.println("Enter the tariff for single person");
		sb.setTariff(Integer.parseInt(br.readLine()));
		c=sb.roomBooking();
		System.out.println("Total Tariff: "+c);
}
}
