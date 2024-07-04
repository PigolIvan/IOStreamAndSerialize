import java.io.*;

public class Serialize {
    public static void main(String[] args) throws IOException{
        //  3 пункта (Серіалізація)
        User user = new User("Potluck", "cpqldr98");

        //Серіалізація
        FileOutputStream fileSave = new FileOutputStream("UserData.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileSave);
        out.writeObject(user);
        out.close();
        fileSave.close();
        System.out.println("Інформація про об'єкт була збережена");
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("serialVersionUID = " + serialVersionUID);
    }
}
