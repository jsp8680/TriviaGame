import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        // Users user = new Users(0, null, 0, 0, 0);
    //   Intro i  = new Intro();
    String username;
    String username2;
    String username3;
    String username4;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of users 1-4:");
    int count = sc.nextInt();
  
   NumOfUsers.howManyUsers(count);
   String[] playerNames = new String[count];
   for (int i = 0; i < count; i++) {
    System.out.print("Enter name of player " + (i + 1) + ": ");
    playerNames[i] = sc.next();
 }

//    if(count == 1){
//     System.out.println("Enter username for player one: ");
//     username = sc.next();
//     print(username);
//    } else if(count == 2){
//     System.out.println("Enter username for player 1: ");
//                 username = sc.next();
//                 print(username);
//             System.out.println("Enter username for player 2: ");
//                 username2 = sc.next();
//                 print(username2);
//    }
//    else if(count == 3){
//     System.out.println("Enter username for player 1: ");
//                     username = sc.nextLine();
//                     print(username);
//                     System.out.println("Enter username for player 2: ");
//                     username2 = sc.nextLine();
//                     print(username2);
//                     System.out.println("Enter username for player 3: ");
//                     username3 = sc.nextLine();
//                     print(username3);
//    }
    // NumOfUsers.howManyUsers();
    // if(count == 1){
    //     System.out.println("Enter username for player 1: ");
    //     username = sc.nextLine();
    //     WriteToFile.print(username);                
    //     // sc.next();
    // }
    // else if(count == 2){
    //     System.out.println("Enter username for player 1: ");
    //                 username = sc.nextLine();
    //                 WriteToFile.print(username);
    //             System.out.println("Enter username for player 2: ");
    //                 username2 = sc.nextLine();
    //                 WriteToFile.print(username2);
    // }
    // else if(count == 3){
    //     System.out.println("Enter username for player 1: ");
    //                 username = sc.nextLine();
    //                 WriteToFile.print(username);
    //                 System.out.println("Enter username for player 2: ");
    //                 username2 = sc.nextLine();
    //                 WriteToFile.print(username2);
    
    //                 System.out.println("Enter username for player 3: ");
    //                 username3 = sc.nextLine();
    //                 WriteToFile.print(username3);
    // }
    // else{
    //           System.out.println("Enter username for player 1: ");
    //         username = sc.nextLine();
    //         WriteToFile.print(username);
    //         System.out.println("Enter username for player 2: ");
    //         username2 = sc.nextLine();
    //         WriteToFile.print(username2);
    
    //         System.out.println("Enter username for player 3: ");
    //         username3 = sc.nextLine();
    //         WriteToFile.print(username3);
    
    //         System.out.println("Enter username for player 4: ");
    //         username4 = sc.nextLine();
    //         WriteToFile.print(username4);
    // }
    //   Intro.checkUsers();  
    }
    public static void print(String username){
        try{
            FileWriter fstream = new FileWriter("Users.txt",true);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(username+" Added on: " + new java.util.Date()+"\n");
            out.close();
        }catch (Exception e){
           System.err.println("Error while writing to file: " +
                e.getMessage());
        }
        }
}
