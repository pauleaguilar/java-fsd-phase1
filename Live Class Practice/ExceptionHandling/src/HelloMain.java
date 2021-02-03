public class HelloMain {

    public static void main(String[] args) {
        ExceptionExample exceptionExample = new ExceptionExample();
        exceptionExample.HandleException();


        try {
            exceptionExample.TranslateText();
        }
        catch (UnknownWordException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
