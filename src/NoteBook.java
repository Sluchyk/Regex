import java.util.Scanner;

public class NoteBook {
    private String REGEX_NAME = "^[A-Z][a-z]{1,20}$";
    private String  FORMAT_NAME = "first name in format [A-Z][a-z]{1,20}";
    private String REGEX_DATA ="your login in format [A-Za-z0-9_-]{8,20}";
    private String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
    private View view;
    private Scanner scanner;
    NoteBook(View view,Scanner scanner)
    {
        this.view = view;
        this.scanner=scanner;

    }
    private String name;
    private String login;
 public void inputNote()
 {
     ControlInput controlInput=new ControlInput(view,scanner);
     this.name=controlInput.inputStrinWithScanner(FORMAT_NAME,REGEX_NAME);
     this.login=controlInput.inputStrinWithScanner(REGEX_DATA,REGEX_LOGIN);
 }


}
