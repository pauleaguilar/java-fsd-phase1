import java.io.File;
import java.util.Scanner;
public class FileHandling {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File test.txt will be created.");
        String fileName= "test.txt";
        System.out.println("Enter text to write to file: ");
        String scanText = scan.nextLine();
        scan.close();

        CreateFile createFile = new CreateFile(fileName);
        File newFile = createFile.createaFile();

        WriteFile w = new WriteFile(scanText, newFile);
        w.Write();
        w.append();
    }

}
