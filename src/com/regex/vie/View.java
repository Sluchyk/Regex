package com.regex.vie;
import com.regex.controller.Container;

import java.util.Locale;
import java.util.ResourceBundle;
public class View implements Container {

    public void printMessage (String message){
        System.out.println(message);
    }
          static String BANDLE_MESSAGES_NAME="message";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                   BANDLE_MESSAGES_NAME, new Locale("ua", "UA"));
  // new Locale("en"));
    public String concatenationString (String... message){
        StringBuilder concatString = new StringBuilder();
        for (String v : message){
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
    public void printWrongStringInput(String message) {
        printMessage(concatenationString(bundle.getString(WRONG_INPUT_DATA),bundle.getString(INPUT_STRING_DATA),bundle.getString(message)));
    }
    public void printStringInput(String message) {
        printMessage(concatenationString(bundle.getString(INPUT_STRING_DATA),bundle.getString(message)));
    }

}
