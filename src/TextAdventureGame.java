public class TextAdventureGame
{
  private final String TITLE_REQUEST_STRING = "Enter a title for your Text Adventure";
  
  private void collectGameInput(Scanner in)
  {
    System.out.println(TITLE_REQUEST_STRING);

  }

  public void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    collectGameInput(in);
  }
}
