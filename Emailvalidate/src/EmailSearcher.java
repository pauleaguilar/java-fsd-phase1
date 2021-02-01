public class EmailSearcher {

     String[] emails = {"paul@google.com" , "paul@microsoft.com " , "paul@reddit.com " , "paul@facebook.com" ,
"paul@apple.com"};



        public boolean SearchEmail(String emailtoSearch){
            for(String email: emails) {
                if(email.equals(emailtoSearch)) return true;
            }
            return false;
        }

}
