package Ex2_7;

public class Transaction {
	String name; // customer name
	double depositeAmount;
	int maturity; // computed in year

	public Transaction(String name, double depositeAmount, int maturity) {
		this.name = name;
		this.depositeAmount = depositeAmount;
		this.maturity = maturity;
	}

	double interest() {
		if (this.depositeAmount <= 1000) {
			return this.depositeAmount * 0.04;
		} else {
			if (this.depositeAmount <= 5000) {
				return this.depositeAmount * 0.045;
			} else {
				return this.depositeAmount * 0.05;
			}
		}
	}

	double payback() {
		if (this.depositeAmount <= 500)
			return this.depositeAmount * 0.0025;
		if (this.depositeAmount <= 1500)
			return 500 * 0.0025 + (this.depositeAmount - 500) * 0.005;
		if (this.depositeAmount <= 2500)
			return 500 * 0.0025 + 1000 * 0.005 + (this.depositeAmount - 1500) * 0.0075;
		return 500 * 0.0025 + 1000 * 0.005 + 1000 * 0.0075 + (this.depositeAmount - 2500) * 0.01;
	}
}
