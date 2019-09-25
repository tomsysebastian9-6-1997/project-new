package HierarchicalPackage;

public class LeakSeason extends Booking{

	int month;
	int discount;
	double roomBooking(int persons, int total_Days, double tariff, String roomType ,int discount)
	{
		double total=super.roomBooking( persons, total_Days, tariff, roomType);
		double	amount=total*discount/100;
			double discount1 =total-amount;
			return discount1;
	}
}
