import java.util.ArrayList;

public class ExceptionExample {


    String correctString = "3";
    String incorrectString = "abc";
    
    String textToTranslate = "Helo";
    String properText = "Hello!";
    String properTranslation = "Hola!";
    
    public void HandleException() {
        
    ArrayList<System> myArray = new ArrayList<>();    
    
    try {
        int correct = Integer.parseInt(correctString);
        int incorrect = Integer.parseInt(incorrectString);
    }
    
    catch(NumberFormatException ex) {

            System.err.println("Invalid Integer Format: " + ex.getMessage() );
            System.exit(1);
        }
    finally {
        System.out.println("we are done!");
        }

    }

    public String TranslateText() throws UnknownWordException {
        if(!textToTranslate.equals(properText))  {
                throw new UnknownWordException(textToTranslate);
        }
        return properTranslation;
    }
}
