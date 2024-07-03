// Question-2(b)
// Errors of the code
// 1. instead of radius = radius, it should be this.radius = radius and instead of length = length, it should be this.length = length
// 2. B(){} is empty, initialize karvani jarur che, baki to badhu barobar lage che, bhul hoy to maaf karjo
// Corrected Code

public class AnswerThree {
    private double radius;

    public static void main(String args[]) {
        AnswerThree c1 = new AnswerThree(2);
        System.out.println("Area of Circle: " + c1.getArea());

        B b1 = new B(2, 2);
        System.out.println("Area of B: " + b1.getArea());
    }

    public AnswerThree(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class B extends AnswerThree {
    private double length;

    B() {
        super(0);
        this.length = 0;
    }

    B(double radius, double length) {
        super(radius);
        this.length = length;
    }

    @Override
    public double getArea() {
        return super.getArea() * length;
    }
}