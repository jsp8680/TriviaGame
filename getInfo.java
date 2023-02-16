import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class getInfo {
 
    //gets the current information from the file
    public static int[] getCurrentLevel(String username) throws FileNotFoundException {
        

        File file = new File("Users.txt");
        Scanner scanner = new Scanner(file);
        String currentUser = username;
        int[] ans = new int[3];
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String user = parts[0];
            String level = parts[1];
            String exp = parts[2];
            String stars  = parts[3];
            if (user.equals(currentUser)) {
                // Store's the current user's information in variables
                int currentLevel = Integer.parseInt(level);
                
                int currentExperience = Integer.parseInt(exp);
              
                int currentStars = Integer.parseInt(stars);
                
                ans[0] = currentLevel;
                ans[1] = currentExperience;
                ans[2] = currentStars;
                
               
                
            }
        }
        scanner.close();
        return ans;
    }
    }