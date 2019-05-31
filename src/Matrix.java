import java.util.Scanner;

public class Matrix {

    public static void main(String[] args)
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        a = sc.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        b = sc.nextInt();

        int[][] mass = new int[a][b];

        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                mass[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < a; j++)
            {
                System.out.print(mass[0][j] * 3 + "\t");
            }
            System.out.println();

    }
}
