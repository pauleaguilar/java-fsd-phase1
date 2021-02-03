import java.io.File;
import java.io.IOException;

public class FileExample {
    private File myFile;


    public void CreateFile(String fileName) {

        try {
            myFile = new File(fileName);
            if (myFile.exists()) {
                System.out.print("file exists");
                return;
            }
            myFile.createNewFile();

        }
        catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
