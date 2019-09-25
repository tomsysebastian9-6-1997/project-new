package facefolks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.Scanner;

public class MainCus {
	public static int regID=0;
	public static String str[];
	public static int str1[];
	public static int c=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int option;
		MainCus mc=new MainCus();
		System.out.println("\n\n\t\t***********MENU***********");
		System.out.println("\t1. Register.\r\n" + 
				"\t2. Book.\r\n" + 
				"\t3. Check Status.\r\n" + 
				"\t4. Email.\r\n" + 
				"\t5. All Bookings.\r\n" + 
				"\t6. All Customers.\r\n" + 
				"\t7. Exit.\r\n" + "");
		System.out.println("Choose your option:");
		option=sc1.nextInt();
		switch(option)
		{
			case 1:
				mc.SubMain();
				break;
			case 2:
				Booking bg=new Booking();
				bg.book();
				break;
			case 4:
				String update;
				String newe;
				String e1;
				mc.SubMain();
				BufferedReader br3=new BufferedReader(new InputStreamReader(System.in));
					System.out.println("Enter the customer ID");
					update=br3.readLine();
					if(update.equalsIgnoreCase("yes"))
					{
					//System.out.println("Update Email:");
					
					System.out.println("Enter new Email id");
					newe=br3.readLine();			
					System.out.println("Email updated");
					Customer cu1=new Customer();
					//cu1.setName(name);		
					//cu1.setAddress(address);		
					//cu1.setContactNumber(contactNumber);		
					cu1.setEmail(newe);		
					//cu1.setProofType(proofType);		
					//cu1.setProofID(proofID);
					cu1.register();
					}
					
			case 6:
				mc.SubMain();
				System.out.println("\t\tCustomers list");
				System.out.println("The registered customers are\n");
				System.out.println("Customer ID\t\tCustomer name");
		}
				
	}
		public void SubMain() throws IOException
		{
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		String i;
		String e;
		String broom;
		int booking[];
		booking=new int[25];
		int start;
		int end;
		 str=new String[25];
		
		do {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\t\tRegistration");
		System.out.println("Enter your name");
		name=br.readLine();
		str[c]=name;
		c++;
		//System.out.println(str[c]);
		System.out.println("Enter your address");
		address=br.readLine();
		System.out.println("Contact Number");
		contactNumber=br.readLine();
		System.out.println("E-Mail ID");
		email=br.readLine();
		System.out.println("Enter proof type");
		proofType=br.readLine();
		System.out.println("Enter proof id");
		proofID=br.readLine();
		Customer cu=new Customer();		
		cu.setName(name);		
		cu.setAddress(address);		
		cu.setContactNumber(contactNumber);		
		cu.setEmail(email);		
		cu.setProofType(proofType);		
		cu.setProofID(proofID);
		
		cu.register();		
		regID++;
		System.out.println("Thank you for registering. Your id is "+ regID);
		//str1[c]=regID;
		
		
	
		//email
			
			//System.out.println("Do you want to book a room (y/n)?");
			//broom=br3.readLine();
			//if(broom.equalsIgnoreCase("y"))
			{
				Booking bg=new Booking();
				bg.book();
			}
			System.out.println("Do you want continue registration?(Y/N)");
			i=br.readLine();
			}while(i.equalsIgnoreCase("Y"));
		BufferedReader br4=new BufferedReader(new InputStreamReader(System.in));
			/*System.out.println("View all bookings:");
			System.out.println("Enter the start date");
			start=Integer.parseInt(br4.readLine());
			System.out.println("Enter the end date");
			end=Integer.parseInt(br4.readLine());
			System.out.println("The bookings made from "+start+" to "+end+" are");
			System.out.println("Room number\tCustomer ID");*/
			
			//custemer
			
			int p=0;
			for(int j=1;j<=(regID-1);j++)
			{
			System.out.println("\t"+j+"\t\t"+str[p]);
			p++;
			}
			System.out.println("Thank You");
		
				
		
	}
	}
