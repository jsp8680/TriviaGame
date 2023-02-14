import java.io.BufferedWriter;
import java.io.FileWriter;

public class level {
    public static void main(String[] args) {
        for(int i = 1; i < 21; i++) {
            int two  = 2;
           int initial = 250; 
           initial *= two;

           try{
            FileWriter fstream = new FileWriter("level.txt",true);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write("Level " + i + ": " + i * initial + "\n" );
            out.close();
        }catch (Exception e){
           System.err.println("Error while writing to file: " +
                e.getMessage());
        }
            System.out.println("Level " + i + ": " + i * initial );

    }
}
}