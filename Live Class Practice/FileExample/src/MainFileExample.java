import java.io.File;
public class MainFileExample {

    public static void main(String[] args) {

        FileExample FileExample = new FileExample();
        FileExample.DeleteFileIfExists("text.txt");
        File myFile = FileExample.CreateFile("text.txt");
        FileExample.WriteFile("Hello world! LOL");

    }
}
