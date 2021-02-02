import java.util.Scanner;
public class Emailvalidate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi, Welcome. Please input the emails, separated by a space in order for it to work correctly");
        System.out.println("Example: paul@yahoo.com paul@hcl.com paul@simplilearn.com\n");
        String email_string = scan.nextLine();
        System.out.println();
        String[] user_emails = email_string.split("\\s");


        //checks that the user has at least one argument
        if(user_emails.length < 1 || email_string.isEmpty()) {
            System.out.println("There isn't at least one email, program will exit");
            System.exit(0);
        }

        System.out.println("Enter the email you want to search for: ");
        String email = scan.next();


        System.out.println("The email you want to search is " + email);
        scan.close();

        EmailValidator emailValidator = new EmailValidator();
        System.out.println(emailValidator.Validate(email) ? "That is valid email." : "The email is not valid.");
        EmailSearcher emailSearcher = new EmailSearcher(user_emails);

        System.out.println(emailSearcher.SearchEmail(email) ? "found it inside the following email list you provided: " : "didn't find it inside the email list.");
        System.out.println(email_string);

    }




}
