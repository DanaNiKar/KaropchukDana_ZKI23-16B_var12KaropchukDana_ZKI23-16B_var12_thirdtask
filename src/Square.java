//класс квадрат
public class Square extends Rectangle {
    public Square() {
        super(1.0, 1.0);
        setName("Квадрат");
    }

    public Square(double side) {
        super(side, side);
        setName("Квадрат");
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        if (side > 0) {
            setWidth(side);
            setHeight(side);
        } else {
            System.out.println("Сторона квадрата должна быть положительной");
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Квадрат{" + "сторона=" + getSide() + "} " + super.toString();
    }
}