package examples;

public class Decision {
  public static void main(String[] args) {

    char choice = 'a';

    switch (choice) {
      case 'a':         // fall through to next case
      case 'A':
        System.out.println("Adding");
        break;
      case 'd':         // fall through to next case
      case 'D':
        System.out.println("Deleting");
        break;
      case 'q':         // fall through to next case
      case 'Q':
        System.out.println("Quitting");
        break;
      default:
        System.out.println("Invalid selection");
        break;
    }
  }
}
