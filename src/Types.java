import java.util.Scanner;

public class Types {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String s = scanner.nextLine();

        int x = Integer.parseInt(s);
        double y = (double) x;

        System.out.print("Число типа string: " + s + "\n" +
                "Число типа int: " + x + "\n" +
                "Число типа double: " + y);

    }
}
