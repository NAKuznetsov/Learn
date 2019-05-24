import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Nikita\\Desktop\\read.txt")))
        {
            while ((s=br.readLine())!=null)
            {
                System.out.println(s);
            }
        } catch (IOException exc)
        {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
