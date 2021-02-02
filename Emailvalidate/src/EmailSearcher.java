public class EmailSearcher {
    String[] email;
    public EmailSearcher(String[] emails){
       email = emails;

    //constructor
    }

        //checks that the user email wants to look for, is inside the array
        public boolean SearchEmail(String emailtoSearch){
            for(String email: email) {
                if(email.equals(emailtoSearch)) return true;
            }
            return false;
        }

}
