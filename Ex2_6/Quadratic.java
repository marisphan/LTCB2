package Ex2_6;

public class Quadratic {
	double a;
	double b;
	double c;
	Quadratic(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
double Delta() {
	return (this.b *this.b) - (4 * this.a * this.c);
}
String whatKind() {
	double delta = this.Delta();
	if (this.a == 0) return "degenerate";
	if (delta < 0) return "none";
	if (delta == 0)	return "one solution";
		return "two solution";
	
}
}
