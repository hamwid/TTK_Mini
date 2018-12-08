import java.util.ArrayList;

public class TTK_Users {
  public static ArrayList<User> users = new ArrayList<User>();

  public void addUser(String username, String password){
    User user = new User();
    user.setUsername(username);
    user.setPassowrd(password);
    users.add(user);
  }

  private class User {
    private String username;
    private String password;

    public void setUsername(String input){
      username = input;
    }
    public void setPassowrd(String input){
      password = input;
    }
    public String getUsername(String input){
      return username;
    }
    public String getPassowrd(String input){
      return password;
    }
  }

}
