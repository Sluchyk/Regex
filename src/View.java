public class View {
    public static String  WRONG_DATA="WRONG DATA";
    public static   String NICKNAME="NICKNAME: ";
    public   static String NAME="NAME: ";
    public static String WRONG_INPUT_DATA="WRONG INPUT DATA: ";
    public static  String INPUT="Input ";
    public void printMessage (String message){
        System.out.println(message);
    }

    public String concatenationString (String... message){
        StringBuilder concatString = new StringBuilder();
        for (String v : message){
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
    public void printWrongStringInput(String message) {
        printMessage(concatenationString(WRONG_INPUT_DATA,INPUT,message));
    }
    public void printStringInput(String message) {
        printMessage(concatenationString(INPUT,message));
    }

}
