import java.util.Scanner;

public class ControlInput {
    private View view;
    private Scanner scanner;
     private String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    // login
    private String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";

    ControlInput(View view, Scanner scanner)
    {
        this.view = view;
        this.scanner = scanner;
    }
       String inputStrinWithScanner(String message,String regex)
       {String res;
           view.printStringInput(message);
           while (!((scanner.hasNext()) && (res = scanner.next()).matches(regex)))
           {
               view.printWrongStringInput(message);
           }
           return  res;
       }

}
