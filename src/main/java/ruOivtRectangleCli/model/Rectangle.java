
package ruOivtRectangleCli.model;


public class Rectangle {

	private final double a;
	private final double b;
	private static final double EPS = 1e-9;
	
	public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException (
                "Стороны должны быть > 0");
        }
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


    public double perimeter() {
        return 2 * (a + b);
    }


    public double area() {
        return a * b;
    }

    public double diagonal() {
        return Math.sqrt(a * a + b * b);
    }


    public double inscribedCircleRadius() {
        return Math.min(a, b) / 2;
    }
    public boolean isSquare() { return Math.abs(a - b) < EPS; }
    
}

	
