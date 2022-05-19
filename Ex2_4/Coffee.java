package Ex2_4;

public class Coffee {
	String kind;
	double price;
	double weight;

	Coffee(String kind, double price, double weight) {
		this.kind = kind;
		this.price = price;
		this.weight = weight;
	}

	double cost() {
		return this.price * this.weight;
	}

	double discount() {
		if (this.cost() < 5000.0) {
			return this.price * this.weight;
		} else {
			if (this.cost() >= 5000.0 && this.cost() < 20000.0) {
				return this.price * this.weight * 0.1;
			} else {
				return this.price * this.weight * 0.25;
			}
		}
	}

}
