import java.io.*;
import java.util.Scanner;

public class Writer {
    public void WriteLine(String file, Scanner scanner){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            System.out.println("Введіть текст який ви хочете добавити");
            String text = scanner.nextLine();
            writer.write(text);
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void ReadLine(String file){
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter("destination.txt"));
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println("Вміст файлу: ");
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
