import java.util.Scanner;

public class TextAdventureGame
{
  private static final String OPENING_DIALOG = "Welcome to Text Adventure! Select one: \n A. Create new game \n B. Load existing game";
  private static final String REQUEST_VALID_INPUT = "Please enter valid input: ";
  private static Scanner in;
  private static final String[] initOptions = {"a", "b"};

  private static void startApplication()
  {
    System.out.println(OPENING_DIALOG);
    String input = getValidInput(initOptions);
    if(input.equals(initOptions[0]))
    {
      System.out.println("You chose to create a new game!");
    }
    else
    {
      System.out.println("You chose to load an existing game!");
    }
  }

  private static String getValidInput(String[] options)
  {
    boolean validInput = false;
    while(in.hasNext() && !validInput)
    {
      String input = in.next().toLowerCase(); //Sets default case as lowercase for comparison.
      //Tests each option in the array
      for(String option: options)
      {
        if(input.equals(option))
        {
          validInput = true;
          return input;
        }
      }
      //Requests valid input
      System.out.print(REQUEST_VALID_INPUT);
      for(int i = 0; i < options.length; i++)
      {
        String option;
        if(i != options.length - 1)//Checks to see if i is last index
        {
          option = options[i] + ", ";
        }
        else
        {
          option = "or " + options[i] + ".";
        }
        System.out.print(option);
      }
      //Moves Scanner to next line of input.
      in.nextLine();
      }
      return null;
    }

  public static void main(String[] args)
  {
    in = new Scanner(System.in);
    startApplication();
  }
}
