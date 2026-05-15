
import java.util.Scanner;
import java.util.ArrayList;

public class arrayCount {
  public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<>();
     
     String usrInput = "";
     int values = 0;
      
      while(true) {
          if (usrInput.equals("stop")) {
              list.remove(list.size() -1);
              values = list.size();
              System.out.println("Number of inputs: " + values );
              //System.out.println(list.get(1));
              
              break;
          }else {
              System.out.println("Enter a name");
              usrInput = scanner.nextLine();
              list.add(usrInput);
          }
         
        }
    }
}