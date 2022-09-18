public class User {
    private String login;
    private String password;
    private String confirmPassword;

    public User(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    static boolean  checkUser(String login, String password, String confirmPassword){
        boolean loginMust = login.matches("^[a-zA-Z0-9_]+$");
        boolean passwordMust = password.matches("^[a-zA-Z0-9_]+$");
        boolean confirmPasswordMust = confirmPassword.equals(password);
        if (!loginMust || login.length() >= 20) {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException e) {
                System.out.println("Некоректный логин!");
            }
        } else if (!passwordMust || password.length() > 20) {
            try {
                throw new WrongPasswordException();
            } catch (WrongPasswordException e) {
                System.out.println("Некоректный пороль!");
            }
        }else if(!confirmPasswordMust) {
            try {
                throw new WrongPasswordException();
            }catch (WrongPasswordException e){
                System.out.println("Password и confirmPassword должны быть одинаковы!");
            }
        } else System.out.println("Пользователь зарегистрирован!\u273F");

        return true;
    }

}

