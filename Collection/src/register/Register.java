package register;

import java.util.ArrayList;
import HotelManagment.Main;
import java.util.Collection;
import java.util.LinkedList;
import Customer.Customer;


public class Register {
	Customer customer=new Customer();
	static	int k=0;
	Main main=new Main();
	
		public void register(Customer customer) {
		
		// TODO Auto-generated method stub
		System.out.println("\t\t*****Your details are******\n");
		
		System.out.println("\tName           :"+Main.arrname.get(k));
		System.out.println("\tAddress        :"+customer.getAddress());
		System.out.println("\tContact Number :"+customer.getContact());
		System.out.println("\tEmail          :"+Main.arremail.get(k));
		System.out.println("\tProof Type     :"+customer.getType());
		System.out.println("\tProof ID       :"+customer.getId());
		k++;
		System.out.println("\tThank you for Registration. Your registration number is "+k+"\n");
		
		
	}
	
		
}
