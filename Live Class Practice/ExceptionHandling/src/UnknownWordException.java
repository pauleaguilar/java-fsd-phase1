public class UnknownWordException extends RuntimeException {


    UnknownWordException(String word) {
        super("Word not found: " + word);

    }


}


