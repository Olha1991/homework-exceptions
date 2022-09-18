public class Main {
    public static void main(String[] args) {

        User user = new User("Olha_1234", "Qwer_1234", "Qwer_1234");

        System.out.println(User.checkUser(user.getLogin(), user.getPassword(), user.getConfirmPassword()));
    }

}