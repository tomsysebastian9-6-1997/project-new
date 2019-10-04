package Register;

import Customer.CustomerClass;
import Main.MainClass;

public class RegisterClass {

	CustomerClass customer=new CustomerClass();
	static	int k=0;
	MainClass main=new MainClass();
	
		public void register(CustomerClass customer) {
		
		// TODO Auto-generated method stub
		System.out.println("\t\t*****Your details are******\n");
		
		System.out.println("\tName           :"+MainClass.arrname.get(k));
		System.out.println("\tAddress        :"+customer.getAddress());
		System.out.println("\tContact Number :"+customer.getContact());
		System.out.println("\tEmail          :"+MainClass.arremail.get(k));
		System.out.println("\tProof Type     :"+customer.getType());
		System.out.println("\tProof ID       :"+customer.getId());
		k++;
		System.out.println("\tThank you for Registration. Your registration number is "+k+"\n");
		
		}
		
		
}
