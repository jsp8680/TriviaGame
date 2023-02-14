import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class r {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Users.txt");
Scanner scanner = new Scanner(file);
String dusername = "CensedPower8";
while (scanner.hasNextLine()) {
    
    String line = scanner.nextLine();
    String[] parts = line.split(" ");
    String username = parts[0];
    String rank = parts[1];
    String otherInfo = parts[2];
    if(username.equals(dusername)){
        System.out.println(parts[0] + " " + parts[1] + " " + parts[2]);
    }
    // Do something with the data
    
}
scanner.close();

    }
}
