//класс многоугольник
public class Polygon {
    private int sides;
    private String name;

    public Polygon() {
        this.sides = 0;
        this.name = "Неизвестно";
    }

    public Polygon(int sides, String name) {
        if (sides <= 0) {
            System.out.println("Количесвто сторон должно бтыь больше нуля");
            this.sides = 0;
        } else {
            this.sides = sides;
        }
        if (name == null || name.isEmpty()) {
            System.out.println("Имя не может быть пустым");
            this.name = "Неизвестно";
        } else {
            this.name = name;
        }
    }
    public int getSides() {
        return sides;
    }

    public String getName() {
        return name;
    }

    public void setSides(int sides) {
        if (sides > 0) {
            this.sides = sides;
        } else {
            System.out.println("Количество сторон должно быть больше нуля");
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Имя не может быть пустым");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Polygon)) return false;
        Polygon polygon = (Polygon) obj;
        return sides == polygon.sides && name.equals(polygon.name);
    }

    @Override
    public int hashCode() {
        return 31 * sides + (name != null ? name.hashCode() : 0);
    }

    @Override
    public String toString() {
        return "Многоульник {" + "стороны=" + sides + ", название='" + name + '\'' + '}';
    }
}