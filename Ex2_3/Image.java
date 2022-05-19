package Ex2_3;

public class Image {
	int width;
	int height;
	String source;
	String quality;

	Image(int width, int height, String source, String quality) {
		this.width = width;
		this.height = height;
		this.source = source;
		this.quality = quality;
	}

	boolean isPortrait() {
		return this.height > this.width;
	}

	int size() {
		return this.width * this.height;
	}

	boolean isLarge(Image that) {
		return (this.width * this.height) > (that.width * that.height);
	}

	boolean same(Image that) {
		return this.width == that.width && this.height == (that.height) && this.source.equals(that.source)
				&& this.quality.equals(that.quality);
	}

	String sizeString() {

		if (this.size() <= 10000) {
			return "small";
		} else {
			if (this.size() >= 10001 && this.size() <= 1000000) {
				return "medium";
			} else {
				return "large";
			}
		}
	}
}
