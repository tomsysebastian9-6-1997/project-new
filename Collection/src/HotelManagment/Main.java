package HotelManagment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

import Booking.Booking;
import Customer.Customer;
import register.Register;



public class Main {
	

	public static ArrayList<Integer>arrcusID=new ArrayList<Integer>();
	public static ArrayList<String> arrname= new ArrayList<String>();
	public static ArrayList<String> arremail= new ArrayList<String>();
	public static ArrayList<Integer> arrdate=new ArrayList<Integer>();
	public static ArrayList<Integer> arrbooking=new ArrayList<Integer>();
	static int regID=1;
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		
		Customer customer=new Customer();
		Booking book=new Booking();
		Register reg=new Register();
		String menu;
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		int room;
		int cus;
		String newEmail;
		int start;
		int end;
		
		do
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int option;
			System.out.println("\n\n\t\t\t*********Menu:*********");
			System.out.println("\t\t1. Register.\r\n" + "\t\t2. Book.\r\n" + "\t\t3. Check Status.\r\n" + "\t\t4. Email.\r\n" + "\t\t5. All Bookings.\r\n" + "\t\t6. All Customers.\r\n" + "\t\t7. Exit.\r\n" + "");		
			System.out.print("\tChoose your option :   ");
			option=Integer.parseInt(br.readLine());
			switch(option)
			{
				case 1:
					{
							
							System.out.print("\tEnter your name    : ");
							arrname.add(br.readLine());
										
							System.out.print("\tEnter your address : ");
							customer.setAddress(br.readLine());
							System.out.print("\tContact Number     : ");
							customer.setContact(br.readLine());
			
							System.out.print("\tE-Mail ID          : ");
							arremail.add(br.readLine());
			
							System.out.print("\tEnter proof type   : ");
							customer.setType(br.readLine());
							System.out.print("\tEnter proof id     : ");
							customer.setId(br.readLine());
							arrcusID.add(regID);
							regID++;
							reg.register(customer);
							break;
				}
			case 2:
				{
							System.out.print("\tEnter your customer ID  :  ");
							int checkID=Integer.parseInt(br.readLine());
							if(arrcusID.contains(checkID))
							{
									arrbooking.add(checkID);
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
									arrdate.add(Integer.parseInt(br.readLine()));
									customer.setDate(arrdate);
									
									book.Book(ac,cot,cable,wifi,laundry);
									book.service(ac,cot,cable,wifi,laundry);
			
							}
							break;
				}
				case 3:
				{
								System.out.print("\tEnter the room number  :  ");
								room=Integer.parseInt(br.readLine());
								
								if(room<=arrbooking.size())
								{
									System.out.println("\t\tRoom Number "+room+" Booked\n");
								}
								else
								{
									System.out.println("\t\tRoom Number "+room+" Not Booked\n");
								}
								break;
				}
				case 4:
				{
							System.out.print("\tEnter the customer ID : ");
							cus=Integer.parseInt(br.readLine());
							System.out.print("\tEnter the new email ID : ");
							newEmail=br.readLine();
							arremail.remove(cus-1);
							arremail.add(cus-1,newEmail);
							System.out.println("\tNew Email :  "+arremail.get(cus-1));
							System.out.println("\n\t*******Updated*******\n");
							break;
				}
				case 5:
				{
					System.out.print("\tEnter the start date  :   ");
					start=Integer.parseInt(br.readLine());
					System.out.print("\tEnter the end date    :   ");
					end=Integer.parseInt(br.readLine());
					System.out.println("\tThe bookings made from "+start+" to "+end+" are");
					System.out.println("\tRoom number\tCustomer ID");
					for(int i=0;i<arrbooking.size();i++)
					{
						if(arrdate.get(i)>=start&&arrdate.get(i)<=end)
						{
							System.out.println("\t\t"+Booking.Room.get(i)+"\t\t"+arrbooking.get(i));
						}
					}
				
					
					break;
				}
				case 6:
				{
					System.out.println("\t\t****Customers list****");
					System.out.println("\tThe registered customers are\n");
					System.out.println("\tCustomer ID\tCustomer name");
					for(int i=0;i<arrcusID.size();i++)
					{
					System.out.println("\t\t"+arrcusID.get(i)+"\t"+arrname.get(i));
					}
				
					break;

				}
				case 7:
				{
					System.out.println("\n\t\t\t.......BYE......");
					System.exit(0);
				}
		
			}
				System.out.print("\tDo you continue the main MENU?(y/n)  :  ");
				menu=br.readLine();
		}while(menu.equals("y"));
		

 
		
	}
}