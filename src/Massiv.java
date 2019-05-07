import java.util.Scanner;

public class Massiv {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int size = in.nextInt();
        int array[] = new int[size];

        System.out.println("Укажите значения для записи в массив:");
        for (int i = 0; i < size; i++)
        {
            array[i] = in.nextInt () * 2;
        }

        System.out.println ("В массиве присутствуют следующие значения:");
        for (int i = 0; i < size; i++)
        {
            System.out.println (array[i]);
        }

    }
}
