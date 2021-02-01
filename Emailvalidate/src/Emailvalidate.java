public class Emailvalidate {

    public static void main(String[] args) {
        System.out.println();

        //checks that the user has at least one argument
        if(args.length < 1) {
            System.out.println("Usage: Emailvalidate email id");
            System.exit(0);
        }

        String email = args[0];


        System.out.println(email);

        EmailValidator emailValidator = new EmailValidator();
        System.out.println(emailValidator.Validate(email) ? "valid email" : "email is not valid");
        EmailSearcher emailSearcher = new EmailSearcher();

        System.out.println(emailSearcher.SearchEmail(email) ? "found it" : "didn't find it");
    }




}
