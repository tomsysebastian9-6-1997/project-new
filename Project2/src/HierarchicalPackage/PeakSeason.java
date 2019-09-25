package HierarchicalPackage;

public class PeakSeason extends Booking {

	
	int month;
	int peakCharges;
	double roomBooking(int persons, int total_Days, double tariff, String roomType, int month ,int peakCharges)
	{
		 double total= super.roomBooking( persons, total_Days, tariff, roomType);
		 double amount=(total*peakCharges);
		 return amount;
	}
	}
