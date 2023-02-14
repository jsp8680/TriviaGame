
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;




public class TriviaGame1 {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args)  throws IOException {
        // Scanner to read file input

       ArrayList<Question> questions = new ArrayList<>();
       int playerOnePoints = 0;
       int playerTwoPoints = 0;
       
       // Scanner to scan keyboard input
       Scanner scan = new Scanner(System.in);
       Scanner sc2 = new Scanner(System.in);
    
        int experience1 = 0;
        int experience2 = 0;
     

  
       //Finds the file & creates object instances of each question and pass them into an ArrayList
       File mediumfile = new File("normalDifficultyQ's.txt");
       File easyFile = new File("Q.txt");
       File hardFile = new File("quest.txt");

       String user2;
   String user1;
   String username;
   String username2;
   
     Scanner scanner = new Scanner(System.in);
    System.out.println("Enter username of player one: ");
    username = scanner.nextLine();
    user1 =  readFile.userCheck(username);


    System.out.println("Enter username of player two: ");
    username2 = scanner.nextLine();
   user2 =  readFile.userCheck(username2);
//    System.out.println(user2);
   int[] user1Info = getInfo.getCurrentLevel(user1);
//    System.out.println(user1 + " level is " + user1Info[0] + " and experience is " + user1Info[1]);
   
   int[] user2Info = getInfo.getCurrentLevel(user2);
//    System.out.println(user2 + " level is " + user2Info[0] + " and experience is " + user2Info[1]);


if(user1Info[0] >= 5 || user2Info[0] >= 5){

       try {

           Scanner sc = new Scanner(mediumfile);
           // while loop until file has line
           while (sc.hasNextLine()) {
               // read the line
            
               String question = sc.nextLine();
               String firstAnswer = sc.nextLine();
               String secondAnswer = sc.nextLine();
               String thirdAnswer = sc.nextLine();
               String fourthAnswer = sc.nextLine();
               String correctAnswer = sc.nextLine();
         



               questions.add(
                       new Question(question, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer, correctAnswer));
           }
           sc.close();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       try {

        Scanner sc = new Scanner(easyFile);
        // while loop until file has line
        while (sc.hasNextLine()) {
            // read the line
         
            String question = sc.nextLine();
            String firstAnswer = sc.nextLine();
            String secondAnswer = sc.nextLine();
            String thirdAnswer = sc.nextLine();
            String fourthAnswer = sc.nextLine();
            String correctAnswer = sc.nextLine();
      



            questions.add(
                    new Question(question, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer, correctAnswer));
        }
        sc.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    }
    else if(user1Info[0] > 6 && user1Info[1] > 6){
        try {

            Scanner sc = new Scanner(hardFile);
            // while loop until file has line
            while (sc.hasNextLine()) {
                // read the line
             
                String question = sc.nextLine();
                String firstAnswer = sc.nextLine();
                String secondAnswer = sc.nextLine();
                String thirdAnswer = sc.nextLine();
                String fourthAnswer = sc.nextLine();
                String correctAnswer = sc.nextLine();
          
 
 
 
                questions.add(
                        new Question(question, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer, correctAnswer));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    else{
        try {

            Scanner sc = new Scanner(easyFile);
            // while loop until file has line
            while (sc.hasNextLine()) {
                // read the line
             
                String question = sc.nextLine();
                String firstAnswer = sc.nextLine();
                String secondAnswer = sc.nextLine();
                String thirdAnswer = sc.nextLine();
                String fourthAnswer = sc.nextLine();
                String correctAnswer = sc.nextLine();
          
 
 
 
                questions.add(
                        new Question(question, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer, correctAnswer));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
       
    
   

while(true) {
   
    List<Question> usedQuestions = new ArrayList<>();
     playerOnePoints = 0;
     playerTwoPoints = 0;
    user1Info = getInfo.getCurrentLevel(user1);
           System.out.println(user1 + " level is " + user1Info[0] + " and experience is " + user1Info[1] + " and there are " + user1Info[2] + " stars.");
           
           user2Info = getInfo.getCurrentLevel(user2);
           System.out.println(user2 + " level is " + user2Info[0] + " and experience is " + user2Info[1] +" and there are " + user2Info[2] + " stars.");
       for (int i = 0; i < 12; i++) {
        Random random = new Random();
        
        int questionIndex = random.nextInt(questions.size());

        while (usedQuestions.contains(questions.get(questionIndex))) {
            questionIndex = random.nextInt(questions.size());
        }
    
       
        usedQuestions.add(questions.get(questionIndex));

        
           // Assign every other question to player one
      if (i % 2 == 0) {
          
            if(user1Info[2] >= 3){
              
                System.out.println("\nYou have enough stars for 50-50 which removes two incorrect answers \nEnter 50 to use it.");
            }
               System.out.println(user1 +", please answer the following" + " question:\n");
               
               System.out.println(questions.get(questionIndex).toString());
               String answer = scan.next();
              
               
               
                    if (answer.equalsIgnoreCase(questions.get(questionIndex).getCorrectAnswer())) {
                        playerOnePoints++;
                       
                        System.out.println("You got it right! You have " + playerOnePoints + " point(s).\n");
                       
                        
                    }
                    else {
                         
                        System.out.println("Sorry, that was incorrect! You have " + playerOnePoints + " point(s).\n");
                        if(user1Info[2] >= 3){
                            while(true){
                            System.out.println("You can retry! It will cost 3 stars \n");
                            System.out.println("Enter S for a second chance or enter any letter to move on.\n");
                            answer = scan.next();
                            if(answer.equalsIgnoreCase("S")){
                                System.out.println(user1 +", please answer the following" + " question:\n");
                                System.out.println(usedQuestions.get(usedQuestions.size() - 1).toString());
                                answer = scan.next();
                                user1Info[2] -= 3;
                                if (answer.equalsIgnoreCase(usedQuestions.get(usedQuestions.size() - 1).getCorrectAnswer())) {
                                    playerOnePoints++;
                                   
                                    System.out.println("You got it right! You have " + playerOnePoints + " point(s).\n");
                                    break;
                                    
                                    
                                } else {
                                    
                                    System.out.println("Sorry, that was incorrect! You have " + playerOnePoints + " point(s).\n");
                                    break;
                                }
                            }
                            
                                
                            }
                        }
                        }
                }
                     
                        
           
    
           else { // Assign every other question to player two

               System.out.println( user2+ ", please answer the following" + " question:\n");
               System.out.println(questions.get(questionIndex).toString());
               String answer = scan.next();
               
               if (answer.equalsIgnoreCase(questions.get(questionIndex).getCorrectAnswer())) {
                   playerTwoPoints++;
                   System.out.println("You got it right! You have " + playerTwoPoints + " point(s).\n");
                
                
               } else {
                   System.out.println("Sorry, that was incorrect! You have " + playerTwoPoints + " point(s).\n");
                   if(user2Info[2] >= 3){
                    while(true){
                    System.out.println("You can retry! It will cost 3 stars \n");
                    System.out.println("Enter S for a second chance or enter any letter to move on");
                    answer = scan.next();
                    if(answer.equalsIgnoreCase("S")){
                        System.out.println(user2 +", please answer the following" + " question:\n");
                        System.out.println(usedQuestions.get(usedQuestions.size() - 1).toString());
                        answer = scan.next();
                        user2Info[2] -= 3;
                        if (answer.equalsIgnoreCase(usedQuestions.get(usedQuestions.size() - 1).getCorrectAnswer())) {
                            playerTwoPoints++;
                           
                            System.out.println("You got it right! You have " + playerTwoPoints + " point(s).\n");
                          break;
                            
                        } else {
                            
                            System.out.println("Sorry, that was incorrect! You have " + playerTwoPoints + " point(s).\n");
                            break;
                        }
                    
                    }
                    else{
                      System.out.println("Moving on...");
                      break;
                    }
               }
           }
        }
    }
    }

    String result = "";
       // Decide who wins
       if (playerOnePoints > playerTwoPoints) {
           System.out.println(user1+ " wins!");
           result += user1 + " wins!";

       
       } else if(playerOnePoints == playerTwoPoints) {
        System.out.println("");
        result += user1 + " and " + user2 + " tie!";
       }
       else{
           System.out.println(user2 + " wins!");
           result += user2 + " wins!";

       }
    //    System.out.println(playerOnePoints * 100);
    //    System.out.println(playerOnePoints * 100);

    try{
        FileWriter fstream = new FileWriter("log.txt",true);
        BufferedWriter out = new BufferedWriter(fstream);
        out.write(result);
        out.close();
    }catch (Exception e){
       System.err.println("Error while writing to file: " +
            e.getMessage());
    }

experience1 = playerOnePoints * 20 + user1Info[1];

experience2 = playerTwoPoints * 20 + user2Info[1];




Update.updateUserInfo(user1, user1Info[0], experience1, user1Info[2]);

Update.updateUserInfo(user2, user2Info[0], experience2, user2Info[2]);

Update.levelUpPrint(user1, user1Info[0], experience1);
Update.levelUpPrint(user2, user2Info[0], experience2);






System.out.println("Do you want to play again?");
String input = scan.nextLine();
if (!scan.nextLine().equalsIgnoreCase("yes")) {
    break;
}
    }   
    }
}



