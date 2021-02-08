import java.io.File;
import java.io.IOException;

public class CreateFile {

    private File myFile;
    private String fileName;
    //getter for myFile
    public File getMyFile() {
        return myFile;
    }

    public CreateFile(String fileName){
        this.fileName = fileName;
    }

    public File createaFile() {
        try {
            myFile = new File(fileName);
            if (myFile.exists()) {
                System.out.println(fileName + " already exists");
                return (myFile);
            }

            myFile.createNewFile();
            System.out.println(fileName + " created");

        }
        catch( Exception ex) {
            System.err.println(ex.getMessage());
        }
        return myFile;
    }




}
