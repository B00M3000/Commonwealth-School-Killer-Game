import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class KillerGameImporter {
  public static Player[] importCSV(String pathname){
    ArrayList<Player> players = new ArrayList<Player>();
    try {
      File file = new File(pathname);
      Scanner reader = new Scanner(file);
      reader.hasNextLine()
      while (reader.hasNextLine()) {
        
      }
      reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("No file found at given pathname.");
      e.printStackTrace();
    }
    return players.toArray(new Player[players.size()]);
  }
}
