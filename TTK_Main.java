import java.util.Scanner;

public class TTK_Main {
  private static TTK_Create create = new TTK_Create();
  private static Scanner scan = new Scanner(System.in);
  private static boolean loggedIn = false;
  private static boolean terminateSoftware = false;

  private static void logoutUser(){
    loggedIn = false;
    System.out.println("Logged out.\n");
  }
  private static void loginUser(){
    TTK_Login  login  = new TTK_Login(create.getUserbase());
    System.out.print("Select username: ");
    String username = scan.next();
    System.out.print("Select password: ");
    String password = scan.next();
    if (login.attemptLogin(username, password)) {
      loggedIn = true;
      welcomeUser(username);
    } else {
      System.out.println("Failed. \n");
    }
  }
  private static void welcomeUser(String user){
    System.out.println("Welcome, "+user+"!\n");
  }
  private static void createUser(){
    System.out.print("Select username: ");
    String username = scan.next();
    System.out.print("Select password: ");
    String password = scan.next();
    create.createUser(username, password);
    System.out.print("User <"+username+"> created!\n");
  }
  private static void printMenu(){
    if(loggedIn) {
      System.out.printf("%3d%s", 1,".Logout user\n");
      System.out.printf("%3d%s", 3,".Terminate software\n");
    } else {
      System.out.printf("%3d%s", 1,".Login user\n");
      System.out.printf("%3d%s", 2,".Create user\n");
      System.out.printf("%3d%s", 3,".Terminate software\n");
    }
  }
  private static void handleSelection(int selection){
    switch(selection){
      case 1:
        if(loggedIn){ logoutUser(); } else { loginUser(); }
        break;
      case 2:
        if(!loggedIn){ createUser(); }
        break;
      case 3:
        terminateSoftware = true;
        break;
      default:
        System.out.println("D");
        break;
    }
  }

  public static void main(String[] args){
    while(!terminateSoftware){
      printMenu();
      System.out.print("Select action: ");
      int selection = scan.nextInt();
      handleSelection(selection);
    }
    scan.close();
  }
}
