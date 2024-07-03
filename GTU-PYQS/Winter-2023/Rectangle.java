// Question-2(c)

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public int getArea() {
        return length * width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setWidth(3);
        System.out.println("Area of Rectangle: " + rect.getArea());
    }
}