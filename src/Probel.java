import java.util.Scanner;

public class Probel {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String s = sc.nextLine();

            String x = s.replaceAll(" ", "");
            System.out.println("Результат без пробелов: " + x);
    }
}
