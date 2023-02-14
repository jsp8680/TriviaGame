import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class getInfo {
 
    
    public static int[] getCurrentLevel(String username) throws FileNotFoundException {
        

  File file = new File("Users.txt");
        Scanner scanner = new Scanner(file);
        String currentUser = username;
        int[] ans = new int[3];
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String user = parts[0];
            String rank = parts[1];
            String otherInfo = parts[2];
            String stars  = parts[3];
            if (user.equals(currentUser)) {
                // Store the current user's information in variables
                int currentRank = Integer.parseInt(rank);
                // String currentRank = rank;
                int currentExperience = Integer.parseInt(otherInfo);
                // String currentExperience = otherInfo;
                int currentStars = Integer.parseInt(stars);
                
                ans[0] = currentRank;
                ans[1] = currentExperience;
                ans[2] = currentStars;
                
               
                break;
            }
        }
        scanner.close();
        return ans;
    }
    }

