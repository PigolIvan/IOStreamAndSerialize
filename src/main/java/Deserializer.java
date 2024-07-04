import java.io.*;

public class Deserializer {
    public void Decerialize() throws IOException, ClassNotFoundException {
        FileInputStream fileLoad = new FileInputStream("C:\\Users\\SystemX\\IdeaProjects\\Serializer\\UserData.ser");
        ObjectInputStream in = new ObjectInputStream(fileLoad);
        User user;
        user = (User) in.readObject();
        in.close();
        fileLoad.close();
        System.out.println(user.toString());
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("serialVersionUID = " + serialVersionUID);
    }
}
