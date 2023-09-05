public class CreatePersonalAccount {
   public static void person(String login, String password, String confirmPassword ) {
       if (!login.matches("[a-zA-Z0-9_]+")){
           throw new WrongLoginException();
       }
       if (login.length()>20){
           throw new WrongLoginException();
       }
       if (password.length()>20){
           throw new WrongPasswordException();
       }
       if (!password.equals(confirmPassword)){
           throw new WrongPasswordException();
       }

    }
}
