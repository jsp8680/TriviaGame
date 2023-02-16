public class Check {
// for 50-50 to print the correct values
    public static int checkForCorrectAnswer(String answer) {

        if(answer.hashCode() == 97 || answer.hashCode() == 65){
            return 1;
        }
        else if(answer.hashCode() == 98 || answer.hashCode() == 66){
            return 2;
        }
        else if(answer.hashCode() == 99 || answer.hashCode() == 67){
            return 3;
        }
        else{
            return 4;
        }
        

       

    }
}
