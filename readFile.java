import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class readFile {

    /**
     * @param username
     * @return
     * @throws IOException
     */
    public static String userCheck(String username) throws IOException {

   String returnValue = "";
     if(checkUsername(username) == true){
      System.out.println("\nWelcome back " + username + "!");
     returnValue += username;
    
     }
      else 
      {
     
      
         System.out.println("The given username does not exist");
         System.out.println("Create a new account: ");
          Scanner scanner = new Scanner(System.in); 
          username = scanner.nextLine();
        while (checkUsername(username) == true){
          System.out.println("The given username is taken \nRetry: ");
          username = scanner.nextLine();
        }
        Print(username);
        System.out.println("\nWelcome " + username + "!\n");
         returnValue += username;
          

          }
      return returnValue;
     
       
       
      }


 
    
      /**
       * @param username
       * @return
       * @throws IOException
       */
      public static boolean checkUsername(String username) throws IOException{
        File f1=new File("users.txt"); 
        String[] words=null;  
        FileReader fr = new FileReader(f1); 
        BufferedReader br = new BufferedReader(fr);
        String s;     
        String input= username;   
        int count=0;   
        while((s=br.readLine())!=null)   
        {
           words=s.split(" "); 
            for (String word : words) 
            {
                   if (word.equals(input))  
                   {
                     count++;    
                   }
            }
        }
        if(count!=0)  
        {
           
           return true;
        }
        else
        {
          return false;
        }
     }
  
  
  
      
      /**
       * @param username
       */
      public static void Print(String username){

          try {

          FileWriter fstream = new FileWriter("users.txt",true);
          BufferedWriter out = new BufferedWriter(fstream);
          out.write(username + " " + 1 + " " + 0 + " " +0 + "\n");
          out.close();
        }
        catch (Exception e){
         System.err.println("Error while writing to file: " +
                e.getMessage());
        }
      }

}

   
    
   
  
