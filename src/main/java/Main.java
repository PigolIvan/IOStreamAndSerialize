import java.io.*;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // перевірка 1 пункта(output.txt)
        Scanner scanner = new Scanner(System.in);
        Writer IOstream = new Writer();
        System.out.println("Введіть назву файла(Наприклад, file.txt)");
        String file = scanner.nextLine();
        IOstream.WriteLine(file, scanner);
        IOstream.ReadLine(file);
        // перевірка 2 пункта(source.txt і destination.txt)
        IOstream.ReadLine("source.txt");
        // 3 пункта (Десеріалізація)
        Deserializer deserializer = new Deserializer();
        deserializer.Decerialize();
   }
}
