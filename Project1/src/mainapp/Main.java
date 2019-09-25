package mainapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import BookingPackage.Booking;
import custemer.Custemer;
import register.Register;

public class Main {
	public static int booking[] = new int[25];;
	public static int regid[] = new int[25];;
	static int regID=1;
	static Custemer customer=new Custemer();
	public static int Room[]=new int[25];
	//public static String email[]=new String[25];
	public static int date[]=new int[25];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int option;
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		String menu;
		String newEmail;
		
		int room;
		int f=1;
		int c=0;		
		int cus;
		int start ,end;
		 
		Register reg=new Register();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
		System.out.println("\n\n\t\t\t***********MENU***********");
		System.out.println("\t\t1. Register.\r\n" + "\t\t2. Book.\r\n" + "\t\t3. Check Status.\r\n" + "\t\t4. Email.\r\n" + "\t\t5. All Bookings.\r\n" + "\t\t6. All Customers.\r\n" + "\t\t7. Exit.\r\n" + "");		
		System.out.print("\tChoose your option : \n");
		option=Integer.parseInt(br.readLine());
		switch(option)
		{
		case 1:
			{
			
			System.out.print("\tEnter your name    : ");
			customer.setName(br.readLine());
			System.out.print("\tEnter your address : ");
			customer.setAddress(br.readLine());
			System.out.print("\tContact Number     : ");
			customer.setContactNumber(br.readLine());
			System.out.print("\tE-Mail ID          : ");
			customer.setEmail(br.readLine());
			System.out.print("\tEnter proof type   : ");
			customer.setProofType(br.readLine());
			System.out.print("\tEnter proof id     : ");
			customer.setProofID(br.readLine());
			if(f==1)
			{
				System.out.println("\tThank you for Registration. Your registration number is "+ regID+"\n");
				f=1;
			}
			regid[regID]=1;
			reg.register(customer);
			regID++;
			break;
			}
		case 2:
			{
				if(regID!=0)
				{
				System.out.println("\t\t*****Booking:******");
				System.out.println("\tPlease choose the services required.");
				System.out.print("\tAC/non-AC(AC/nAC)      :  ");
				ac=br.readLine();
				System.out.print("\tCot(Single/Double)     :  ");
				cot=br.readLine();
				System.out.print("\tWith cable connection/without cable connection(C/nC)  : ");
				cable=br.readLine();
				System.out.print("\tWi-Fi needed or not(W/nW)  : ");
				wifi=br.readLine();
				System.out.print("\tLaundry service needed or not(L/nL)  : ");
				laundry=br.readLine();
				System.out.print("\tEnter the date of booking    :  ");
				date[c]=Integer.parseInt(br.readLine());
				Booking book=new Booking();
				book.Book(ac,cot,cable,wifi,laundry);
				book.service(ac,cot,cable,wifi,laundry);
				
				if(f==1)
				{
					//c++;
					System.out.println("\tThank you for Room Booking. Your room number is "+ (c+1));
					Room[c]=regID-1;
					c++;
				}
				booking[c]=1;
				
			}
			
			
			break;
			}
		case 3:
			{
				System.out.println("\tEnter the room number");
				room=Integer.parseInt(br.readLine());
				for(int i=1;i<=25;i++)
				{
				if(booking[room]==1)
				{
					System.out.println("\t  Room number "+room+" is booked.");
					break;
				}
				else
				{
					System.out.println("\t  Room number "+room+" is not booked.");
					break;
				}
				}
				
			
			break;
			}
		case 4:
			{
			System.out.println("\tEnter the customer ID");
			cus=Integer.parseInt(br.readLine());
			System.out.println("\tEnter the new email ID");
			newEmail=br.readLine();
			customer.emailarr[cus]=newEmail;
			System.out.println("\t*******Updated*******");
			break;
			}
		case 5:
			{
				System.out.println("\tEnter the start date");
				start=Integer.parseInt(br.readLine());
				System.out.println("\tEnter the end date");
				end=Integer.parseInt(br.readLine());
				System.out.println("\tThe bookings made from "+start+" to "+end+" are");
				System.out.println("\tRoom number\tCustomer ID");
				for(int i=0;i<25;i++)
				{
					if(date[i]>=start&&date[i]<=end)
					{
						System.out.println("\t"+(i+1)+"\t"+Room[i]);
					}
			}
			
			break;
			}
		case 6:
			{
				System.out.println("\t\t****Customers list****");
				System.out.println("\tThe registered customers are\n");
				System.out.println("\tCustomer ID\tCustomer name");
				for(int i=0;i<=regID-2;i++)
				{
				System.out.println("\t\t"+(i+1)+"\t"+customer.namearr[i]);
				}
			
			break;
			}
		case 7:
			{
				System.out.println("\t\t**********Bye*************");
				System.exit(0);
			
			break;
			}
		
		
		}
		
		System.out.print("\tDo you continue the main MENU?(y/n)  :");
		menu=br.readLine();
	}while(menu.equals("y"));

}
	
}
