import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Update {
    

    /**
     * @param username
     * @param newRank
     * @param newExperience
     * @param stars
     * @throws IOException
     */
    //updates the information in the file 
    public static void updateUserInfo(String username, int newRank, int newExperience, int stars) throws IOException {
        File file = new File("Users.txt");
        List<String> lines = new ArrayList<>();
        int[] t = checkLevel(newRank, newExperience,stars);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                if (parts[0].equals(username)) {
                    // update the information
                    parts[1] = Integer.toString(t[0]);
                    parts[2] = Integer.toString(t[1]);
                    parts[3] = Integer.toString(t[2]);
                    // rebuilds the line
                    line = parts[0] + " " + parts[1] + " " + parts[2] + " " + parts[3];
                }
                lines.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        FileWriter writer = new FileWriter(file, false);
        for (String line : lines) {
            writer.write(line + "\n");
        }
        writer.close();
    }
    
    /**
     * @param newRank
     * @param newExperience
     */
    private static int[] checkLevel(int newRank, int newExperience, int stars) {

        
        int[] exp = {0,100,305,510,715,920,1025,1330,1535,1770,1905,2352,2579,2752,2965,3252,3475,3750,4000,4200,4495,4670,4894,5152,5452,5760,6020,6305,6803,7500};
        int star = 3;
        int[] checkLevelArray = new int[3];
        if(newExperience >= exp[newRank]){
            newRank++;
           stars += star;
        
            checkLevelArray[0] = newRank;
            checkLevelArray[1] = newExperience;
            checkLevelArray[2] = stars;
        }
        else{
            checkLevelArray[0] = newRank;
            checkLevelArray[1] = newExperience;
            checkLevelArray[2] = stars;
        }

      
        return checkLevelArray;
        }
        /**
         * @param username
         * @param newRank
         * @param newExperience
         * @return
         */
        //prints the level up information on the terminal
        public static int[] levelUpPrint(String username,int newRank, int newExperience) {

            int stars = 0;
            int[] exp = {0,100,305,510,715,920,1025,1330,1535,1770,1905,2352,2579,2752,2965,3252,3475,3750,4000,4200,4495,4670,4894,5152,5452,5760,6020,6305,6803,7500};
            int[] levelUpArray = new int[3];
            if(newExperience >= exp[newRank]){
                newRank++;
                levelUpArray[0] = newRank;
                levelUpArray[1] = newExperience;
                stars += 3;
            
              
                levelUpArray[2] = stars;
                System.out.println("\n"+username + " you leveled up to level " + newRank + "\n You also gained " +stars + " stars");

            }
           
            else{
                int requiredExp = exp[newRank] - newExperience;
                int nextLevel = newRank + 1;
                System.out.println("\n"+username + " you have to earn " + requiredExp + " more to get to level " + nextLevel+". \nKeep playing!");

                levelUpArray[0] = newRank;
                levelUpArray[1] = newExperience;
                levelUpArray[2] = stars;
            }
    
          
            return levelUpArray;
            }
    }

