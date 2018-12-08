public class TTK_Login {
  public static TTK_Users users;
  public TTK_Login(TTK_Users existingUsers){
    users = existingUsers;
  }
  public static boolean attemptLogin(String username, String password){
    for(int i=0;i<users.getUsers().size();i++){
      if((users.getUsers().get(i).getUsername() == username) &&
         (users.getUsers().get(i).getPassowrd() == password)){
           return true;
         }
    }
    return false;
  }
}
