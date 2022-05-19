package Ex2_5;

public class JetFuel {
	double quantitySold;
	String qualityLevel;
	double price;

	JetFuel(double quantitySold, String qualityLevel, double price) {
		this.quantitySold = quantitySold;
		this.qualityLevel = qualityLevel;
		this.price = price;
	}

	double cost() {
		return this.quantitySold * this.price;
	}

double discount() {
	if(this.quantitySold > 100000.0) {
		return this.cost() * 0.1;
	}
	else {
		return this.cost();
	}
}
}