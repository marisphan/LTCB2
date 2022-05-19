package Ex2_2;

public class Movie {
	double ticketPrice;
	double performanceCost;
	double chargePerAttendee;

	Movie(double ticketPrice, double performanceCost, double chargePerAttendee) {
		this.ticketPrice = ticketPrice;
		this.performanceCost = performanceCost;
		this.chargePerAttendee = chargePerAttendee;
	}
	double cost(int numberAttendee) {
		return this.performanceCost + this.chargePerAttendee * numberAttendee;
	}
	double revenue(int numberAttendee) {
		return this.ticketPrice *numberAttendee;
	}
	double totalProfit(int numberAttendee) {
		return this.revenue(numberAttendee) - this.cost(numberAttendee);
	}
}
