import java.util.Scanner;

public class Binar {
    public static void main(String args[]) {

        Scanner sс = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате:");
        int i = sс.nextInt();
        int dec = 0, j = 0;

        while (i != 0)
        {
            dec += ((i % 10) * Math.pow(2, j));
            i = i / 10;
            j++;
        }

        System.out.printf("Число в десятичном формате:\n%d", dec);
    }
}