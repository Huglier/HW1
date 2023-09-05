public class Main {
    public static void main(String[] args) {
        try {
            CreatePersonalAccount.person("jhjh", "fdf", "fdf");
        }
        catch (WrongLoginException e){
            System.out.println("WrongLoginException");
        }
        catch (WrongPasswordException e){
            System.out.println("WrongPasswordException");
        }
    }
}