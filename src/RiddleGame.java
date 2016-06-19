import java.util.ArrayList;

public class RiddleGame
{
  private String intro;
  private ArrayList<Checkpoint> gameCheckpoints;

  public RiddleGame(String i){
    this.intro = i;
    this.gameCheckpoints = new ArrayList<Checkpoint>();
  }

  private void printIntro()
  {
    System.out.println(this.intro);
  }

  public static void main(String[] args)
  {
    String intro = "You\'re walking through the woods when you see two guards standing before two doors. \nOne is dressed all in red, the other all in blue. \nA sign is posted in front of them, reading \n\"Of these doors before you, one leads to heaven, the other to hell.\n You must pass through the guards to gain entry. \nBut be warned!\nOne guard speaks only truth, and the other nothing but lies.\nYou may ask one guard one question.\"";
    RiddleGame game1 = new RiddleGame(intro);
    game1.printIntro();

    String question1 = "What do you do?";
    Checkpoint checkpoint1 = new Checkpoint(question1);
    checkpoint1.add("Approach red guard.");
    checkpoint1.add("Approach blue guard.");
    checkpoint1.add("Dip, motherfucker. I ain't got time for this shit.");
    checkpoint1.printQuestion();
    checkpoint1.printSteps();



  }


}