import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    final String regex = "^(.+)@(.+)$";

    Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);

    //checks that it is a valid email by using regular expressions
    public boolean Validate(String stringToValidate) {
        Matcher matcher = pattern.matcher(stringToValidate);
        return matcher.find();
    }



}
