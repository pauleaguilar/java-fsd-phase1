import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    final String regex = "^(.+)@(.+)$";

    Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);

    public boolean Validate(String stringToValidate) {
        Matcher matcher = pattern.matcher(stringToValidate);
        return matcher.find();
    }



}
