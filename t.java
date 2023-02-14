import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class t {
    public static void main(String[] args) throws IOException {
        File file = new File("Users.txt");
FileWriter writer = new FileWriter(file, true);
writer.write("username 1 0\n");
writer.close();


// File file = new File("file.txt");


    }
}
