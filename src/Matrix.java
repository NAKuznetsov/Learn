import java.util.Scanner;

public class Matrix {

    public static void main(String[] args)
    {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        a = in.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        b = in.nextInt();

        int[][] mass = new int[a][b];

        for (int i = 0; i < mass.length; i++)
        {
            for (int j = 0; j < mass[i].length; j++)
            {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                mass[i][j] = in.nextInt() * 3;
            }
        }

        for (int i = 0; i < mass.length; i++)
        {
            for (int j = 0; j < mass[i].length; j++)
            {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
