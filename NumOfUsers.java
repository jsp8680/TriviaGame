import java.util.Scanner;

public class NumOfUsers{
    public static void howManyUsers(int count) {
    // System.out.println("Enter number of users 1-4:");
    Scanner sc = new Scanner(System.in);
    // count = sc.nextInt();
    

   while(checkVal.checkValue(count) == false){

    
        System.out.println("Invalid number of users Retry\n ");
        System.out.println("Enter number of users 1-4:");
         count = sc.nextInt();
         
   }
   


   
    
    
}

}
