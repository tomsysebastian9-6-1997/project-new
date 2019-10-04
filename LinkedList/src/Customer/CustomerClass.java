package Customer;

import java.util.LinkedList;

public class CustomerClass {

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contactNumber;
	}
	public void setContact(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String proofType) {
		this.type = proofType;
	}
	public String getId() {
		return id;
	}
	public void setId(String proofID) {
		this.id = proofID;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLaundry() {
		return laundry;
	}
	public void setLaundry(String laundry) {
		this.laundry = laundry;
	}
	public LinkedList<Integer> getDate() {
		return date;
	}
	public void setDate(LinkedList<Integer> date) {
		this.date = date;
	}

		
	private String address;
	private String contactNumber;
	private String type;
	private String id;
	private String ac;
	private String cot;
	private String cable;
	private String wifi;
	private String laundry;
	private LinkedList<Integer> date;

}
