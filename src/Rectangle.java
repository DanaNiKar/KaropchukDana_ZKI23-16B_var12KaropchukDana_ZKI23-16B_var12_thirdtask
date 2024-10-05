//класс прямоугольник
public class Rectangle extends Polygon {
    private double width;
    private double height;

    public Rectangle() {
        super(4, "Прямоугольник");
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        super(4, "Прямоугольник");
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Ширина должна быть положительной");
            this.width = 1.0;
        }
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Высота должна быть положительной");
            this.height = 1.0;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Ширина должна быть положительной");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Высота должна быть положительной");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        return Double.compare(other.width, width) == 0 && Double.compare(other.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Double.hashCode(width) + Double.hashCode(height);
    }

    @Override
    public String toString() {
        return "Прямоугольник{" + "ширина=" + width + " , высота=" + height + "} " + super.toString();
    }

}