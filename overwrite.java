import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class overwrite {
    public static void t(String username, int startLevel, int level,int beginingExp, int exp) throws IOException{
        //Instantiating the File class
        String filePath = "Users.txt";
        //Instantiating the Scanner class to read the file
        Scanner sc = new Scanner(new File(filePath));
        //instantiating the StringBuffer class
        StringBuffer buffer = new StringBuffer();
        //Reading lines of the file and appending them to StringBuffer
        while (sc.hasNextLine()) {
           buffer.append(sc.nextLine()+System.lineSeparator());
        }
        String fileContents = buffer.toString();
        
      
        StringBuilder r = new StringBuilder();
        r.append(username + " ");
        r.append(level + " ");
        r.append(exp);
        sc.close();
        // String oldLine = user + " " + exp + " " + level;
        // String oldLine = "CensedPower8 1 60";
        StringBuilder s = new StringBuilder();
        r.append(username + " ");
        r.append(startLevel + " ");
        r.append(beginingExp);
        String oldLine = s.toString();


        String newLine = r.toString();
        //Replacing the old line with new line
        fileContents = fileContents.replaceAll(oldLine, newLine);
        //instantiating the FileWriter class
        FileWriter writer = new FileWriter(filePath);
        System.out.println("");
        System.out.println("new data: "+fileContents);
        writer.append(fileContents);
        writer.flush();
     }
}
