package org.example.virtualkey.services;
import java.io.File;
import org.example.virtualkey.entities.Directory;


public class DirectoryService {
private static Directory fileDirectory = new Directory();
    
    public static Directory getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(Directory fileDirectory) {
        DirectoryService.fileDirectory = fileDirectory;
    }

    public static void ViewFolder(){
    	 File dir = new File("C:/Users/paule/VirtualKeyFiles");
    	 for(String filename : dir.list()) {
    		 System.out.println(filename);
    	 }
    }
}

 
