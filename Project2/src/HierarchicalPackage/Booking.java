package HierarchicalPackage;

public class Booking {

	private int persons;
	private int total_Days;
	private double tariff;
	private String roomType;
	private int month;
	private int discount;
	double total;
	public int getPersons() {
		return persons;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public void setPersons(int persons) {
		this.persons = persons;
	}
	public int getTotal_Days() {
		return total_Days;
	}
	public void setTotal_Days(int total_Days) {
		this.total_Days = total_Days;
	}
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double roomBooking(int persons, int total_Days, double tariff, String roomType)
	{
		total= persons*total_Days*tariff;
		return total;
	}
}
