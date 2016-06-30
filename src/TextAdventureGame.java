public class TextAdventureGame
{
  private static final String OPENING_DIALOG = "Welcome to Text Adventure! Select one: \n A. Create new game \n B. Load existing game";

  private static void startApplication(Scanner in)
  {
    System.out.println(OPENING_DIALOG);
  }

  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    startApplication(in);
  }
}
