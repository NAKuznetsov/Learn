import java.util.Scanner;

public class Bubble{
    public static void main(String ... args){

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        n = scan.nextInt();
        int a[] = new int[n];

        System.out.println("Введите значения массива:");
        for(int i=0; i<n; i++)
        {
            a[i]=scan.nextInt();
        }

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    int c;
                    c=a[j];
                    a[j]=a[j+1];
                    a[j+1]=c;
                }
            }
        }

        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}