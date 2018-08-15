import java.util.Scanner;

public class HomeWork_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Имя: ");
        String name = scanner.nextLine();

        System.out.print("Город: ");
        String city = scanner.nextLine();

        System.out.print("Возраст: ");
        int age = scanner.nextInt();

        System.out.print("Хобби: ");
        String hobby = scanner.next();
        System.out.println();
        // Option 1 (tabular)
        System.out.println("Имя:       " + name + "\n" +
                "Город:     " + city + "\n" +
                "Возраст:   " + age + "\n" +
                "Хобби:     " + hobby);

        System.out.println();
        // Option 2 (text)
        System.out.println("Человек по имени " + name + " живет в городе " + city + "\n" +
                "Этому человеку " + age + " лет и любит он заниматься " + hobby);

        System.out.println();
        //Option 3 (other)
        System.out.println(name + " - Имя" + "\n" +
                city + " - Город" + "\n" +
                age + " - Возвраст" + "\n" +
                hobby + " - Хобби");
        }
}
