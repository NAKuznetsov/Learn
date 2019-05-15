import java.util.Scanner;

public class SravnStrok {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String a = sc.nextLine();

        System.out.println("Введите вторую строку: ");
        String b = sc.nextLine();

        int lenA = a.length();
        int lenB = b.length();

        if (lenA > lenB)
        {
            System.out.println("В этой строке больше символов: " + a);
        }
        else if (lenA < lenB)
        {
            System.out.println("В этой строке больше символов: " + b);
        }

    }
}
