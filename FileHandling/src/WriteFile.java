import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class WriteFile {


    FileWriter write;
    private String textToWrite;
    File myFile;

    public WriteFile(String textToWrite, File myFile) {
        this.textToWrite = textToWrite;
        this.myFile = myFile;
    }


    public void Write() {

        try {
            write = new FileWriter(myFile);
            write.write(textToWrite);
            System.out.println("Successfully wrote to the file");
        }
        catch (IOException iex) {
            System.err.println("failed writing to file");

        }
        catch (NullPointerException npe) {
            System.err.println("File does not exist yet.");

        }
        finally {
            try {
                if (write != null) {
                    write.flush();
                    write.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void append() {
        FileWriter fw = null;
        try {
            fw = new FileWriter(myFile, true); //the true will append the new data
            fw.write("\nthis text has been appended to the file\n");//appends the string to the file

        }
        catch (IOException e) {
            System.err.println(e);
        }
        finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}