public class View {
    private final String  WRONG_DATA="WRONG DATA";
    private final  String NICKNAME="NICKNAME: ";
    private  final String NAME="NAME: ";
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
}
