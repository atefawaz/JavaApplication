package java_practice;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class CreateFile {

	public static void main(String[] args) {
		
		Path filepath = Path.of("/Users/ateffawaz/Documents/EPITA/java/testing.txt");
		
		try { 
			Files.createFile(filepath);
			
			System.out.println("File has been created successfuly ");
			
		} catch (IOException e) {
			
			System.err.println("An error occured" + e.getMessage());
		}
		
		
		try {
			
		    String content =  "THanks to Java !";
		    
		    Files.write(filepath, content.getBytes(), StandardOpenOption.WRITE);
		    
		    System.out.println("Content written to the file.");
		    
		} catch (IOException e) {
			
		    System.err.println("An error occurred while writing content: " + e.getMessage());
		}

		
		

	}

}
