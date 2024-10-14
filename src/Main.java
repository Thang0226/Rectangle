import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the width: ");
		double width = scanner.nextDouble();
		System.out.print("Enter the height: ");
		double height = scanner.nextDouble();

		Rectangle rect = new Rectangle(width, height);
		System.out.println("Your rectangle: \n    " + rect.display());
		System.out.println("Perimeter of the rectangle: " + rect.getPerimeter());
		System.out.println("Area of the rectangle: " + rect.getArea());
	}
}

class Rectangle {
	double width, height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	public String display() {
		return "Rectangle {" + "width=" + width + ", height=" + height + "}";
	}
}
