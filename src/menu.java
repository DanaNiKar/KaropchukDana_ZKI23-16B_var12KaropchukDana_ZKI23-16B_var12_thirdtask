import java.util.Scanner;

public class menu {
    public static int menu() {
        int selection;
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите действие");
        System.out.println("-----------------------------");
        System.out.println("1 - Добавить новый элемент");
        System.out.println("2 - Удалить элемент по индексу");
        System.out.println("3 - Вывести все элементы в консоль");
        System.out.println("4 - Сравнить два элемента на равенство(по индексам)");
        System.out.println("5 - Выйти");
        System.out.println("Выберите нужный пункт: ");

        selection = input.nextInt();
        return selection;
    }
}