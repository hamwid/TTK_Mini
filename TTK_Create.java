public class TTK_Create {
  public static TTK_Users users = new TTK_Users();
  public void createUser(String username, String password){
    users.addUser(username, password);
  }
  public TTK_Users getUserbase(){
    return users;
  }
}
