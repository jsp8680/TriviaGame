

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;






public class Main {

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
       
    
        int experience1 = 0;
        int experience2 = 0;
     

  
       //Finds the file & creates object instances of each question and passes them into an ArrayList
       File mediumFile = new File("normalDifficultyQ's.txt");
       File easyFile = new File("generalKnowledge.txt");
       File hardFile = new File("hardQuestions.txt");

    String user2;
   String user1;
   String username;
   String username2;
   System.out.println("If you have any issues or questions about the game please read the help.txt or click this link: https://github.com/jsp8680/TriviaGame/blob/main/help.txt \n");
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter username of player one: ");
   username = scanner.nextLine();
   user1 =  readFile.userCheck(username);


   System.out.println("Enter username of player two: ");
   username2 = scanner.nextLine();
  user2 =  readFile.userCheck(username2);

  //gets the current information
  int[] user1Info = getInfo.getCurrentLevel(user1);

  
  int[] user2Info = getInfo.getCurrentLevel(user2);




if(user1Info[0] <= 6 || user2Info[0] <= 6 ){

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
    else if(user1Info[0] >= 12 && user2Info[0] >= 12){

        try {

            Scanner sc = new Scanner(mediumFile);
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
        try {

            Scanner sc = new Scanner(mediumFile);
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
     // is used to update the information about the players after every game until the loop is exited
        user1Info = getInfo.getCurrentLevel(user1);
           System.out.println(user1 + " you're at level " + user1Info[0] + ", you have " + user1Info[1] + " experience and you have " + user1Info[2] + " stars.\n");
           
           user2Info = getInfo.getCurrentLevel(user2);
           System.out.println(user2 + " you're at level " + user2Info[0] + ", you have " + user2Info[1] +" experience and you have " + user2Info[2] + " stars.");
          

         
       for (int i = 0; i < 10; i++) {

        // randomizes the questions 
        Random random = new Random();
        
        int questionIndex = random.nextInt(questions.size());

        // moves already used questions to remove them from the original list
        while (usedQuestions.contains(questions.get(questionIndex))) {
            questionIndex = random.nextInt(questions.size());
        }
    
       
        usedQuestions.add(questions.get(questionIndex));

        
    // Assign's every other question to player one
      if (i % 2 == 0) {
          
        //checks if player one has 3 or more stars to use for 50-50 if not it isn't printed out
            if(user1Info[2] >= 3){
              
                System.out.println("\nYou have enough stars for 50-50 which removes two incorrect answers \nEnter 50 to use it.");
            }
               System.out.println("\n"+user1 +", please answer the following" + " question:\n");
               // prints the questions
               System.out.println(questions.get(questionIndex).toString());
               String answer = scan.next();
              
               
               
                    if (answer.equalsIgnoreCase(questions.get(questionIndex).getCorrectAnswer())) {
                        playerOnePoints++;
                       
                        System.out.println("You got it right! You have " + playerOnePoints + " point(s).\n");
                       
                        
                    }
                   

                    else if(answer.equals("50")){
                        // if user 1 has 3 or more stars then 
                        if(user1Info[2]>= 3){
                         int number = Check.checkForCorrectAnswer(questions.get(questionIndex).getCorrectAnswer());
                     user1Info[2] -= 3;
                         // if number equals 1 then answer is a/A else number equals 2 and answer is b/B
                         if(number == 1 || number == 2){
                            System.out.println(questions.get(questionIndex).toString2());
                            answer = scan.next();
                         }
                         // else number equals either 3 or 4 and prints out c). text d). text
                         else{
                            System.out.println(questions.get(questionIndex).toString3());
                            answer = scan.next();
                         }
                            if(answer.equalsIgnoreCase(questions.get(questionIndex).getCorrectAnswer())) {
                                playerOnePoints++;
                               
                                System.out.println("You got it right! You have " + playerOnePoints + " point(s).\n");
                               
                                
                            }
                            else {
                         
                                System.out.println("Sorry, that was incorrect! You have " + playerOnePoints + " point(s).\n");
                        }
                    }
                    // if user enters 50 and doesn't have enough stars this is printed out
                    else{
                        while(true){
                    System.out.println("You don't have enough stars answer question.\n");

                    System.out.println(user1 +", please answer the following" + " question:\n");
                    // prints the questions
                    System.out.println(questions.get(questionIndex).toString());
                    answer = scan.next();
                   
                    
                    
                         if (answer.equalsIgnoreCase(questions.get(questionIndex).getCorrectAnswer())) {
                             playerOnePoints++;
                            
                             System.out.println("You got it right! You have " + playerOnePoints + " point(s).\n");
                            break;
                             
                         } else if(answer.equals("50")){
                            
                            continue;
                         }
                         else{
                            System.out.println("Sorry, that was incorrect! You have " + playerOnePoints + " point(s).\n");
                            break;
                         }
                        }
                    } 
                }
                    else {
                         
                        System.out.println("Sorry, that was incorrect! You have " + playerOnePoints + " point(s).\n");
                   // if user one has 3 or more stars then they are given the chance to use the stars to retry the question
                        if(user1Info[2] >= 3){
                            // 
                            while(true){
                            System.out.println("You can retry! It will cost 3 stars \n");
                            System.out.println("Enter S for a second chance or enter any letter to move on.\n");
                            answer = scan.next();
                            if(answer.equalsIgnoreCase("S")){
                                System.out.println(user1 +", please answer the following" + " question:\n");
                                //grabs the last question used and prints it out
                                System.out.println(usedQuestions.get(usedQuestions.size() - 1).toString());
                                answer = scan.next();
                                // removes 3 stars from user one
                                user1Info[2] -= 3;
                                // grabs the last question and it's answer to check whether it's correct or not
                                if (answer.equalsIgnoreCase(usedQuestions.get(usedQuestions.size() - 1).getCorrectAnswer())) {
                                    playerOnePoints++;
                                   
                                    System.out.println("You got it right! You have " + playerOnePoints + " point(s).\n");
                                    break;
                                    
                                    
                                } else {
                                    
                                    System.out.println("Sorry, that was incorrect! You have " + playerOnePoints + " point(s).\n");
                                    break;
                                }
                            }
                            else{
                                System.out.println("\nMoving on...\n");
                                break;
                              }
                                
                            }
                        }
                        }
                }
                     
                        
           
        // Assign's every other question to player two
           else { 
                //checks if player two has 3 or more stars to use for 50-50 if not it isn't printed out
                if(user2Info[2] >= 3){
              
                    System.out.println("\nYou have enough stars for 50-50 which removes two incorrect answers \nEnter 50 to use it.");
                }
               System.out.println("\n"+user2+ ", please answer the following" + " question:\n");
                // prints the questions
               System.out.println(questions.get(questionIndex).toString());
               String answer = scan.next();
               
               if (answer.equalsIgnoreCase(questions.get(questionIndex).getCorrectAnswer())) {
                   playerTwoPoints++;
                   System.out.println("You got it right! You have " + playerTwoPoints + " point(s).\n");
                
                
               }     else if(answer.equals("50")){
                // if user 2 has 3 or more stars then 
                if(user2Info[2] >= 3){
                    user2Info[2] -=3 ;
                 int number = Check.checkForCorrectAnswer(questions.get(questionIndex).getCorrectAnswer());
                
                 // if number equals 1 then answer is a/A else number equals 2 and answer is b/B
                 if(number == 1 || number == 2){
                    System.out.println(questions.get(questionIndex).toString2());
                    answer = scan.next();
                 }
                 // else number equals either 3 or 4 and prints out c). text d). text
                 else{
                    System.out.println(questions.get(questionIndex).toString3());
                    answer = scan.next();
                 }
                    if(answer.equalsIgnoreCase(questions.get(questionIndex).getCorrectAnswer())) {
                        playerTwoPoints++;
                       
                        System.out.println("You got it right! You have " + playerTwoPoints + " point(s).\n");
                       
                        
                    }
                    else {
                 
                        System.out.println("Sorry, that was incorrect! You have " + playerTwoPoints + " point(s).\n");
                }
            }
            // if user enters 50 and doesn't have enough stars this is printed out
            else{
                while(true){
            System.out.println("You don't have enough stars answer question.\n");

            System.out.println(user2+", please answer the following" + " question:\n");
            // prints the questions
            System.out.println(questions.get(questionIndex).toString());
            answer = scan.next();
           
            
            
                 if (answer.equalsIgnoreCase(questions.get(questionIndex).getCorrectAnswer())) {
                     playerTwoPoints++;
                    
                     System.out.println("You got it right! You have " + playerTwoPoints + " point(s).\n");
                    break;
                     
                 } else if(answer.equals("50")){
                    
                    continue;
                 }
                 else{
                    System.out.println("Sorry, that was incorrect! You have " + playerTwoPoints + " point(s).\n");
                    break;
                 }
                }
            } 
        }
                else {
                   System.out.println("Sorry, that was incorrect! You have " + playerTwoPoints + " point(s).\n");
                   // if user two has 3 or more stars then they are given the chance to use the stars to retry the question
                   if(user2Info[2] >= 3){
                    while(true){
                    System.out.println("You can retry! It will cost 3 stars \n");
                    System.out.println("Enter S for a second chance or enter any letter to move on");
                    answer = scan.next();
                    if(answer.equalsIgnoreCase("S")){
                        System.out.println(user2 +", please answer the following" + " question:\n");
                         //grabs the last question used and prints it out
                        System.out.println(usedQuestions.get(usedQuestions.size() - 1).toString());
                        answer = scan.next();
                        // removes 3 stars from user 2
                       user2Info[2] -= 3;
                        

                         // grabs the last question and it's answer to check whether it's correct or not
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
                      System.out.println("\nMoving on...\n");
                      break;
                    }
               }
           }
        }
    }
    }

    // decides who wins and prints it out as well as writing to the log.txt file
    String result = "";
      
       if (playerOnePoints > playerTwoPoints) {
           System.out.println(user1+ " wins!");
           result += user1 + " wins!";
           user1Info[1] += 50;

       
       } else if(playerOnePoints == playerTwoPoints) {
        System.out.println("It's a tie!");
        result += user1 + " and " + user2+ " tie!";

       }
       else{
           System.out.println(user2+ " wins!");
           result += user2 + " wins!";
        user2Info[1] += 50;
       }
  
//prints out the result of the game
    try{
        FileWriter fstream = new FileWriter("log.txt",true);
        BufferedWriter out = new BufferedWriter(fstream);
        out.write(result + "\n");
        out.close();
    }catch (Exception e){
       System.err.println("Error while writing to file: " +
            e.getMessage());
    }

// players experience is calculated based on the number of points * 20 and adds the current experience from the file

experience1 = playerOnePoints * 20 + user1Info[1];

experience2 = playerTwoPoints * 20 + user2Info[1];




// updates users information (name, level, experience, stars)
Update.updateUserInfo(user1, user1Info[0], experience1, user1Info[2]);

Update.updateUserInfo(user2, user2Info[0], experience2, user2Info[2]);


// prints out whether a player levels up or prints out how much experience is still required to get to the next level

Update.levelUpPrint(user1, user1Info[0], experience1);

Update.levelUpPrint(user2, user2Info[0], experience2);

if(user2Info[0] >= 6 && user1Info[0] >= 6){
    System.out.println("\nYou reached level 6! Remember to quit the game to move on to the more difficult questions.\n");
}

if(user2Info[0] >= 12 && user1Info[0] >= 12){
    System.out.println("\nYou reached level 12! Remember to quit the game to move on to the more difficult questions.\n");
}




// if user wants to keep playing they enter yes or any other letter to QUIT and the game then repeats from the beginning
System.out.println("Do you want to play again? Enter yes or enter any letter to QUIT game.");
System.out.println("*Remember to QUIT regularly to play again with harder questions.");
    scan.nextLine();
if (!scan.nextLine().equalsIgnoreCase("yes")) {
    System.out.println("QUITING. Come back soon!");
    break;
}


    }   
    }
}



