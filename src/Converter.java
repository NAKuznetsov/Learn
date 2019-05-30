import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Это конвертер валют RUB -> USD. Введите текущий курс доллара:");
        double cours = sc.nextDouble();

        System.out.println("Введите сумму в рублях:");
        double rub = sc.nextDouble();

        double dollar = rub / cours;

        System.out.printf("После конвертвции RUB -> USD вы получите следующую сумму: %.2f " + "$", dollar);

    }
}
