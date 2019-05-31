import java.io.*;

public class ReadAndWrite {
    public static void main(String[] args) {
        String r;
        String w;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Nikita\\Desktop\\readandwrite.txt")))
        {
            LineNumberReader lineReader = new LineNumberReader(br);
            while (lineReader.readLine() != null)
            {
                count++;
            }

            while ((r=br.readLine())!=null)
            {
                System.out.println(r);
            }

        }
        catch (IOException exc)
        {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

        System.out.println("Количество строк в файле = " + count);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");

        try (FileWriter fw = new FileWriter("C:\\Users\\Nikita\\Desktop\\readandwrite.txt"))
        {
            do
            {
                System.out.print(": ");
                w = br.readLine();

                if (w.compareTo("stop")==0) break;
                w = w + "\r\n";
                fw.write(w);
            }
            while (w.compareTo("stop") !=0);

        }
        catch (IOException exc)
        {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
