package register;

import com.sun.tools.javac.Main;

import custemer.Custemer;

public class Register {
	static	int i=0,x,y,j=0,k=1;
	Main main=new Main();
	public void register(Custemer customer)
	{
		//System.out.println("Thanks for Registration");
		System.out.println("\t\t*****Your details are******\n");
		System.out.println("\tName           :"+customer.getName());
		System.out.println("\tAddress        :"+customer.getAddress());
		System.out.println("\tContact Number :"+customer.getContactNumber());
		System.out.println("\tEmail          :"+customer.getEmail());
		System.out.println("\tProof Type     :"+customer.getProofType());
		System.out.println("\tProof ID       :"+customer.getProofID());
		k++;
		
	}
		
}
