public class ExceptionExample {



    public void HandleException() {

        String correctString = "3";
        String incorrectString = "abc";

    try {
        int correct = Integer.parseInt(correctString);

        int incorrect = Integer.parseInt(incorrectString);
    }
    catch(NumberFormatException ex) {

            System.err.println("Invalid Integer Format: " + ex.getMessage());

        }









    }
}
