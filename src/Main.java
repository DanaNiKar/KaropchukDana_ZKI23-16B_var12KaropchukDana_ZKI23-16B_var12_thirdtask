import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Polygon> polygons = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg) {
        int userChoice;
        userChoice = menu.menu();

        while(userChoice < 5) {

            switch (userChoice) {
                case 1:
                    System.out.println("Вы решили добавить новый элемент");
                    addPolygon();
                    userChoice = menu.menu();
                    break;
                case 2:
                    System.out.println("Вы решили удалить элемент по индексу");
                    removePolygon();
                    userChoice = menu.menu();
                    break;
                case 3:
                    System.out.println("Вы решили вывести все элементы в консоль");
                    displayPolygons();
                    userChoice = menu.menu();
                    break;
                case 4:
                    System.out.println("Вы решили сравнить два элемента на равенство (по индексам)");
                    comparePolygons();
                    userChoice = menu.menu();
                    break;
                default:
                    System.out.println("Вы ввели не то");
                    break;
            }
        }
    }

    //метод для получения выбора пользователя
    private static int getUserChoice() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            scanner.next();
            return -1;
        }
    }

    //метод для добавления нового многоугольника
    private static void addPolygon() {
        System.out.println("Выберите тип фигуры, которую хотите добавить: ");
        System.out.println("1 - Прямоугольник");
        System.out.println("2 - Квадрат");
        System.out.println("3 - Треугольник");

        int shapeChoice = getUserChoice();

        if (shapeChoice == 1) {
            double width = getPositiveDoubleInput("Введите ширину: ");
            double height = getPositiveDoubleInput("Введите высоту: ");
            if (width > 0 && height > 0) {
                polygons.add(new Rectangle(width, height));
                System.out.println("Прямоугольник добавлен");
            } else {
                System.out.println("Введены некорректные данные");
            }
        } else if (shapeChoice == 2) {
            double side = getPositiveDoubleInput("Введите сторону квадрата: ");
            if (side > 0) {
                polygons.add(new Square(side));
                System.out.println("Квадрат добавлен");
            } else {
                System.out.println("Введены некорректные данные");
            }
        } else if (shapeChoice == 3) {
            double base = getPositiveDoubleInput("Введите основание треугольника: ");
            double height = getPositiveDoubleInput("Введите высоту: ");
            if (base > 0 && height > 0) {
                polygons.add(new Triangle(base, height));
                System.out.println("Треугольник добавлен");
            } else {
                System.out.println("Введены некорректные данные");
            }
        } else {
            System.out.println("Неверный выбор");
        }
    }

    //метод для получения положительного числа с проверкой
    private static double getPositiveDoubleInput(String prompt) {
        System.out.print(prompt);
        if (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();
            if (value > 0) {
                return value;
            } else {
                System.out.println("Значение должно быть больше нуля");
            }
        } else {
            System.out.println("Введите числовое значение");
            scanner.next(); //очистка некорректного ввода
        }
        return -1;
    }

    //метод для удаления многоугольника по индексу
    private static void removePolygon() {
        int index = getIndexInput("Введите индекс элемента для удаления: ");
        if (index >= 0 && index < polygons.size()) {
            polygons.remove(index);
            System.out.println("Элемент удален");
        } else {
            System.out.println("Неверный индекс");
        }
    }

    //метод для вывода всех многоугольников
    private static void displayPolygons() {
        if (polygons.isEmpty()) {
            System.out.println("Пусто");
        } else {
            for (int i = 0; i <polygons.size(); i++) {
                System.out.println(i + ": " + polygons.get(i).toString());
            }
        }
    }

    //метод для сравнения двух многоугольников по индексу
    private static void comparePolygons() {
        int index1 = getIndexInput("Введите индекс первого элемента: ");
        int index2 = getIndexInput("Введите индекс второго элемента: ");

        if (index1 >= 0 && index1 < polygons.size() && index2 >= 0 && index2 < polygons.size()) {
            if (polygons.get(index1).equals(polygons.get(index2))) {
                System.out.println("Элементы равны");
            } else {
                System.out.println("Элементы не равны");
            }
        } else {
            System.out.println("Один из индексов некорректен");
        }
    }

    //метод для получения корректного индекса
    private static int getIndexInput(String prompt) {
        System.out.print(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Введите целое число");
            scanner.next(); //очистка некорректного ввода
            return -1;
        }
    }
}