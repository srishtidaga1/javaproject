package PracticeProject7;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class crudOp {
        public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    String filename = "example.txt";
		    File file = new File(filename);
		    try {
		      if (file.createNewFile()) {
		        System.out.println(filename + " created successfully.");
		      } else {
		        System.out.println(filename + " already exists.");
		      }
		      System.out.println("Enter file content:");
		      String content = sc.nextLine();
		      // Write content to file
		      FileUtils.writeFileContent(file, content);
		      // Read file content
		      String fileContent = FileUtils.readFileContent(file);
		      System.out.println("File content: " + fileContent);
		      // Update file content
		      System.out.println("Enter new file content:");
		      String newContent = sc.nextLine();
		      FileUtils.writeFileContent(file, newContent);
		      System.out.println("File content updated.");
		      // Delete file
		      if (file.delete()) {
		        System.out.println(filename + " deleted successfully.");
		      } else {
		        System.out.println("Failed to delete " + filename + ".");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred: " + e.getMessage());
		    }
		  }
		}
        class FileUtils {
		  public static String readFileContent(File file) throws IOException {
		    Scanner scanner = new Scanner(file);
		    String content = "";
		    while (scanner.hasNextLine()) {
		      content += scanner.nextLine() + "\n";
		    }
		    
		    scanner.close();
		    return content;
		  }
		  
		  public static void writeFileContent(File file, String content) throws IOException {
		    java.io.FileWriter writer = new java.io.FileWriter(file);
		    writer.write(content);
		    writer.close();
		  }
		


	}


