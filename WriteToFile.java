import java.io.BufferedWriter;
import java.io.FileWriter;


public class WriteToFile {
   public static void print(String username){
    try{
        FileWriter fstream = new FileWriter("Users.txt",true);
        BufferedWriter out = new BufferedWriter(fstream);
        out.write(username);
        out.close();
    }catch (Exception e){
       System.err.println("Error while writing to file: " +
            e.getMessage());
    }
    }
    }


