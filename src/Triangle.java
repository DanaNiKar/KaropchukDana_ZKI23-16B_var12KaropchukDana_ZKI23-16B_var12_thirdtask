//класс треугольник
public class Triangle extends Polygon {
    private double base;
    private double height;

    public Triangle() {
        super(3, "Треугольник");
        this.base = 1.0;
        this.height = 1.0;
    }

    public Triangle(double base, double height) {
        super(3, "Треугольник");
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("Основание должно быть положительным");
            this.base = 1.0;
        }
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Высота должна быть положительной");
            this.height = 1.0;
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0 ) {
            this.base = base;
        } else {
            System.out.println("Основание должно быть положительным");
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
        if (!(obj instanceof Triangle)) return false;
        Triangle other = (Triangle) obj;
        return Double.compare(other.base, base) == 0 && Double.compare(other.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Double.hashCode(base) + Double.hashCode(height);
    }

    @Override
    public String toString() {
        return "Треугольник{" + "оснвоание= " + base + ", высота=" + height + "} " + super.toString();
    }
}